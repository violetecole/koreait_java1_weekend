package com.kita.first.level2.practice;

public class Practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		int total=0;
		while(true) {
//			total=total+n;
			total+=n;
			n++;
			if(n==101) {
				break;
			}


		}
		System.out.printf("합계: %d", total);
//		System.out.println("합계: "+total);
	}

}
