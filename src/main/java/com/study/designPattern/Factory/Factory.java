package com.study.designPattern.Factory;

public class Factory {

	
	public BMW createBMW(int type){
		switch(type){
		
			case 320:
				return new BMW320();
			case 525:
				return new BMW525();
			default:
				break;
		}
		
		return null;
	}
}
