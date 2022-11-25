package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Authority;




@Service
public interface Service_Authority {
	
	List<Authority> findAuthoritiesOfAdministrators();

	List<Authority> findAll();
	
	List<Authority> getAuthoritiesOfRole(String role);

	Authority create(Authority auth);

	void delete(Integer id);

	List<Authority> getOneByRole(int id);

	void deleteByUsername(int username);

	Long getTotalCustomer();

}
