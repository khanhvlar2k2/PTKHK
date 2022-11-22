package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

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
     @ManyToOne
 	 @JoinColumn(name = "hotelid")
 	 private Hotel hotel;
     
     @ManyToOne
 	 @JoinColumn(name = "roleid")
 	 private Role role;
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
     
}
