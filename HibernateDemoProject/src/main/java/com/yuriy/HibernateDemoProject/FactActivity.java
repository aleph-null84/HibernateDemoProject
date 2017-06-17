package com.yuriy.HibernateDemoProject;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class FactActivity {

	private int oact_id;
	private Timestamp oact_month_date;
	private int oact_reg_status;
	private BigDecimal oact_active;
	private BigDecimal oact_new;
	private BigDecimal oact_return;
	private BigDecimal oact_churn;

	public FactActivity() {
	}

	public FactActivity(int oact_id, Timestamp oact_month_date, int oact_reg_status, BigDecimal oact_active,
			BigDecimal oact_new, BigDecimal oact_return, BigDecimal oact_churn) {
		this.oact_id = oact_id;
		this.oact_month_date = oact_month_date;
		this.oact_reg_status = oact_reg_status;
		this.oact_active = oact_active;
		this.oact_new = oact_new;
		this.oact_return = oact_return;
		this.oact_churn = oact_churn;
	}

	public int getOact_id() {
		return oact_id;
	}

	public void setOact_id(int oact_id) {
		this.oact_id = oact_id;
	}

	public Timestamp getOact_month_date() {
		return oact_month_date;
	}

	public void setOact_month_date(Timestamp oact_month_date) {
		this.oact_month_date = oact_month_date;
	}

	public int getOact_reg_status() {
		return oact_reg_status;
	}

	public void setOact_reg_status(int oact_reg_status) {
		this.oact_reg_status = oact_reg_status;
	}

	public BigDecimal getOact_active() {
		return oact_active;
	}

	public void setOact_active(BigDecimal oact_active) {
		this.oact_active = oact_active;
	}

	public BigDecimal getOact_new() {
		return oact_new;
	}

	public void setOact_new(BigDecimal oact_new) {
		this.oact_new = oact_new;
	}

	public BigDecimal getOact_return() {
		return oact_return;
	}

	public void setOact_return(BigDecimal oact_return) {
		this.oact_return = oact_return;
	}

	public BigDecimal getOact_churn() {
		return oact_churn;
	}

	public void setOact_churn(BigDecimal oact_churn) {
		this.oact_churn = oact_churn;
	}
}
