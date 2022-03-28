import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import com.globant.tc.scooter.accounts.AccountRepository;
import com.globant.tc.scooter.accounts.AddAccount;
import com.globant.tc.scooter.accounts.CreateAccountApiService;
import com.globant.tc.scooter.accounts.model.InlineObject2;
import com.globant.tc.scooter.accounts.model.InlineObject4;
import com.globant.tc.scooter.associateaccount.UserAccountRepository;
import com.globant.tc.scooter.buycredits.BuyCreditsMercadoPageService;

@SpringBootTest
public class BuyCreditMercadoPagoServiceTest {


    @InjectMocks
    private BuyCreditsMercadoPageService buyCreditService;

    @Mock
    private UserAccountRepository userAccountRepo;

    @Mock
	AccountRepository accountRepo;
    
    @Mock
    AssociateAccount associateAccount;
    
    @Test
    public void testBuyCredit() {
    	InlineObject4 inlineObject = new InlineObject4();
    	inlineObject.setAccountId(1);
    	inlineObject.setCredits(10.0);
    	inlineObject.set
    	when(userAccountRepo.findByAccountId(inlineObject.getAccountId())).thenReturn(Optional.of(associateAccount));
        assertEquals(new ResponseEntity<>(HttpStatus.OK), buyCreditService.buyCreditsMercadoPagoPost(inlineObject));
    }
    


}
