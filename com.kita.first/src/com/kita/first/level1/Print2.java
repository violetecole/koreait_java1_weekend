package com.kita.first.level1;

public class Print2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="dlwodnd";
		int age=45;
		
		System.out.println("제 이름은 "+name+"이고 나이는"+age+"세입니다");
		
		// System.out.printf("문자열 형식", 변수1, 변수2, ...);
		System.out.printf("제 이름은 %s 이고 나이는 %d세입니다", name, age);
		
		double  grade=3.33333333333;
		System.out.printf("제 학점은 평균 %.2f입니다.", grade); //%와 f 사이에 .2를 넣으면 소수점 2자리까지
	}

}
