package com.iu.s3;

public class S3Main1 {

	public static void main(String[] args) {
		
		StaticTest.num=2;
		
		System.out.println(StaticTest.num);
		
		StaticTest t2 = new StaticTest();
		
		StaticTest.staticMethod();
		

	}

}
