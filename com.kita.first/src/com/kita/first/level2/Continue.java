package com.kita.first.level2;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<9; i++) {
			
			if(i==5) {
				System.out.println("Continue를 만납니다");
				continue;
			}
			System.out.printf("i는 %d 입니다\n", i);	
		}
		for(int i=0; i<4; i++) {
			for(int z=0; z<3; z++) {
				if(i==2) {
					continue;
				}
				System.out.printf("i= %d, z: %d\n", i, z);
			}
		}
	}

}
