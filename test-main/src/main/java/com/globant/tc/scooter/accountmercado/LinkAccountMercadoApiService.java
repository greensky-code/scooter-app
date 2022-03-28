package com.globant.tc.scooter.accountmercado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.globant.tc.scooter.accounts.api.LinkAccountToMercadoPagoApiDelegate;
import com.globant.tc.scooter.accounts.model.InlineObject3;
import com.globant.tc.scooter.associateaccount.AssociateAccount;
import com.globant.tc.scooter.associateaccount.UserAccountRepository;




@Service
public class LinkAccountMercadoApiService implements LinkAccountToMercadoPagoApiDelegate {

	@Autowired
	UserAccountRepository  userAccountRepo;
	@Autowired
	AccountMercadoRepository accountMercadoRepo;

	@Override
	public ResponseEntity<Void> linkAccountToMercadoPagoPost(InlineObject3 inlineObject) {
		AssociateAccount associateAccount = userAccountRepo.findByAccountId(inlineObject.getAccountId());
		if(associateAccount != null) {
			LinkAccountMercado accountMercado = new LinkAccountMercado();
			accountMercado.setAccountId(inlineObject.getAccountId());
			accountMercado.setMercadoId(inlineObject.getMercadoPagoId());
			accountMercadoRepo.save(accountMercado);
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
		}

	}
}
