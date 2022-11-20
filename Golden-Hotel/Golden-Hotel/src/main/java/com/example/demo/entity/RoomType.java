package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
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
@Table(name="Roomtype")
@Data
public class RoomType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 int type;
	@JsonIgnore
	@OneToMany(mappedBy = "rtype")
	List<Room> room;
	@JsonIgnore
	@OneToMany(mappedBy = "roomtype")
	List<Gallery> gallery;
	 int price;
	 String roomdesc;
	 String name;
}
