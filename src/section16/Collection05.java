package section16;
/*
 * 아래의 값을 하나의 변수로 만들어봐라!
 * 
 * id	name	mobile		address   => 속성값 = key값
 * 1	홍길동	0101111111	서울특별시	  => value값
 * 2	짱구		0102222222	떡잎마을
 * 3	둘리 		0103333333	쌍문동
 * 
 * id: 1 name: 홍길동 mobile: 01011111111 addr: 서울특별시
 * id: 2 name: 짱구 mobile: 01022222222 addr: 떡잎마을
 * id: 3 name: 둘리 mobile: 01033333333 addr: 쌍문동
 * 
 * >> id, name, mobile, addr = key값
 * 	  
 * 
 * 
 * 
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection05 {
	public static void main(String[] args) {
		
		
		// [1] 각각의 객체 생성
		// [2] 각각의 객체를 요소로 가지고 있는 List를 만들어준다.
		// 	   - Map타입으로하는 List 만들어 객체생성하기
		//     - memberList는 Map<String, Object>을 요소로 담을 수 있다.
		
		
		List<Map<String, Object>> memberList = new ArrayList<Map<String, Object>>();
		
		// key값이 문자이기에 String, value값은 문자와 정수가 있기에 Object로 받음
		// Object는 최상위 부모라서 어떤 타입이든 받을 수 있다.
		Map<String, Object> member1 = new HashMap<String, Object>();
		Map<String, Object> member2 = new HashMap<String, Object>();
		Map<String, Object> member3 = new HashMap<String, Object>();
		
		member1.put("id", 1);
		member1.put("name", "홍길동");
		member1.put("mobile", "0101111111");
		member1.put("address", "서울특별시");
		
		member2.put("id", 2);
		member2.put("name", "짱구");
		member2.put("mobile", "01022222222");
		member2.put("address", "떡잎마을");
		
		member3.put("id", 3);
		member3.put("name", "둘리");
		member3.put("mobile", "010333333333");
		member3.put("address", "쌍문동");
		
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
		
		System.out.println("id\tname\tmobile\t\taddress");
		for(Map<String, Object> member : memberList) {
			int id = (int) member.get("id");
			String name = (String) member.get("name");
			String mobile = (String) member.get("mobile");
			String address = (String) member.get("address");
			
			System.out.println(id + "\t" + name + "\t" + mobile + "\t" + address);
			
			
		}
		
		
		
	}

}









