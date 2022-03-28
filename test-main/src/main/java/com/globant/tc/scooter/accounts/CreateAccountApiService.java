package com.globant.tc.scooter.accounts;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.globant.tc.scooter.accounts.api.AssociateUserToAccountApiDelegate;
import com.globant.tc.scooter.accounts.model.InlineObject2;
import com.globant.tc.scooter.associateaccount.AssociateAccount;
import com.globant.tc.scooter.associateaccount.UserAccountRepository;
import com.globant.tc.scooter.accounts.AccountRepository;

@Service
public class CreateAccountApiService implements AssociateUserToAccountApiDelegate {

	@Autowired
	UserAccountRepository userAccountRepo;
	@Autowired
	AccountRepository accountRepo;

	@Override
	public ResponseEntity<Void> associateUserToAccountPost(InlineObject2 inlineObject) {
		Optional<AddAccount> account = accountRepo.findById(inlineObject.getAccountId());
		if(account.isPresent()) {
			AssociateAccount associateAccount = new AssociateAccount();
			associateAccount.setAccountId(inlineObject.getAccountId());
			associateAccount.setUserId(inlineObject.getUserId());
			userAccountRepo.save(associateAccount);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
		}    
	}

}
