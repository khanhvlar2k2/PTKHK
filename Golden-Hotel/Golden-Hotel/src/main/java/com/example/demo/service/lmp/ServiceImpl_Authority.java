package com.example.demo.service.lmp;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DAO_Authority;
import com.example.demo.dao.DAO_Empolyee;
import com.example.demo.entity.Authority;
import com.example.demo.entity.Empolyee;
import com.example.demo.service.Service_Authority;




@Service
public class ServiceImpl_Authority implements Service_Authority{
	
	@Autowired private DAO_Authority authdao;
	@Autowired private DAO_Empolyee accdao;
	
	@Override
	public List<Authority> findAuthoritiesOfAdministrators() {
		List<Empolyee> accounts = accdao.getAdministrators();
		return authdao.authoritiesOf(accounts);
	}

	@Override
	public List<Authority> findAll() {
		return authdao.findAll();
	}

	@Override
	public Authority create(Authority auth) {
		return authdao.save(auth);
	}

	@Override
	public void delete(Integer id) {
		authdao.deleteById(id);
	}

	@Override
	public List<Authority> getOneByRole(int id) {
		return authdao.getOneByRole(id);
	}

	@Override
	public void deleteByUsername(int id) {
		authdao.deleteByUserName(id);
	}

	/*Summary*/
	@Override
	public Long getTotalCustomer() {
		return authdao.findAll().stream().filter(e->e.getRole().getName().equals("Customers")).count();
	}

	@Override
	public List<Authority> getAuthoritiesOfRole(String role) {
		List<Empolyee> accounts =accdao.findAll().stream().filter(acc-> 
		acc.getAuthorities().stream().anyMatch(au -> au.getRole().getId().equals(role))).collect(Collectors.toList());
		return authdao.authoritiesOf(accounts);
	}
	
}
