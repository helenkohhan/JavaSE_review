package section17;

import java.util.Arrays;
import java.util.List;

/*
 * 스트림(Stream)
 * 	데이터 처리와 컬렉션을 다루는데에 사용되는 선언적이고 함수형 스타일의 API이다.
 *  컬렉션을 스트림으로 변환하여 조작, 필터링, 매핑 등 효율적이고 간결하게 수행 가능
 * 
 */



public class Lambda02 {
	public static void main(String[] args) {
		
		// 불변리스트 객체 - 값 변경 불가
		List<String> names=List.of("Apple","Bat","Cat","Dog");
//		names.add("AABB");  	불변리스트라서 추가 X;오류발생

		
//		위의 식을, 아래와 같이 적을 수 있다.
//		단, Arrays.asList는 배열을 List화 시킨 것이기 때문에 배열성을 띄고있다. 
// 		따라서 크기 변경이 불가하다. 추가, 삭제, 길이 변경불가
//		하지만, 데이터의 수정은 가능하다.		
//		List<String> names = Arrays.asList("Apple","Bat","Cat","Dog");	
//		names.set(1, "Batman");
		
		
		printBasic(names);
		printWithFP(names);
		
	}
	
	//[1번째 방법]
	private static void printBasic(List<String>list) {
		for(String element : list) {
			System.out.println(element);
		}
	}
	
	// [2번째 방법]위의 코드를 람다식과 스트림을 통해 출력해보기
	private static void printWithFP(List<String>list) {
		list.stream()
			.forEach(e -> System.out.println("e - " + e));
	}
	
	
	
}
