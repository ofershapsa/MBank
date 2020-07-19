package com.example.MBank.repo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clients")

public class Client {
	private Long id;
	private String name;
	private Integer age;

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	@Column(nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	@Column(nullable = false)
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {

		this.age = age;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}