package com.iu.s1.ex2;

class Member {
	
	public String id;
	
	int age; //defalut
	
	private String name;
	
	
	private Member(){
		this.id = "iu";
		this.age = 29;
		this.name="choa";
		
	}
	
	public Member test() {
		return new Member();
	}

}
