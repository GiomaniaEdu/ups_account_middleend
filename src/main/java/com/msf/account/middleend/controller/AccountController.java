package com.msf.account.middleend.controller;

import com.msf.account.middleend.service.IAccountService;
import com.msf.account.middleend.domain.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class AccountController {

    private final IAccountService iCustomerService;

    @PostMapping()
    @CrossOrigin
    public ResponseEntity<Account> createCustomer(@RequestHeader(value = "x-cm-client-request-id", required = true) String xCmClientRequestId,
                                                  @RequestHeader(value = "x-cm-client-user-agent", required = true) String xCmClientUserAgent,
                                                  @RequestBody Account customer){
        return new ResponseEntity<>(iCustomerService.createCustomer(xCmClientRequestId, xCmClientUserAgent,customer), HttpStatus.CREATED);
    }
}
