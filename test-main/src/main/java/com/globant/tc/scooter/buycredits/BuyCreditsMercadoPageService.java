package com.globant.tc.scooter.buycredits;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.globant.tc.scooter.accounts.AccountRepository;
import com.globant.tc.scooter.accounts.AddAccount;
import com.globant.tc.scooter.accounts.api.BuyCreditsMercadoPagoApiDelegate;
import com.globant.tc.scooter.accounts.model.InlineObject4;
import com.globant.tc.scooter.associateaccount.AssociateAccount;
import com.globant.tc.scooter.associateaccount.UserAccountRepository;

@Service
public class BuyCreditsMercadoPageService implements BuyCreditsMercadoPagoApiDelegate {

	@Autowired
	UserAccountRepository userAccountRepo;
	@Autowired
	AccountRepository accountRepo;

	@Override
	public ResponseEntity<Void> buyCreditsMercadoPagoPost(InlineObject4 inlineObject) {
		AssociateAccount associateAccount = userAccountRepo.findByAccountId(inlineObject.getAccountId());
		if(associateAccount != null) {
			AddAccount account = new AddAccount();
			account.setId(inlineObject.getAccountId());
			account.setActive(true);
			account.setBalance(inlineObject.getCredits());
			accountRepo.save(account);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
		}
	}

}
