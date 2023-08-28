package section10.access1;


// this - 자기자신을 가리키는 참조키워드
// super - 부모의 참조 연산자 (=부모 객체를 가리키는 애)


public class MountainBike extends Bicycle {
	public boolean isSuspension;
	
	@Override
	public void getInfo() {
		super.getInfo();	 // 부모 getInfo() 호출
		System.out.println("isSuspension: " + isSuspension);
	}

}
