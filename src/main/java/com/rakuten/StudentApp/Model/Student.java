package com.rakuten.StudentApp.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Table(name="student")
@Data
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private Integer rollNo;
	@Column
	private  String name;
	@Column
	private Integer age;
	@Column
	private Integer moNumber;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getMoNumber() {
		return moNumber;
	}
	public void setMoNumber(Integer moNumber) {
		this.moNumber = moNumber;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(Long id,Integer rollNo, String name, Integer age, Integer moNumber) {
		super();
		this.id=id;
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.moNumber = moNumber;
	}
	
	

}
