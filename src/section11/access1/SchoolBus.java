package section11.access1;

public class SchoolBus extends Bus {
	// schoolbus가 bus의 상속을 받음
	
	public SchoolBus() { 	//SchoolBus 생성자 생성
		type="스쿨버스";
		color="Yellow";
		
	}
	
	@Override
	public void drive() {
		System.out.println("학생을 태우고 운전합니다.");
	}
	
	public void stopPannel() {
		System.out.println("학생 하차시 정지 판넬 작동!");
	}
	
	
	

}
