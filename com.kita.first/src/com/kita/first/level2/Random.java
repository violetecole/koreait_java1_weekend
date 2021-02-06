package com.kita.first.level2;

import java.util.Scanner;

public class Random {
	public static void main(String[] args) {
		//0~9
		int n2 = (int)(Math.random()*10+1);
		// 0*10 <= mr * 10 < 1 ( 10
		// 0 <= mr * 10 < 10 // 0.0 ~ 9.9999
		// 0+1<=mr*10+1<10_1
		// 1<=mr*10+1<11 // 1.0~10.9999
		System.out.println("n2: "+n2);
		
		// 1~5
		// 0~4 // 0<=n<5
		int n3=(int)(Math.random() * 5 + 1);
		System.out.println("n3: "+n3);
		
		//2~13
		//0~11 // 0+2 <= n < 12 +2 < 12 + 2
		int n4=(int)(Math.random()*12+2);
		System.out.println("n4: "+n4);
		
		//17~51
		// 0~34   0<=n * 35 + 17 < 35 + 17
		int n5=(int)(Math.random()*35+17);
		System.out.println("n5: "+n5);
		
//		int max = 51;
//		int min = 17;
//		int rNum=(int)(Math.random());
	
		int max=90;
		int min=10;
		int rNum = (int)Math.random()*(max-min+1)+min;
		Scanner scan=new Scanner(System.in);
		int myNum;
		
		while(true) {
			System.out.println("정수 하나 입력하시오 : ");
			myNum=scan.nextInt();
			if(myNum>max||myNum<min) {
				System.out.println("잘못 입력했습니다. 다시 입력해주세요");
				continue;
			}
			if (rNum>myNum) {
			System.out.println("UP");
			} else if(rNum<myNum) {
				System.out.println("DOWN");
			} else {
				scan.close();
				System.out.println("GREAT!!!");
				break;
			}
		}
	}
}
