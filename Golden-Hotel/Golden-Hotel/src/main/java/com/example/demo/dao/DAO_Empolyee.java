package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.example.demo.entity.Empolyee;

@Repository
public interface DAO_Empolyee extends  JpaRepository<Empolyee, Integer>{
	@Query("Select e From Empolyee e Where e.id=?1")
	public Empolyee finbyeID(String id);
	@Query("Select Distinct ar.employee From Authority ar where ar.role.id IN ('DIRE','STAF')")
	List<Empolyee> getAdministrators();
	
}
