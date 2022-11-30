package com.example.demo.entity;

import java.util.List;

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
import com.fasterxml.jackson.annotation.JsonIgnoreType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreType
@Table(name = "Room")
@Data
public class Room {
	 @Id
	 int id;
	 String photo;
	 int status;
	 
	 @ManyToOne
	 @JoinColumn(name = "roomtype")
	 RoomType rtype;
	 @OneToMany(mappedBy = "room")
	 List<Booking> booking;	 
	 String name;
	

}
