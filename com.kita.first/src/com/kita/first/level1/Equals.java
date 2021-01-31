package com.kita.first.level1;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=2;
		int n2=3;
		int n3=3;
		boolean result1=(n1==n2);
		System.out.println("result1: "+result1);
		
		boolean result2=(n1!=n2);
		System.out.println("result2: "+result2);
		
		boolean result3=((n1!=n2)&&(n2==n3)); //&& 는 모든 값이 참이어야 참이다 / || 는 하나만 참이어도 참이다.
		System.out.println("result3: "+result3);
		
		String str1="dkssud";
		String str2="dkssud";
		String str3=new String("dkssud");
		boolean result4=(str1==str2);
		System.out.println("result4: "+result4);
		boolean result5=(str1==str3);
		System.out.println("result5: "+result5);
		boolean result6=("dkssud".contentEquals(str3));
		System.out.println("result6: "+result6);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	}

}
