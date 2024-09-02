package com.anweb.finanace.loan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anweb.finanace.loan.entity.LoanForm;

@Repository
public interface LoanformRepository extends JpaRepository<LoanForm, Integer> {

}
