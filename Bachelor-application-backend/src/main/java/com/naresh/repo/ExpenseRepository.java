package com.naresh.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.naresh.model.Expense;

public interface ExpenseRepository extends MongoRepository<Expense, String>{

}
