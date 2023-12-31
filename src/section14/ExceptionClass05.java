package section14;

import section14.access1.NumberPrinter;

/*
 * throws 키워드
 * 	자바에서 메서드나 생성자가 예외를 던질 수 있음을 선언하는 키워드
 * 	메서드가 예외를 처리하지 않고 해당 예외를 호출한 곳으로 넘기고자 할 때 사용.
 * 
 */

public class ExceptionClass05 {
	public static void main(String[] args) throws InterruptedException {
		
		NumberPrinter np = new NumberPrinter();
		
// 예외처리 방법 
// [1번째 방법] try~ catch
		
//		try {
//			np.printNumber();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		
// [2번째 방법] throws 예외 던지기(미루기)
//			  ; 던지는 대상이 MAIN, 던짐을 받는 대상도 MAIN 이란, 
//				JVM이 알아서 해결하라는 의미이다.		
		np.printNumber();
		
// throw 키워드 강제로 Exception 발생시키기		
		throw new NullPointerException();
	}

}
