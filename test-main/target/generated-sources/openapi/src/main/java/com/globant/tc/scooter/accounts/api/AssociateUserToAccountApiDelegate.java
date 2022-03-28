package com.globant.tc.scooter.accounts.api;

import com.globant.tc.scooter.accounts.model.InlineObject2;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link AssociateUserToAccountApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-26T04:23:54.526+05:30[Asia/Calcutta]")
public interface AssociateUserToAccountApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /associateUserToAccount : Associate User With An Account
     *
     * @param inlineObject2  (required)
     * @return Operation success (status code 200)
     * @see AssociateUserToAccountApi#associateUserToAccountPost
     */
    default ResponseEntity<Void> associateUserToAccountPost(InlineObject2 inlineObject2) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
