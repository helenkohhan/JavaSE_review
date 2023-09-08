package section15;
/*
 * 1. 얕은복사(Shallow Copy)

 * 	  - 참조형 변수에 주소값만 복사
 * 	  - 동일한 객체를 참조하게 된다.
 * 
 * 2. 깊은복사(Deep Copy)   
 *    - 객체의 멤버 변수 값과 객체가 참조하는 객체까지 모두 복사하는 방식.
 * 	  - 새로운(다른) 객체를 참조하게 된다.
 * 
 * 
 */

import section15.access1.SoccerTeam;

public class JavaLang02 {
	public static void main(String[] args) throws CloneNotSupportedException {
		SoccerTeam sTeam1 = new SoccerTeam("토트넘", "런던", 1882,"프리미어리그");
		SoccerTeam sTeam2 = sTeam1; 		//sTeam2는 sTeam1의 참조값을 복사한것 = 얕은복사
		
//		SoccerTeam sTeam3 = sTeam1.clone();
//		clone은 제한접근자가 protected로 접근할 수 없기에 오류가 발생.
//		이를 해결하기 위해서, clone을 public한 메서드로 감싸줌 
		SoccerTeam sTeam3 = (SoccerTeam) sTeam1.callClone(); //sTeam1의 객체정보를 sTeam3으로 복사한 것.
															 //같은 값들을 복사하지만, 주소값이 달라짐
															 //즉, sTeam3은 새로운 객체이다.
		
		
		if(sTeam1.equals(sTeam2)) {
			System.out.println("sTeam1과 sTeam2는 같다");
		} else {
			System.out.println("sTeam1과 sTeam2는 다르다.");
		}
		
		if(sTeam1.equals(sTeam3)) {
			System.out.println("sTeam1과 sTeam3은 같다.");
		} else {
			System.out.println("sTeam1과 sTeam3은 다르다.");
		}
		
		System.out.println(System.identityHashCode(sTeam1));
		System.out.println(System.identityHashCode(sTeam2));
		System.out.println(System.identityHashCode(sTeam3));
		
		System.out.println(sTeam1);
		System.out.println(sTeam2);
		System.out.println(sTeam3);
	
	}

}




