package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.LoanApplicationModel;

public interface LoanApplicationModelRepo extends JpaRepository<LoanApplicationModel, Integer> {

}

