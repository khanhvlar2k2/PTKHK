package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Guest")
@Data
public class Guest {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private int id;
      private String firstname;
      private String lastname;
      private Date dob;
      private boolean gender;
      private String phoneno;
      private String email;
      private String pid;
      @JsonIgnore
  	  @OneToMany(mappedBy = "guest")
  	  List<Booking> booking;
      
      @OneToOne(cascade = CascadeType.ALL)
      @JoinColumn(name="id")
      private Invoice invoice;
      
}
