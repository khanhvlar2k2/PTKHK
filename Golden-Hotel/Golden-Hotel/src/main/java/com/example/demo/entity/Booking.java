package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@SuppressWarnings("serial")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity 
@Getter
@Setter
@Table(name="Booking")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "guestid")
	Guest guest;
	@ManyToOne
	@JoinColumn(name = "employeeid")
	Empolyee employee;
	@ManyToOne
	@JoinColumn(name = "roomid")
    Room room ;
	private Date date;
	private String time;
	private LocalDateTime arrivaldate;
	private LocalDateTime departuredate ;
	private Date estcheckin;
	private Date estcheckout;
	private String description;
	@JsonIgnore
	@OneToMany(mappedBy = "booking")
	List<Invoice> invoice;
	
	
	
	
	

}
