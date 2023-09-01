package section06;

import java.util.Arrays;

/*	1  2  3  4  5  6  7		   	0,0) 1 2 3 4 5 6
	8  9  10 11 12 13 14		1,0) 1 2 3 4 5 6	
	15 16 17 18 19 20 21		2,0) 1 2 3 4 5 6	
	22 23 24 25 26 27 28		3,0) 1 2 3 4 5 6 
	29 30 31 32 33 34 35		4,0) 1 2 3 4 5 6
	36 37 38 39 40 41 42		5,0) 1 2 3 4 5 6
	43 44 45 46 47 48 49		6,0) 1 2 3 4 5 6

	1. 2중배열[7][7] 선언하고 
	2. for문 1~49까지 대입하기
*/
public class ArrayHomeWork1A {
	public static void main(String[] args) {
		
		int[][]arr=new int[7][7];
		
		int i=0;
		int j=0;
		arr[0][0]=1;
		
		for(i=0; i<7; i++) {
			for(j=0; j<7; j++) {
				if(i==0) {
					arr[i][j]=j+1;
				} else if(i==1) {
					arr[i][j]=j+8;
				} else if(i==2) {
					arr[i][j]=j+15;
				} else if(i==3) {
					arr[i][j]=j+22;
				} else if(i==4) {
					arr[i][j]=j+29;
				} else if(i==5) {
					arr[i][j]=j+36;
				} else if (i==6) {
					arr[i][j]=j+43;
				}
			}
			System.out.println();
		}
		
		
	}

}
