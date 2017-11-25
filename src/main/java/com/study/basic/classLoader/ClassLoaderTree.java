package com.study.basic.classLoader;

public class ClassLoaderTree {

	
	public static void main(String[] args) {
		ClassLoader loader = ClassLoaderTree.class.getClassLoader();
		
		while(null != loader){
			System.out.println(loader.toString());
			loader = loader.getParent();
		}
	}
}
