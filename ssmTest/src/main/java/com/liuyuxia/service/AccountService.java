package com.liuyuxia.service;

import com.liuyuxia.domain.Account;

import java.util.List;

public interface AccountService {
    public List<Account> findAll();
    public void saveAccount(Account account);
}
