package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Bill;

@Repository
public interface BillDAO extends JpaRepository<Bill, Integer>{
	
	List<Bill> findAll();
	
	//Bill findByMonth(int month);
	
}