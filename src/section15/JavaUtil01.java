package section15;
/*
 * 자바 유틸 패키지(java.util)
 * 	자바에서 유용한 유틸클래스, 인터페이스 포함하는 패키지
 * 	
 * Random 클래스
 * 	난수 생성해주는 클래스
 * 
 */

import java.util.Random;

public class JavaUtil01 {
	public static void main(String[] args) {
		Random random = new Random();
		
		// 무작위의 숫자 반환
		int ranNum = random.nextInt();
		System.out.println("난수: " + ranNum);
		
		// 0~99 사이 정수 중 난수 반환
		int ranNum2 = random.nextInt(100);
		System.out.println("난수: " + ranNum2);
		
		// 0이상 1미만 난수 반환
		double ranNum3 = random.nextDouble();
		if(ranNum3 < 0.5) {	// 50% 확률로 성공 혹은 실패
			System.out.println("강화에 성공하였습니다.");
		} else {
			System.out.println("강화에 실패하였습니다.");
		}
		
		
		
		
		
		
	}

}






