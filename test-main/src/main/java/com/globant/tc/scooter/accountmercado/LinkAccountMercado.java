package com.globant.tc.scooter.accountmercado;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account_mercado")
public class LinkAccountMercado {

	@Id
	@Column(name = "acount_id")
	private Integer accountId;
	@Column(name = "mercado_id")
	private Integer mercadoId;
	
	public LinkAccountMercado() {
		
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getMercadoId() {
		return mercadoId;
	}

	public void setMercadoId(Integer mercadoId) {
		this.mercadoId = mercadoId;
	}
	
}
