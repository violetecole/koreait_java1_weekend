package com.kita.first.level2;

public class Arrayorder1 {
public static void main(String[] args) {
	int[] arr= {34, 67, 2,11, 6, 90};
	// arr[0]=arr[2]; <--- 첫번째 자리에 새로 2를 넣어버리면
	// {2, 67, 2, 11, 6, 90} 과 마찬가지로 34를 없애버리고 2를 넣는 결과를 낳는다
	int temp;
	temp=arr[0]; //34
	arr[0]=arr[2]; // {2, 67,2,11,6, 90}
	arr[2]=temp; // {2, 34, 11, 6, 90}
	
	// arr를 오름차순으로 순차정렬 하기
	for(int i=0; i<arr.length-1; i++) {
		
	} for(int z=i+1; z<arr.length; z++) {
	if(arr[i]> arr[z]) {
	temp=arr[i];
	arr[i]=arr[z];
	arr[z]=temp;
	}
		
	}
}
}
