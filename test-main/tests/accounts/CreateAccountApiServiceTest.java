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
import com.globant.tc.scooter.associateaccount.UserAccountRepository;

@SpringBootTest
public class CreateAccountApiServiceTest {

    @InjectMocks
    private CreateAccountApiService accountService;

    @Mock
    private UserAccountRepository userAccountRepo;

    @Mock
	AccountRepository accountRepo;
    
    @Mock
    AddAccount addAccount;
    
    @Test
    public void testCreateAccount() {
    	InlineObject2 inlineObject = new InlineObject2();
    	inlineObject.setAccountId(1);
    	inlineObject.setUserId(2);
    	when(accountRepo.findById(inlineObject.getAccountId())).thenReturn(Optional.of(addAccount));
       assertEquals(new ResponseEntity<>(HttpStatus.OK), accountService.associateUserToAccountPost(inlineObject));
    }
    
}
