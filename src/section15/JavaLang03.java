package section15;
/* Alt + 방향키: 줄이동
 *  
 * 
 * String 클래스
 *  자바에서 문자열을 다루기 위해 사용되는 클래스
 *  java.lang 패키지 포함
 *  
 *  - 불변(immutable)의 객체: 생성된 후 메모리에서 문자열 값이 변경되지 않는다.
 *    = 변경 불가 객체
 *    
 *    1. 메모리 절약
 *    2. 보안성 up
 *    3. Thread Safe
 *  
 * 
 */

public class JavaLang03 {
	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc"); 
		// new연산자를 이용했을때는 같은 값이여도 다른 객체를 바라본다.
	
//      오버라이딩이 되어있기 때문에 toString() 메서드에서 abc라는 값이 출력된다.		
//		System.out.println(str1.toString());
//		System.out.println(str2);
		
		System.out.println(str1);
		System.out.println("str1: " + System.identityHashCode(str1));
		System.out.println("str2: " + System.identityHashCode(str2));
		System.out.println("str3: " + System.identityHashCode(str3));
		
		str1 += "d";
		str3 += "d";
		
		System.out.println(str1);
		System.out.println("str1: " + System.identityHashCode(str1));
		System.out.println("str2: " + System.identityHashCode(str2));		
		System.out.println("str3: " + System.identityHashCode(str3));
	}

}
