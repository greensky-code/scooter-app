package com.globant.tc.scooter.associateaccount;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountRepository extends JpaRepository<AssociateAccount, Integer> {
	public AssociateAccount findByAccountId(Integer accountId);

}
