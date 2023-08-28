package section08;

public class Method07 {
	public static void main(String[] args) {
	
		int result = add(24, 55);
	  //int result = add(24, 55, 77); 로 적으면 
	  //밑에 있는 오버로딩메서드로	 계산되어 결과값 나옴.
		System.out.println("result: " + result);
		
		
	}
	
	// 7. 인자 o, 리턴 o	-> 인자값을 받아 연산 후 반환값을 준다.
	public static int add(int a, int b) {
		return a + b;
		
	}
	
	// 오버로딩 메서드	-> 같은 기능이지만 처리가 달라질 경우 오버로딩 사용!
	public static int add(int a, int b, int c) {
		return a + b + c;
	}

}
