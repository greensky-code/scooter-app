package com.globant.tc.scooter.associateaccount;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accounts_users")
public class AssociateAccount {
	
	@Id
	@Column(name = "id_account")
	private Integer accountId;
	@Column(name = "id_user")
	private Integer userId;
	
	public AssociateAccount() {
		
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
