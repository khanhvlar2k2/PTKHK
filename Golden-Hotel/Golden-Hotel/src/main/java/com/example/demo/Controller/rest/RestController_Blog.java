package com.example.demo.Controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.DAO_Blog;
import com.example.demo.entity.Blog;

@CrossOrigin("*")
@RestController
@RequestMapping("rest")
public class RestController_Blog {
	 @Autowired private DAO_Blog serviceBlog;  
     
     @GetMapping("/blogs")
     public List<Blog> getAllBlog(){        
     	return serviceBlog.findAll();
     }
     @PostMapping("/blog")
     public Blog create(@RequestBody Blog blog){
     	return serviceBlog.save(blog);
     }
     @PutMapping("/blog/{id}")
     public Blog update(@RequestBody Blog blog,@PathVariable("id")int id){
     	return serviceBlog.save(blog);
     }
     @DeleteMapping("/blog/{id}")
     public void delete(@PathVariable("id") int id){
    	 serviceBlog.deleteById(id);
     }       

}
