package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Hotel")
@Data
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String address;
	private String phoneno;
	private String city;
	private int rating;
	
	@JsonIgnore
	@OneToMany(mappedBy = "hotel1")
	List<Room> room;
	
	@JsonIgnore
	@OneToMany(mappedBy = "hotel")
	List<Empolyee> empolyee;
	
	@JsonIgnore
	@OneToMany(mappedBy = "hotel")
	List<Booking> booking;

}
