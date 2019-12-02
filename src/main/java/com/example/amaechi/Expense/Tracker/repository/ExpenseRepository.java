package com.example.amaechi.Expense.Tracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.amaechi.Expense.Tracker.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {
	
}
