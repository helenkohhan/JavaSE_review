package section08;
/*
 * 메서드(Method)
 * 	프로그래밍에서 메서드는 하나의 특별한 목적의 작업을
 *  수행하기 위해 설계된 코드 집합. ; 즉 목적에 맞게 코드를 묶어주는것
 *  객체에서 기능 역할을 한다.
 *  
 *  
 *  메서드 구조
 *   (접근제한자) (정적) 반환타입 메서드이름(매개변수타입 매개변수명) {	//선언부
 *   	실행할 코드 
 *   
 *   	(return 반환값;)
 *   }
 *  
 * 
 */

public class Method01 {
	public static void main(String[] args) {

		
		hello();	// 호출
		
	}
	
	
	// 1. 인자(;매개변수)가 없다. 리턴(=반환값;)도 없다. 
	//	  -> 호출시, 실행하고 끝나는 메서드
	//	  * void 란, 리턴값이 없다는 의미
	//	  * 인자가 없다는 것은 hello()처럼 괄호안에 매개변수가 없다는 것.
	public static void hello() {
		System.out.println("Hello, World!");
	}

}











