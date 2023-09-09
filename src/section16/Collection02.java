package section16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
 * ***** List
 *  	컬렉션 프레임웍 중 하나 인터페이스로 순서가 있는 데이터 모음을 다루는 객체
 * 
 * 		- 선형 배열 객체
 * 		- 가변 배열 객체
 * 		- 인덱스 값이 있다.
 * 
 */


public class Collection02 {
	public static void main(String[] args) {
		
	 	
	//ArrayList<String> list = new ArrayList<String>();로 적어도 상관없음.같은것
		List<String> list = new ArrayList<String>();
		
		// 데이터 저장하기			//인덱스번호
		list.add("피카츄");		// 0
		list.add("라이츄");		// 1
		list.add("파이리");		// 2
		list.add("꼬부기");		// 3
		list.add("버터플");		// 4
		list.add("야도란");		// 5
		list.add("피존투");		// 6
		list.add("또가스");		// 7
		
		
		// 저장된 데이터 특정 인덱스 값으로 얻어오기
		String pokemon = list.get(6);	// 배열로 나타낸다면, array[6]
		System.out.println("list 6 인덱스 값: " + pokemon);
		
		
		// 지정된 데이터 인덱스 값으로 삭제
		list.remove(1);
		System.out.println("지정된 데이터 개수: " + list.size());	//배열에서의 length처럼 .size로 사용된것
		
		System.out.println("1번 인덱스 값: " + list.get(1));
		
		// 리스트 전체 출력
		for(int i=0; i<list.size(); i++) {
			System.out.println("list["+i+"]: " + list.get(i));
		}
		
		
		System.out.println("=================================");
		
		
		//특정 인덱스 데이터 삽입
		list.add(4, "잠만보");
		
		
		// 향상된 for문을 사용해서 리스트 전체 출력
		for(String name: list) {
			System.out.println("pokemon name: " + name);
		}
		
		//얕은 복사 - 참조값 대입
		ArrayList list2 = (ArrayList) list;	//참조값을 list타입에서 ArrayList타입으로 변경
		
		//깊은 복사 - 새로운 객체 생성하고 그 객체에 기존것의 요소까지 복사
		ArrayList list3 = (ArrayList) list2.clone();  // list3이란 객체 생성후 list2의 요소를 복사
		
		
		System.out.println("=================================");
		
		
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("메타몽");
		linkedList.add("이브이");
		
		linkedList.add(1, "푸린");
		
		
		for(String name: linkedList) {
			System.out.println("linkedList: " + name);
		}
		
		
		System.out.println("=================================");
		
		
		/*
		 * Vector
		 * 	선형배열객체
		 *  ArrayList와 동일
		 *  Thread safe
		 * 
		 */
		
		Vector<String> vec = new Vector<String>();

		vec.add("안준호");
		vec.add("한호열");
		vec.add("조석봉");
		
		System.out.println("size: " + vec.size());
		
		System.out.println("1번 인덱스 값: " + vec.get(1));
		
	}
}
