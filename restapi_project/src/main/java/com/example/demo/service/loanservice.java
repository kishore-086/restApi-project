package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.LoanApplicationModel;
import com.example.demo.Model.UserModel;
import com.example.demo.Repository.LoanApplicationModelRepo;
import com.example.demo.Repository.UserModelRepo;

@Service
public class loanservice {
	@Autowired
	public LoanApplicationModelRepo ls;
	public LoanApplicationModel save(LoanApplicationModel m)
	{
		return ls.save(m);
	}
	public List<LoanApplicationModel> getloan(int user)
	{
		return ls.findAll();
	}
	public LoanApplicationModel update(LoanApplicationModel m)
	{
		return ls.saveAndFlush(m);
	}
	public void delete(int m)
	{
		ls.deleteById(m);
	}
	@Autowired
	public UserModelRepo lr;
	public UserModel save1(UserModel m)
	{
		return lr.save(m);
	}
	public List<UserModel> getloan1(int user)
	{
		return lr.findAll();
	}
	public UserModel update1(UserModel m)
	{
		return lr.saveAndFlush(m);
	}
	public void delete1(int c)
	{
		ls.deleteById(c);
	}

}
