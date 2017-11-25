package com.study.thread.threadSafeAndUnsafe;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

public class TestThreadSafeAndUnsafe {

	
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			test();
		}
	}

	private static void test() {
//		List<Object> list = new ArrayList<Object>();
		Vector<Object> list = new Vector<Object>();
		int threadNum = 1000;
		CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		
		//启动threadNum个子线程
		for(int i=0;i<threadNum;i++){
			Thread thread = new Thread(new MyThread(list,countDownLatch));
			thread.start();
		}
		
		try{
			//主线程等待所有子线程执行完成，再向下执行
			countDownLatch.await();;
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println(list.size());
	}
}


class MyThread implements Runnable{

	private Vector<Object> list;
//	private List<Object> list;
	private CountDownLatch countDownLatch;
	
//	public MyThread(List<Object> list,CountDownLatch countDownLatch){
	public MyThread(Vector<Object> list,CountDownLatch countDownLatch){
		this.list = list;
		this.countDownLatch = countDownLatch;
	}
	
	public void run() {
		//每个线程向List中添加100个对象
		for(int i=0;i<100;i++){
			list.add(new Object());
		}
		//完成一个子线程
		countDownLatch.countDown();
	}
	
}