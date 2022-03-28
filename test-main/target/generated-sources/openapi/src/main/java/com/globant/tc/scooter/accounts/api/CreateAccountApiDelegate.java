package com.globant.tc.scooter.accounts.api;

import com.globant.tc.scooter.accounts.model.InlineObject;
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
 * A delegate to be called by the {@link CreateAccountApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-26T04:23:54.526+05:30[Asia/Calcutta]")
public interface CreateAccountApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /createAccount : Create an Account and registered it to an user
     *
     * @param inlineObject  (required)
     * @return Operation success (status code 200)
     *         or  (status code 503)
     * @see CreateAccountApi#createAccountPost
     */
    default ResponseEntity<Void> createAccountPost(InlineObject inlineObject) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
