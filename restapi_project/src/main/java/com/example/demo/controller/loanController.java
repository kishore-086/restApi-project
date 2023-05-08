package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.LoanApplicationModel;
import com.example.demo.Model.UserModel;
import com.example.demo.service.loanservice;

@RestController
@RequestMapping("/login")
public class loanController {
	@Autowired
	public loanservice serve;
	@PostMapping("/")
	public LoanApplicationModel saveinfo(@RequestBody LoanApplicationModel s)
	{
		return serve.save(s);
	}
	@GetMapping("/getProfile")
	public List<LoanApplicationModel> getInfo(int a)
	{
		return serve.getloan(a);
	}
	@GetMapping("/viewLoan/{user}")
	public List<LoanApplicationModel> getInfo1(@PathVariable("user")int user)
	{
		return serve.getloan(user);
	}
	@PutMapping("/put")
	public LoanApplicationModel updtaeinfo(@RequestBody LoanApplicationModel q)
	{
		return serve.update(q);
	}
	@DeleteMapping("/delete")
	public String deleteinfo(int q)
	{
		serve.delete(q);
		return "Deleted";
	}
	@Autowired
	public loanservice serve1;
	@PostMapping("/user")
	public UserModel saveinfo1(@RequestBody UserModel s)
	{
		return serve1.save1(s);
	}
	@GetMapping("/getProfileuser")
	public List<UserModel> getInfo11(int a)
	{
		return serve1.getloan1(a);
	}
	@GetMapping("/viewLoanuser/{user}")
	public List<UserModel> getdetails(@PathVariable("user")int user)
	{
		return serve1.getloan1(user);
	}
	@PutMapping("/putuser")
	public UserModel updtaeinfo1(@RequestBody UserModel q)
	{
		return serve1.update1(q);
	}
	@DeleteMapping("/deleteuser")
	public String deleteinfo1(int q)
	{
		serve.delete1(q);
		return "Deleted";
	}
	
}
