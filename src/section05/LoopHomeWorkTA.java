package section05;

public class LoopHomeWorkTA {
	public static void main(String[] args) {
		
		// LoopHomeWork 4번에 대한 선생님 정답
		
		// Tip: 그림 옆에 i랑 j를 적어놓고 생각하면 수월해짐
		// 1. 우선 세로로 반을 잘라 생각
		// 2. 왼쪽 공백 / 오른쪽 공백 따로 생각
//		
//		 			i	j(왼쪽)
//		   *   		0	j<3을 때 공백이 들어가야함 >> j<3-i
//		  ***		1	j<2
//		 *****		2	j<1
//		*******		3	
//		 *****		4	j<1을 때 공백이 들어가야함 >> j<i-3
//		  ***		5	j<2
//		   *		6	j<3
//		
//		 			i	j(오른쪽)
//		   *   		0	3<j을 때 공백이 들어가야함 >> j>3+i
//		  ***		1	4<j
//		 *****		2	5<j
//		*******		3	
//		 *****		4   5<j을 때 공백이 들어가야함 >> j>9-i
//		  ***		5   4<j
//		   *		6   3<j
		
		
		for(int i =0; i<7; i++) {
			
			for(int j=0; j<7; j++) {
				if(i <= 7/2) {
					if(j<3-i) {
						System.out.print(" ");
					} else if(j>3+i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
			}   else {
					if(j<i-3) {
						System.out.print(" ");
					} else if(j>9-i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
				}
			}
		}System.out.println(); //개행 목적
		
		
		
		
	}

}
}