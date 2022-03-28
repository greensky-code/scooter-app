package com.globant.tc.scooter.accounts.api;

import com.globant.tc.scooter.accounts.model.InlineObject1;
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
 * A delegate to be called by the {@link AddCreditsToAccountApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-26T04:23:54.526+05:30[Asia/Calcutta]")
public interface AddCreditsToAccountApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /addCreditsToAccount : Add Credits To Account.
     * Optional extended description in CommonMark or HTML.
     *
     * @param inlineObject1  (required)
     * @return Operation success (status code 200)
     * @see AddCreditsToAccountApi#addCreditsToAccountPost
     */
    default ResponseEntity<Void> addCreditsToAccountPost(InlineObject1 inlineObject1) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
