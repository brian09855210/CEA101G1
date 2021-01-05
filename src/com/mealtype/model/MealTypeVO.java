package com.mealtype.model;

import java.io.Serializable;

public class MealTypeVO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String meal_type_no;
	private String type_name;
	
	public String getMeal_type_no() {
		return meal_type_no;
	}
	public void setMeal_type_no(String meal_type_no) {
		this.meal_type_no = meal_type_no;
	}
	public String getType_name() {
		return type_name;
	}
	public void setType_name(String type_name) {
		this.type_name = type_name;
	}	
}
