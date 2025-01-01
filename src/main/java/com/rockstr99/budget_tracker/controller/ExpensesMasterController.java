package com.rockstr99.budget_tracker.controller;

import com.rockstr99.budget_tracker.entity.Expense;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/expenses")
public class ExpensesMasterController {

    public String addNewExpenses(Model model){
        model.addAttribute("expense", new Expense());
        return "";
    }
}
