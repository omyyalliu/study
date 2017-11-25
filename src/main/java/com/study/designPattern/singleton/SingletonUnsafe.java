package com.study.designPattern.singleton;

public class SingletonUnsafe {

	/* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */  
	private static SingletonUnsafe instance = null;
	
	 /* 私有构造方法，防止被实例化 */  
	private SingletonUnsafe(){
		System.out.println("空的构造函数");
	}
	
	 /* 静态工程方法，创建实例 */  
	public static SingletonUnsafe getInstance(){
		
		if(null == instance){
			instance =  new SingletonUnsafe();
			
			System.out.println("haha,产生了一个实例");
		}else{
			
			System.out.println("Hi dude,已经有一个实例了啊");
		}
		return instance;
		
	}
	
	public static void main(String[] args) {
//		Singleton mySingleton = new Singleton();
		
		SingletonUnsafe.getInstance();
		SingletonUnsafe.getInstance();
	}
}
