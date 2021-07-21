package com.iu.s2.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		Member member = new Member();
		
		member.setAge(30);
		
		int age = member.getAge();
		System.out.println(age);
		//member.info();
		
		member.setId("iu");
		String id = member.getId();
		System.out.println(id);

	}

}
