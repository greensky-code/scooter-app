package com.globant.tc.scooter.accounts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.globant.tc.scooter.accounts.AccountRepository;
import com.globant.tc.scooter.accounts.api.CreateAccountApiDelegate;
import com.globant.tc.scooter.accounts.model.InlineObject;

@Service
public class AssociateUserAccountApiService implements CreateAccountApiDelegate {

	@Autowired
	AccountRepository accountRepo;

	@Override
	public ResponseEntity<Void> createAccountPost(InlineObject inlineObject) {
		if(inlineObject.getUserId() != null) {
			AddAccount addAccount = new AddAccount();
			addAccount.setBalance(inlineObject.getAccount().getBalance());
			addAccount.setActive(inlineObject.getAccount().getActive());
			accountRepo.save(addAccount);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
		}
	}

}
