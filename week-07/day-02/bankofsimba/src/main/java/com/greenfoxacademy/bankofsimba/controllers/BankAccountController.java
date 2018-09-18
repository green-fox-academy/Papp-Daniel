package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class BankAccountController {

    List<BankAccount> accountList = new ArrayList<>();

    @RequestMapping("/show")
    public String formtesting(Model model){

        accountList.add(new BankAccount("Simba",2000,"lion",true,true));
        accountList.add(new BankAccount("Zembra",2000,"zebra",false,true));
        accountList.add(new BankAccount("Zordon",500,"lion",false,false));
        accountList.add(new BankAccount("Zazu",1000,"hornbill",false,true));
        accountList.add(new BankAccount("Timo",2000,"meerkat",false,false));
        model.addAttribute("bankaccountList", accountList);

        return "show";
    }
}
