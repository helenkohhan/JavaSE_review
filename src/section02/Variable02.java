package section02;
/*
 * 2. 문자형(char)
 * 	  문자 한글자만(유니코드 문자;unicode) 저장가능
 *    전 세계 쓰이는 대부분 문자 표현 가능
 * 	  2byte ; 1byte로는 영어밖에 표현할 수 없어서, 
 * 			  2byte로 다른 언어까지 표현하는 것
 * 
 *	선언방법
 * 	  char 변수명;
 * 
 * 
 * 
 * 
 */

public class Variable02 {
	public static void main(String[] args) {
		//char 형 변수 선언 및 대입
		char ch1 = 'A';		// 문자열은 "", 문자 하나는 ''
		System.out.println("char 형 변수에 저장된 문자: " + ch1);
		
		char ch2, ch3;
		ch2 = '金';
		ch3 = '쀍';
		System.out.println("ch2 저장된 문자: " + ch2);
		System.out.println("ch3 저장된 문자: " + ch3);
		
		int num = ch1;
		System.out.println("대문자 A에 해당하는 숫자코드: " + num);
		
		char ch4 = 66;
		System.out.println("숫자 66에 해당하는 문자코드: " + ch4);
		
		
		
		
	}
}
