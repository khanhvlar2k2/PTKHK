package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity 
@Table(name="Employee")
public class Empolyee {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     @JsonIgnore
 	 @OneToMany(mappedBy = "employee", fetch = FetchType.EAGER)
 	 List<Authority> authorities;
     private String fullname;
 	 @DateTimeFormat(pattern="yyyy-MM-dd")    
     private Date dob;
     private boolean gender;
     private String phoneno;
     private String email;
     private String password;
     private float salary;
     private int type;
     private boolean status;
     private String description;
     private String avatar;
     private String address;
     @JsonIgnore
  	 @OneToMany(mappedBy = "employee")
  	 List<Booking> booking;
     
     @JsonIgnore
  	 @OneToMany(mappedBy = "employee")
  	 List<Blog> blog;
     
     
	
     
     
     
	
     
}
