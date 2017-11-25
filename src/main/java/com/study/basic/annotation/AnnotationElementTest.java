package com.study.basic.annotation;

public class AnnotationElementTest {

	
	
	public static void main(String[] args) {
		
		Class<UserInfoAnnotationTest> clazz = UserInfoAnnotationTest.class;
		
		UserInfoAnnotation userInfoAnnotation = clazz.getAnnotation(UserInfoAnnotation.class);
		
		System.out.println(userInfoAnnotation.username());
		System.out.println("hi");
	}
}
