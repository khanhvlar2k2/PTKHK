package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Blog;

public interface DAO_Blog extends JpaRepository<Blog, Integer> {
	

}
