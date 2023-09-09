package section16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * 	Set
 * 	 순서가 없는 컬렉션 프레임웍(프레임웍='구조를 가지고 있는 것')
 * 	 중복을 허용하지 않는다.;순서가 없기때문에
 * 
 *  하지만, 
 * 	1) LinkedHashSet: HashSet 확장한 클래스로 삽입 순서를 유지한다.
 * 	2) TreeSet: 오름차순으로 정렬되어있다.
 *  즉, 모든 Set이 순서가 없는 것은 아니다.
 * 
 * 	반복자(Iterator)
 * 	 자바 컬렉션 프레임웍에서 컬렉션에 저장된 요소를 읽어오는데 사용하는 인터페이스
 *   
 * 	 
 */

public class Collection03 {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		//데이터 추가하기
		set.add("피카츄");
		set.add("라이츄");
		set.add("파이리");
		
		// 중복 값 허용하지 않는다.
		boolean isAdd = set.add("피카츄");		// 같은 값 중복을 허용하지 않기에 false값
		System.out.println("isAdd: " + isAdd);
		boolean isAdd2 = set.add("피카츄2");
		System.out.println("isAdd2: " + isAdd2);
		
		//데이터 사이즈
		System.out.println("데이터 길이: " + set.size());
		
		//전체 데이터 출력
		for(String name: set) {
			System.out.println("name: " + name);
		}
		
		
		System.out.println("==============================");

		
		Iterator<String> it = set.iterator();
		
		// hasNext() - 커서역할, 해당 요소가 있는지 확인하여 논리값 반환
		// 값이 있으면 true, 없으면 false
		// next() - 해당요소 값 반환
		while(it.hasNext()) {	
			String name = it.next(); 
			System.out.println("iterator name: " + name);
			
			
		System.out.println("==============================");	
			
		
		// TreeSet: 오름차순으로 정렬된다.
		TreeSet<String> treeSet = new TreeSet<String>();
		
		//데이터 추가하기
		treeSet.add("피카츄");
		treeSet.add("라이츄");
		treeSet.add("파이리");
		treeSet.add("꼬부기");
		
		for(String name2: treeSet) {
			System.out.println("treeSet: " + name2);
		}
			
			
			
			
		}
		
	}

}











