package com.kita.first.level1;

public class Operator6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=3;
		int n2=4;
		int n3=3;
		
		boolean a;
		a=(n1==n2&&n2==n3&&n1==n3); //"and" 하나라도 거짓이 있다면 거짓
		System.out.println(a);
		a=(n1==n2||n2==n3||n1==n3); //"or" 하나라도 참이 있다면 참
		System.out.println(a);
	}

}
