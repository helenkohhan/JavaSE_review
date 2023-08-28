package section08;

public class Method09 {
	public static void main(String[] args) {
//		int[] values = new int[6];
//		values[0] = 1;
//		values[1] = 2;
//		values[2] = 3;
//		values[3] = 4;
//		values[4] = 5;
//		values[5] = 98;
		// 배열은 객체라서 heap영역에 생긴다. 
		// 요소하나하나를 int라는 기본형변수를 사용하지만 
		// 배열이기에 결론적으로 주소값을 갖는 참조형변수이다. 
		
		// 위의 식을 간단하게 표현하면,
 		int[] values = {1, 2, 3, 4, 5, 98};
 		
 		for(int value : values) {
 			System.out.println(value);
 		}
 		
 		System.out.println("====================");
 		
 		refTest(values);
 		
 		for(int value : values) {
 			System.out.println(value);
 		}
 				
		
	}
	
	public static void refTest(int[] values) {
		values[2] = 100;
		
	}
	
	
}
