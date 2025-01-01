package com.rockstr99.budget_tracker.dao;

import com.rockstr99.budget_tracker.entity.Expense;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ExpenseDao {
    List<Expense> expenses = new ArrayList<>();

    public List<?> getAllExpenses() {
        return expenses;
    }

    public boolean addNewExpense(Expense expense) {
        return expenses.add(expense);
    }

}
