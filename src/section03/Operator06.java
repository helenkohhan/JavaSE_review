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
 *	  - ^	: 대응되는 비트가 서로 다르면 1을 반환(비트 XOR연산자 - EXCLUSIVE OR), 같으면 0 
 * 	  - ~	: 대응되는 비트가 1이면 0으로, 0이면 1로 반전시킴(비트 NOT연산자)
 */

public class Operator06 {
	public static void main(String[] args) {
		
		int num1 = 3;	// 0 0011
		int num2 = 5;	// 0 0101 
		
		System.out.println("num1 & num2: " + (num1 & num2)); // 0001
		System.out.println("num1 | num2: " + (num1 | num2)); // 0111
		System.out.println("num1 ^ num2: " + (num1 ^ num2)); // 0110
		
		//보수:각 자리의 숫자의 합이 어느 일정한 수가 되게 하는 수. 
		//    예를 들어 10의 7에 대한 보수는 3이다.
		
		//  3: 0 0011
		// ~3: 1 1100 -> -12가 아니라 -4?
		// 컴퓨터는 음수를 2의 보수로 생각한다.
		
        // 4를 2진수로 표현		:0 0100 
		// 4의 1의보수			:1 1011  -> (1의보수: 전부 반전시키면된다.)
		// 4의 2의보수 		:1 1100  -> (1의보수에 +1을 한값)
		System.out.println("~num1: " + ~num1); // 1 1100
		System.out.println(~num2);
	}

}







