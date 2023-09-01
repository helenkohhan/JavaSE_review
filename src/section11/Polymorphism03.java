package section11;

import section11.access2.AIRemoteControl;

import section11.access2.RemoteControl;
import section11.access2.SmartRemoteControl;

public class Polymorphism03 {
	public static void main(String[] args) {
		AIRemoteControl aiRC = new AIRemoteControl();
		aiRC.getInfo();
		
		System.out.println(System.identityHashCode(aiRC));
		
		System.out.println("============");
		
		/*
		 * 1. RemoteControl
		 * 2. SmartRemoteControl
		 * 3. AIRemoteControl
		 * 
		 */
		
		RemoteControl rc = aiRC;
		rc.getInfo();	// 3번출력
		
		System.out.println(System.identityHashCode(rc));
		
		
		
		SmartRemoteControl smartRC =(SmartRemoteControl) rc;
		smartRC.getInfo();		// 3번출력
		
		System.out.println(System.identityHashCode(smartRC));
		
		
		
		AIRemoteControl aiRC2 = (AIRemoteControl) smartRC;
		aiRC2.getInfo();	// 3번출력
		
		System.out.println(System.identityHashCode(aiRC2));
	
		// 모든것들의 주소값이 같다는 것은 같은 객체를 바라보고 있다는 것이다.
	}

}
