package com.yuriy.HibernateDemoProject;

import java.util.List; 
import java.util.Iterator; 

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
	private static SessionFactory factory;
	
    public static void main( String[] args )
    {
        System.out.println( "Hibernate Demo Project" );
        
        Session session = null;
        Transaction tx = null;
        
        try{
            factory = new Configuration().configure().buildSessionFactory();
            session = factory.openSession();
      
            try{
                tx = session.beginTransaction();
                @SuppressWarnings("rawtypes")
				List ativityList = session.createQuery("FROM com.yuriy.HibernateDemoProject.FactActivity").list(); 
                for ( @SuppressWarnings("rawtypes")Iterator iterator = ativityList.iterator(); iterator.hasNext();){
                   FactActivity activity = (FactActivity) iterator.next(); 
                   System.out.print("Date Time: " + activity.getOact_month_date()); 
                   System.out.print("  Active: " + activity.getOact_active()); 
                   System.out.println("  Churn: " + activity.getOact_churn()); 
                }
                tx.commit();
             }catch (HibernateException e) {
                if (tx != null) tx.rollback();
                e.printStackTrace(); 
             }finally {
                session.close(); 
             }
            
            
         }catch (Throwable ex) { 
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex); 
         }finally{
        	session.close(); 
         }
    }
}
