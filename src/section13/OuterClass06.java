package section13;

public class OuterClass06 {
	public static void main(String[] args) {
		
		String name = new Bird() {				// Bird라는 익명클래스 객체 생성

			private String name = "앵무새";		// 변수선언 가능
			
			@Override
			public void sing() {
				System.out.println("노래를 해요~");
			}
			
			@Override
			public void fly() {
				System.out.println("하늘을 날아요~");
			}
			
			public String getName() {	// 익명클래스 객체의 getName메서드
				return name;
			}
			
		}.getName();					// 익명클래스 객체의 getName메서드를 호출한것
		
		System.out.println("name: " + name);
		
// 		익명클래스와 일반 클래스(Birdimple.java)랑 비교하기
//      1)일반클래스		
//		Birdimpl bird = new Birdimpl();
//		String name2 = bird.getName();
//		System.out.println("name2: " + name2);

//      2)익명클래스		
		String name2 = new Birdimpl().getName();
		System.out.println("name2: " + name2);
		
		
		
	}

}
