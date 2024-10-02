package com.msf.account.middleend.client;

import com.msf.account.middleend.domain.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "account-service")
public interface AccountServiceClient {

    @PostMapping("/api/v1/accounts")
    ResponseEntity<Account> createCustomer(@RequestHeader(value = "x-cm-client-request-id", required = true) String xCmClientRequestId,
                                           @RequestHeader(value = "x-cm-client-user-agent", required = true) String xCmClientUserAgent,
                                           @RequestBody Account customer);
}