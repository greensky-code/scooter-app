package com.globant.tc.scooter.accounts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class AddAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "balance")
	private Double balance;
	@Column(name = "mercado_pago_accpunt")
	private String mercadoPagoAccpunt;
	@Column(name = "active")
	private boolean active;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public String getMercadoPagoAccpunt() {
		return mercadoPagoAccpunt;
	}
	public void setMercadoPagoAccpunt(String mercadoPagoAccpunt) {
		this.mercadoPagoAccpunt = mercadoPagoAccpunt;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}

}
