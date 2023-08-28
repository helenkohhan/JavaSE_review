package section10.access1;

public class Bicycle {
	
	// public은 패키지와 상관없이 어디서든 사용할 수 있다.접근에 제한을 두지 않음.
	public String handleType;
	public int gear; 
	public int wheel;
	
	public void getInfo() {
		System.out.println("handleType: " + handleType);
		System.out.println("gear: " + gear);
		System.out.println("wheel: " + wheel);
	}
	
	

}
