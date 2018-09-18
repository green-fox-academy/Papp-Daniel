package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class BankAccountController {

    List<BankAccount> accountList = new ArrayList<>();
    AtomicLong atomicLong = new AtomicLong();

    @RequestMapping("/show")
    public String formtesting(Model model){

        accountList.add(new BankAccount("Simba",2000,"lion"));
        accountList.add(new BankAccount("Zembra",2000,"zebra"));
        accountList.add(new BankAccount("Zordon",500,"lion"));
        accountList.add(new BankAccount("Zazu",1000,"hornbill"));
        accountList.add(new BankAccount("Zembra",2000,"meerkat"));
        model.addAttribute("bankaccountList", accountList);

        return "show";
    }
}
