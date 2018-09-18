package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BankAccountFormController {

    @GetMapping("/bankAccountForm")
    public String formBank(Model model) {
        model.addAttribute("bankaccount",new BankAccount());
        return "bankAccountForm";
    }

    @PostMapping("/bankAccountForm")
    public String createAccount (BankAccount bankAccount, Model model) {
        model.addAttribute("account",bankAccount);
        return "show";
    }
}
