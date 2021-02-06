package com.kita.first.level1;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 하나 입력하시오 : ");
		int num=scan.nextInt();
		String sNum;
		if(num%2==1) {
			sNum="홀수";
			// System.out.println("홀수입니다");
		}else {
			sNum="짝수";
			// System.out.println("짝수입니다");
			
		}
		System.out.printf("%s입니다", sNum);
		
		// (조건식)?true:false;
		
		sNum=(num%2==1)?"홀수" : "짝수";
		System.out.printf("%s입니다",sNum);
	}

}
