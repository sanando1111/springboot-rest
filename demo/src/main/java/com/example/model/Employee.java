package com.example.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.hateoas.RepresentationModel;

import io.swagger.annotations.ApiModelProperty;

public class Employee  extends RepresentationModel<Employee>  {
	
	@ApiModelProperty(notes = "Emloyee name which is between 2 and 10")
	@Size(max = 10,min=2,message = "Employee name must be in between 2 and 10")
	private String name;
	
	@NotNull
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
