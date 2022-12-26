package com.example.demo.entity;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@SuppressWarnings("serial")
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Blog")
@Entity
@Data
public class Blog {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     private String title;
     private String description;
     private int views;
     private Date date;
     @ManyToOne
	 @JoinColumn(name = "employeeid")
	 Empolyee employee;

     
}
