package com.kita.first.level1;

public class Operator5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=3;
		int n2=4;
		System.out.println(n1==n2);
		boolean a = n1==n2;
		n2=3;
		a=n1==n2;
		System.out.println(a);
		System.out.println(!a);
		System.out.println(!!a);
		
		a=(n1>=n2);
		System.out.println(a);
		
		a=(n1!=n2);
		System.out.println(a);


	}

}
