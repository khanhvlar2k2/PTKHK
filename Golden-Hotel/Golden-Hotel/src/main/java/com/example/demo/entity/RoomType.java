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
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.hibernate.FetchMode;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

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
	@LazyCollection(LazyCollectionOption.FALSE)
	List<Gallery> gallery;
	int price;
	String roomdesc;
	String name;
	Float views;
	Double sale;
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public List<Room> getRoom() {
		return room;
	}
	public void setRoom(List<Room> room) {
		this.room = room;
	}
	public List<Gallery> getGallery() {
		return gallery;
	}
	public void setGallery(List<Gallery> gallery) {
		this.gallery = gallery;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRoomdesc() {
		return roomdesc;
	}
	public void setRoomdesc(String roomdesc) {
		this.roomdesc = roomdesc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getViews() {
		return views;
	}
	public void setViews(Float views) {
		this.views = views;
	}
	public Double getSale() {
		return sale;
	}
	public void setSale(Double sale) {
		this.sale = sale;
	}
	
	
}
