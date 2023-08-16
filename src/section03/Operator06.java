package section03;
/*
 * 줄복사: Alt + Ctrl + 방향키
 * 줄삭제: Ctrl + d
 * 
 * 
 * 6. 비트 연산자
 * 	  : 2진수로 표현된 두 비트 연산자
 * 	  
 * 	  - &	: 대응되는 비트가 모두 1이면 1을 반환(비트 AND 연산자)
 * 	  - |	: 대응되는 비트 중에서 하나라도 1이면 1을 반환(비트 OR 연산자)
 *	  - ^	: 대응되는 비트가 서로 다르면 1을 반환(비트 XOR연산자 - EXCLUSIVE OR) 
 * 	  - ~	: 대응되는 비트가 1이면 0으로, 0이면 1로 반전시킴(비트 NOT연산자)
 */

public class Operator06 {
	public static void main(String[] args) {
		
		int num1 = 3;	// 0 0011
		int num2 = 5;	// 0 0101 
		
		System.out.println("num1 & num2: " + (num1 & num2)); // 0001
		System.out.println("num1 | num2: " + (num1 | num2)); // 0111
		System.out.println("num1 ^ num2: " + (num1 ^ num2)); // 0110
		
		//  3: 0 0011
		// ~3: 1 1100 -> -12가 아니라 -4?
		// 컴퓨터는 음수를 2의 보수로 생각한다.
		
        // 4를 2진수로 표현		:0 0100 
		// 4의 1의보수			:1 1011 
		// 4의 2의보수 		:1 1100  -> 1의보수에 +1을 한값
		System.out.println("~num1: " + ~num1); // 1 1100
	}

}







