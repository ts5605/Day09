package com.ts.mod;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Member member = new Member("iu", 20, 2233, 173.3);
		member.check();
		
		member.setAge(1200);
		int age = member.getAge(22);
		System.out.println(age);
		
	}

}
