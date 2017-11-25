package com.study.designPattern.Factory;

public class Customer {

	
	public static void main(String[] args) {
		Factory factory = new Factory();
		
		BMW bmw320 = factory.createBMW(320);
		BMW bmw525 = factory.createBMW(525);
	}
}
