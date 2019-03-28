package com.ts.mod;

public class Member {
	private String name;
	private int age;
	private double muge;
	private double ki;
	
	//생성자 2개
	//디폴트 생성자
	//회원정보를 매개변수로 받는 생성자
	public Member() {}
	public Member(String name, int age, double muge, double ki) {
		if(age>0&&age<120) {
			this.age=age;
		}else {
			this.age=25;
		}
		this.name=name;	
		this.age=age;
		this.muge=muge;
		this.ki=ki;
	}
	public void setAge(int age) {
		if(age>0&&age<130) {
		this.age=age;
		}else {
			this.age=25;
		}
		
	}
	public int getAge(int age) {
		if(age<0||age<130) {
		return this.age;
	}
		return age;
	}
	public void check() {
		/*자기 키에서 - 100한 결과물에 
		  0.95 곱한 결과물
		 결과물이 자기 몸무게보다 작다면 비만출력
		 결과물이 자기 몸무게보다 크다면 저체중출력
		 같다며 표준을 출력
		 */
		double st =(this.ki-100)*0.95;
		if(this.muge>st) {
			System.out.println("비만");
		}else if(this.muge<st) {
			System.out.println("저체중");
		}else
			System.out.println("표준");
	}
}
