package com.kita.first.level2;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1=new int[5];
		char[] arr2=new char[10];
		double[] arr3=new double[100];
		//기본형 변수들의 기본값
		//숫자형 : 0
		//char : (빈값)
		//boolean : false
		
		

		String[] arr4=new String[10];
		//참조형 변수의 기본값 : null
		
		arr1[0]=1;
		System.out.println("arr1[0]: "+arr1[0]);
		
		int[] arr7= {10, 20, 30, 40};
		arr7=new int[] {10, 20, 30};
		
		int len=arr1.length;
		
		for(int i=0; i<=arr1.length-1; i++) {
			arr1[i] = 3;
		}
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + ", ");
		}
	}
}
