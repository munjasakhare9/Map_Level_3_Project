package com.demo.givenbysir;

public class Student {
	private int id;
	private String name;
	private String city;
	private double percentage;

	public Student(int id, String name, String city, double percentage) {

		this.id = id;
		this.name = name;
		this.city = city;
		this.percentage = percentage;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public double getPercentage() {
		return percentage;
	}

	public String toString() {
		return "Student[id="+id+", name="+name+", city="+city+", percentage="+percentage+"]";
	}
}
