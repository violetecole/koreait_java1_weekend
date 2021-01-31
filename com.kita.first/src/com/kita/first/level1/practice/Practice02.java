package com.kita.first.level1.practice;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수값 하나를 입력하시오 : ");
		int num=scan.nextInt(); //scan 으로 정수값을 받기 위한 명령
		if (num % 2 == 1) {
		System.out.println("홀수입니다");}
		else //(num % 2 == 0) 홀수 아니면 짝수뿐이기 때문에 이 부분은 필요 없다 
		{System.out.println("짝수입니다");}
		scan.close();
	}

}
