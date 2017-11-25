package com.study.designPattern.singleton;

public class SingletonSafe {

	
	
	private static SingletonSafe instance = null;
	
	
	private SingletonSafe(){
		
		
	}
	
	
	synchronized public static SingletonSafe getInstance(){
		
		if(null == instance){
			instance = new SingletonSafe();
		}
		
		return instance;
		
		
	}
}
