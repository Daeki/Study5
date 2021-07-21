package com.iu.s2.ex1;

public class Member {
	
	private String id;
	private int age;
	private int muge;
	private int ki;
	
	
	//setter
	public void setId(String id) {
		this.id = id;
	}
	
	//getter
	public String getId() {
		return this.id;
	}
	
	
	
	
	//외부 데이터를 멤버변수에 대입
	//데이터를 입력하는 메서드는 set멤버변수명
	//setter 
	public void setAge(int age) {
		if(age>0 && age <150) {
			this.age=age;
		}else {
			this.age=20;
		}
	}
	
	//멤버변수를 외부로 보낼때
	//데이터를 외부로 내보낼때 get멤버변수명
	//getter
	public int getAge() {
		return this.age;
	}
	
	public void info() {
		System.out.println("Id : "+id);
		System.out.println("Age : "+age);
		System.out.println("Muge : "+muge);
		System.out.println("Ki : "+ki);
		test();
	}
	
	private void test() {
		
	}

}
