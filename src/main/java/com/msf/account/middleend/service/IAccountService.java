package com.msf.account.middleend.service;

import com.msf.account.middleend.domain.Account;

public interface IAccountService {

    Account createCustomer(String xCmClientRequestId, String xCmClientUserAgent, Account customer);
}
