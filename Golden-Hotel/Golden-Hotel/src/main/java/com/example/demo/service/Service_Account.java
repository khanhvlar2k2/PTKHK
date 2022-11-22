package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.example.demo.entity.Empolyee;


@Service
public interface Service_Account {

	Empolyee create(Empolyee account);

	Empolyee update(Empolyee account);

	List<Empolyee> findAll();

	Empolyee findById(int id);
	
	

}
