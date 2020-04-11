package com.javafreakers.violatesolidprinciple.main;

import com.javafreakers.violatesolidprinciple.entity.Account;
import com.javafreakers.violatesolidprinciple.entity.InternationalAccount;
import com.javafreakers.violatesolidprinciple.entity.LocalAccount;
import com.javafreakers.violatesolidprinciple.entity.SchoolAccount;

import java.util.Arrays;
import java.util.List;

public class ViolatingISP {
    public static void main(String[] args) {
        /**
         * As the client does not know the implementation they use public methods which are not implemented and end with IllegalArgumentException
         */
        List<Account> accounts = Arrays.asList(new SchoolAccount(), new InternationalAccount(), new LocalAccount());
        accounts.forEach(account -> account.internationalTransfer(500));
    }
}
