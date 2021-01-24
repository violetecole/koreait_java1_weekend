package com.kita.first.level1;

public class Operator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=2;
		int n2=5;
		int result1 = n1+n2;
		System.out.println(result1);
		
		n1++; // 1씩밖에 증가하지 않음.
		System.out.println(n1); //3
		n1=n1+1;
		System.out.println(n1); //4
		n1+=1;
		System.out.println(n1); //5
		n1--; // 1씩밖에 감소하지 않음.
		System.out.println(n1); //4
		n1 += 2;
		System.out.println(n1); //6
		n2 = n1+3;
		System.out.println(n2); //9
		
	}

}
