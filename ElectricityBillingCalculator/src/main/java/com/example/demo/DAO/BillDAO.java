package com.example.demo.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Bill;
import com.example.demo.Entity.GenerateBillDTO;

@Repository
public interface BillDAO extends CrudRepository<Bill, Integer>{
	
	@Query(value = "SELECT * FROM bills", nativeQuery = true)
	List<Bill> findAllBills();
	
	
	//Bill findByMonth(int month);
	
}