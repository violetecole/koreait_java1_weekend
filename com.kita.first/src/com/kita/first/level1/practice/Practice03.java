package com.kita.first.level1.practice;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("수학 응시 유형을 입력해 주세요(가/나) : ");
		String type = scan.next();
		System.out.print("점수를 입력해 주세요 : ");
		int score = scan.nextInt();
		
		if ("가".equals(type)) {
			if(score < 60) {
				System.out.println("평균 미만입니다");
			} else if (score < 60) {
				System.out.println("평균 초과입니다");
			} else {
				System.out.println("평균입니다");
			}
		}
		else if ("나".equals(type)) {
		} else {
			System.out.println("잘못 입력했습니다");
		}
		
		}
	}


