package com.example.demo.service.lmp;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DAO_Empolyee;
import com.example.demo.entity.Empolyee;
import com.example.demo.service.Service_Account;

@Service
public class ServiceImpl_Account implements Service_Account{
	@Autowired private DAO_Empolyee accDao;


	public Empolyee findById(int id) {
		return accDao.findById(id).orElse(new Empolyee());
	}

	

	public List<Empolyee> findAll() {
		return accDao.findAll();
	}

	
	public Empolyee create(Empolyee account) {
		return accDao.save(account);
	}


	public Empolyee update(Empolyee account) {
		return accDao.save(account);
	}



	@Override
	public Empolyee finbyEmail(String email) {
		return accDao.finbyEmail(email);
	}

	@Override
	public List<Empolyee> getAccountByRole(String role) {
		return accDao.findAll().stream().filter(acc-> 
		acc.getAuthorities().stream().anyMatch(au -> au.getRole().getId().equals(role))).collect(Collectors.toList());
	}



	@Override
	public void deleteById(Integer id) {
		accDao.deleteById(id);
	}



	@Override
	public List<Empolyee> getAdministrators() {
		return accDao.getAdministrators();
	}






	


	


	
}
