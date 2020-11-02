package com.liuyuxia.controller;


import com.liuyuxia.domain.Account;
import com.liuyuxia.service.AccountService;
import com.liuyuxia.service.impl.AccountServiceImpl;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private  AccountService accountService;

    @RequestMapping("/findAll")
        public String findAll(Model model){
        System.out.println("表现层 findAll!");
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
        }
    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("save!");
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
        return;
    }
}
