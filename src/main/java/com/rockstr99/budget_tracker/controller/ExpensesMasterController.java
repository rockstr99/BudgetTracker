package com.rockstr99.budget_tracker.controller;

import com.rockstr99.budget_tracker.dao.ExpenseDao;
import com.rockstr99.budget_tracker.dao.SourceDao;
import com.rockstr99.budget_tracker.entity.Expense;
import com.rockstr99.budget_tracker.entity.Source;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/expenses")
public class ExpensesMasterController {

    @Autowired
    SourceDao sourceDao;

    @Autowired
    ExpenseDao expenseDao;

    UnaryOperator<String> getJspName = jspName -> "expenseJSPs/" + jspName;

    @GetMapping("/addNewExpenses")
    public String addNewExpenses(Model model) {
        List<Source> sources = (List<Source>) sourceDao.getAllSources();
        List<String> availableSources = sources.stream().map(source -> source.getSourceCode()).collect(Collectors.toList());
        model.addAttribute("expense", new Expense());
        model.addAttribute("sources", availableSources);
        return getJspName.apply("addNewExpense");
    }

    @PostMapping("/submitNewExpense")
    public String submitNewExpense(@ModelAttribute Expense expense, Model model){
        expenseDao.addNewExpense(expense);
        model.addAttribute("expenses", expenseDao.getAllExpenses());
        return getJspName.apply("getAllExpenses");
    }
}
