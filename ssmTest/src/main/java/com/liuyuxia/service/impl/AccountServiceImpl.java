package com.liuyuxia.service.impl;

import com.liuyuxia.dao.AccountDao;
import com.liuyuxia.domain.Account;
import com.liuyuxia.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("service findAll!");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {

        System.out.println("saveAccount!");
        accountDao.saveAccount(account);
    }
}
