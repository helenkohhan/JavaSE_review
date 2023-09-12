package section15;

public class JavaLang04 {
	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		if(str1 == str2) {
			System.out.println("str1 == str2 true");
		} else {
			System.out.println("str1 == str2 false");
		}
		
		
		// 참조형변수는 주소값을 가지고 있기에, 주소값을 비교하여 결과를 출력한것
		if(str1 == str3) {
			System.out.println("str1 == str3 true");
		} else {
			System.out.println("str1 == str3 false");
		}
		

		// String에서 값 비교 equals() 메서드 사용해야한다.
		// 문자열 값을 비교하고 싶을 때
		if(str1.equals(str3)) {
			System.out.println("str1.equals(str3) true");
		} else {
			System.out.println("str1.equals(str3) false");
		}
		
//		str1 = null;
//		str1이 null이면, 참조할 객체가 없기 때문에 메서드를 실행하지 못한다.		
//      if(str1 != null && str1.equals(str3)){
//			System.out.println("str1.equals(str3) true");
//		} else {
//			System.out.println("str1.equals(str3) false");
//		}을 사용하면 에러는 나지 않는다.
//		하지만 str1 != null에서 false값을 가지므로, AND 조건이기에, 
//		뒤에 	str1.equals(str3)을 연산하지 않고
//		바로 else로 간다. 
//		System.out.println("str1.equals(str3) false");이 출력된다.
		
		
		
		
	}

}
