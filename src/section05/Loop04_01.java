package section05;
/*
 * 중첩 반복문
 * : 반복문 안에 반복문
 * 
 */

public class Loop04_01 {
	public static void main(String[] args) {
		int num = 0;
		
		for(int i = 0; i < 7; i++) {
			
			for(int j = 0; j < 7; j++) {
			/*
			 * i:0 j:0 1 2 3 4 5 6
			 * i:1 j:0 1 2 3 4 5 6
			 * 
			 */
			System.out.println((i*7)+ j + 1);
			}
		}
	}
}
