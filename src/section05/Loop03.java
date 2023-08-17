package section05;
/*
 * 3. for문
 *    : 초기식, 조건식, 증감식을 이용하여 반복하는 명령어
 *    
 *    for(초기식; 조건식; 증감식) {
 *    	  반복 수행할 코드 영역
 *    }
 * 
 */

public class Loop03 {
	public static void main(String[] args) {
		// for문을 이용하여 0~99까지 출력
		
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		
		/*
		 * for문을 쓰든 while문을 쓰든 상관없지만, 
		 * for문은 주로 조건이 명확할 때 사용하며 
		 * while문은 계속 무한루프식으로 돌아야할때 사용한다.
		 */
		
		// while문을 이용하여 위에 for문과 같은 조건문 만들기
		int i = 0; 			// 초기식
		while(i < 100) {	// 조건식
			System.out.println(i);
			i++;
		}
	}

}










