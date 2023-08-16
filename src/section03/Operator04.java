package section03;
/*
 * 4. 논리 연산자
 * 	  - &&	: AND 조건	; 교집합개념, 두항 모두 true일때 true
 * 	  - ||	: OR 조건		; 합집합개념, 두 항중 하나 이상 true일때 true
 * 	  - !	: NOT 조건	; 여집합 개념, 논리(boolean)값 반전 시킨다.
 * 						  즉, true일때 false로 false일때 true로 바꿔준다.
 * 
 */

public class Operator04 {
	public static void main(String[] args) {
		
		boolean result = true && false;	// 둘다 true면 true이지만, 두항 모두 true가 아니므로 false
		System.out.println("result: " + result);
		
		boolean result2 = true || false; // 두항중 하나라도 true면 true
									     // 두항 모두 false면 false
		System.out.println("result: " + result2);
		
		boolean result3 = true;
		System.out.println("!result3: " + !result3);
	
		
		String order = "의류";
		if (order == "식품" || order == "전기전자" || order == "의류") {
			System.out.println("20% 할인 행사 중입니다.");
		} else {
			System.out.println("할인 미적용 상품입니다.");
		}
		
		
	}

}
