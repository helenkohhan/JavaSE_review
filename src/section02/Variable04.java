package section02;
/*
 * 4. 실수형
 *    1) float	(4byte) : 소수점 7자리 표현 
 *    2) double (8byte) : 소수점 15자리 표현
 * 
 * 
 * 
 */

public class Variable04 {
	public static void main(String[] args) {
		float iFloat = 10.1f;		//숫자뒤에 f를 꼭 써줘야함
		double iDouble = 10.1d;		//d는 써줘도 되고 안써도됨. 즉, double형 d생략 가능  
		double iDouble2 = 10.1; 	
		
		System.out.println("float 형: " + iFloat);
		System.out.println("double 형: " + iDouble);
		System.out.println("double 형: " + iDouble2);
		
	}

}
