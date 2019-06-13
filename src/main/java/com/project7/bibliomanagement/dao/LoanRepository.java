package com.project7.bibliomanagement.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project7.bibliomanagement.entities.Loan;

@Repository
public interface LoanRepository extends CrudRepository<Loan, Long> {

}
