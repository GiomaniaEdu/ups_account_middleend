package com.msf.account.middleend.service.impl;

import com.msf.account.middleend.client.AccountServiceClient;
import com.msf.account.middleend.service.IAccountService;
import com.msf.account.middleend.domain.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements IAccountService {

    private final AccountServiceClient customerServiceClient;


    @Override
    public Account createCustomer(String xCmClientRequestId, String xCmClientUserAgent, Account customer) {
        return customerServiceClient
                .createCustomer(xCmClientRequestId,xCmClientUserAgent,customer).getBody();
    }


}
