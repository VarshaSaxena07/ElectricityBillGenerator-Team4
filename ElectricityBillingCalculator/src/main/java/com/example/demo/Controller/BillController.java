package com.example.demo.Controller;


import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DAO.BillDAO;
import com.example.demo.DAO.GeneratedBillDAO;
import com.example.demo.Entity.Bill;
import com.example.demo.Entity.GenerateBillCO;
import com.example.demo.Entity.GenerateBillDTO;
import com.example.demo.Exception.InvalidRequestException;
import com.example.demo.Services.BillServices;

import antlr.StringUtils;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BillController {
	
	@Autowired
	private BillServices billServices;
	@Autowired
	private BillDAO billDAO;
	@Autowired
	private GeneratedBillDAO generatedBillDAO;

	@GetMapping("/getAllbills")
	public List<Bill> getAllBills(){
		return billDAO.findAllBills(); 
	}
	
	
	@PostMapping("/create/bill")
	public String createBill(@RequestBody Bill bill) {
		billDAO.save(bill);
		return "Bill Created Successfully";
	}
	@PostMapping("/bills/generate")
	public GenerateBillDTO generateBill(@RequestBody GenerateBillCO generateBillCO) {
		return billServices.generateBill(generateBillCO);
	}
	
	@GetMapping("/bills/month/{month}")
	public List<GenerateBillDTO> getMonthlyBill(@PathVariable int month) {
		return generatedBillDAO.findByMonth(month);
	}
	@GetMapping("/bills/year/{year}")
	public List<GenerateBillDTO> getYearlyBill(@PathVariable int year) {
		return generatedBillDAO.findByYear(year);
	}
	
	@PostMapping("bill/findByIdAndMonth")
	public GenerateBillDTO getConsumersIdAndMonthlyBill(@RequestBody GenerateBillCO generateBillCO) throws InvalidRequestException {
		if(generateBillCO.toString().isEmpty())
			throw new InvalidRequestException("Invalid Request");
		else
			return generatedBillDAO.findByIdAndMonth(generateBillCO.getConsumerId(),generateBillCO.getMonth());
	}
	@PostMapping("bill/findByIdAndYear")
	public GenerateBillDTO getConsumersIdAndYearlyBill(@RequestBody GenerateBillCO generateBillCO) throws InvalidRequestException {
		if(generateBillCO.toString().isEmpty())
			throw new InvalidRequestException("Invalid Request");
		else
			return generatedBillDAO.findByIdAndYear(generateBillCO.getConsumerId(),generateBillCO.getYear());
	}
	@PostMapping("bill/findByIdAndMonthAndYear")
	public GenerateBillDTO getConsumersMonthlyAndYearlyBill(@RequestBody GenerateBillCO generateBillCO) {
		return generatedBillDAO.findByIdAndMonthAndYear(generateBillCO.getConsumerId(),generateBillCO.getMonth(),generateBillCO.getYear());
	}
	
	

}