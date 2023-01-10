package com.example;

public class Hoagie {

	private String size;
	private String bread;
	private String meat;
	private String cheese;
	private String vegatables;
	private String condiments;
	private String seasoning;
	
	//Getters and Setters
	 public String getSize() {
	    	return size;
	}
	 public String getBread() {
	    	return bread;
    }
	 public String getMeat() {
	    	return meat;
    }
	 public String getCheese() {
		 return cheese;
    }
	 public String getCondiments() {
	    	return condiments;
    }
	 public String getVegatables() {
	    	return vegatables;
    }
	 public String getSeasoning() {
	    	return seasoning;
    }

	public void setSize(String size) {
        this.size = size;
	}
	public void setBread(String bread) {
        this.bread = bread;
	}
	public void setMeat(String meat) {
		this.meat = meat;
	}
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	public void setCondiments(String condiments) {
		this.condiments = condiments;
	}
	public void setVegatables(String vegetables) {
		this.vegatables = vegetables;
	}
	public void setSeasoning(String seasoning) {
		this.seasoning = seasoning;
	}

	@Override
	public String toString() {
		return "\"Hoagie [Hoagie " + size + ", Bread " + bread + ", Meat " + meat + ", Cheese " + cheese + "]";
	}
}
