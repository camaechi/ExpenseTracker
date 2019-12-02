package com.example.amaechi.Expense.Tracker.repository;

import org.springframework.data.jpa.repository.*;

import com.example.amaechi.Expense.Tracker.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	Category findByName(String name);

}
