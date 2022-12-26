package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Blog;
import com.example.demo.entity.Room;

public interface DAO_Blog extends JpaRepository<Blog, Integer> {
	@Query(value="select Top 5 * from Blog ORDER BY id DESC;",nativeQuery = true)
    public List<Blog> getBlogTop();
  

}
