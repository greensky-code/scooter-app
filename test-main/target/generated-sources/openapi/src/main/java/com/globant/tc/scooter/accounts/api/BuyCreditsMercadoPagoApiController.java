package com.globant.tc.scooter.accounts.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-03-26T04:23:54.526+05:30[Asia/Calcutta]")
@Controller
@RequestMapping("${openapi.accounts.base-path:/accounts}")
public class BuyCreditsMercadoPagoApiController implements BuyCreditsMercadoPagoApi {

    private final BuyCreditsMercadoPagoApiDelegate delegate;

    public BuyCreditsMercadoPagoApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) BuyCreditsMercadoPagoApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new BuyCreditsMercadoPagoApiDelegate() {});
    }

    @Override
    public BuyCreditsMercadoPagoApiDelegate getDelegate() {
        return delegate;
    }

}
