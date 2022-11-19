package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Room")
public class Room {
	@Id
	 int id;
	 String photo;
	 int Status;
	@ManyToOne
	@JoinColumn(name = "hotelid")
	 Hotel hotel;
	@ManyToOne
	@JoinColumn(name = "roomtype")
	 RoomType rtype;
	@OneToOne(mappedBy = "room")
     Booking booking;
	

}
