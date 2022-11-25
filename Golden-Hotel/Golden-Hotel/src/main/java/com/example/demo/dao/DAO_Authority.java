package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Authority;
import com.example.demo.entity.Empolyee;



@Repository
public interface DAO_Authority extends JpaRepository<Authority, Integer>{

	@Query("Select Distinct a From Authority a where a.employee IN ?1")
	List<Authority> authoritiesOf(List<Empolyee> empolyee);

	@Query("Select a From Authority a where a.employee.id like ?1")
	List<Authority> getOneByRole(int id);

	@Transactional
	@Modifying
	@Query("Delete from Authority where employeeid = ?1")
	void deleteByUserName(int employeeid );

}
