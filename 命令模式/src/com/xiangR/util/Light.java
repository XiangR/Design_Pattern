package com.xiangR.util;

public class Light {

	private String name;
	
	public Light() {
	}
	
	public Light(String name) {
		this.setName(name);
	}

	public void on() {
		System.out.println("Light is On");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void off() {
		// TODO Auto-generated method stub
		
	}
	
}
