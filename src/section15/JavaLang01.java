package section15;

import section15.access1.SoccerTeam;

/*
 * java.lang 패키지
 * 	자바에서 기본 제공해주는 패키지
 * 	import 없이 사용이 가능한 패키지
 * 
 * 
 * Object 클래스
 * 	자바에서 모든 클래스의 최상위 부모 클래스
 * 	명시하지 않아도 모든 클래스는 Object를 상속받는다.
 * 
 * 	- equals() 메서드: 두 객체가 동일한 객체면 true, 동일하지 않으면 false 반환
 
 * 	- hashcode() 메서드: 객체의 메모리 번지를 이용, 해시코드를 만들어 리턴
 * 
 * 	- toString() 메서드: 객체의 문자 정보를 리턴, 즉 객체를 문자열로 리턴
 * 
 *  - clone() 메서드: 새로운 객체로 복사
 *  		 Cloneable 인터페이스 상속받은 객체만 사용가능
 *  
 * 
 */

public class JavaLang01 {
	public static void main(String[] args) {
		SoccerTeam sTeam1 = new SoccerTeam("리버풀", "리버풀", 1892, "프리미어리그");
		SoccerTeam sTeam2 = new SoccerTeam("리버풀", "리버풀", 1892, "프리미어리그");
		// sTeam1, sTeam2는 같은 값을 가지고 있지만 주소값이 다른 다른 객체이다
	
		System.out.println(sTeam1);
		System.out.println(sTeam1.toString());
		
		if(sTeam1.equals(sTeam2)) {
			System.out.println("soccer1과 soccer2는 같습니다.");
		} else {
			System.out.println("soccer1과 soccer2는 다릅니다.");
		}
		
		// 주소값을 찍고 싶을때 System.identityHashCode을 사용해라;더 정확한 경우가 많다.
		// 위에서 우리가 toString을 오버라이딩 한 것처럼,
		// 어떤 경우에서는, hashCode가 오버라이딩 되어 있는 경우도 있기 때문이다.
		System.out.println(System.identityHashCode(sTeam1));
		System.out.println(System.identityHashCode(sTeam2));
		
		System.out.println(sTeam1.hashCode());
		System.out.println(sTeam2.hashCode());
		
	}
	

}
