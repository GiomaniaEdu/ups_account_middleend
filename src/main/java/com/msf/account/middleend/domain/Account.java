package com.msf.account.middleend.domain;

import lombok.Data;

@Data
public class Account {

    private Integer id;

    private String numberAccount;

    private Integer currencyType;

    private Number amount;

    private Integer customerId;

}
