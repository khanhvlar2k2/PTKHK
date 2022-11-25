package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Authorities", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"employeeid", "Roleid"})
})
public class Authority  implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne @JoinColumn(name = "employeeid")
	private Empolyee employee;
	@ManyToOne  @JoinColumn(name = "roleid")
	private Role role;
}