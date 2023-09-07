package section13;

public class OuterClass02 {
	public static void main(String[] args) {
//		OuterClass02.InnerClass.info();    		에러; 메서드가 static이 아니라서 정보가 없음. InnerClass의 객체생성이 필요
		new OuterClass02.InnerClass().info();	// InnerClass의 객체생성	
		
		OuterClass02.InnerClass inner = new OuterClass02.InnerClass();	// inner 변수 생성후 변수로 호출도 가능.
		inner.info();
	}

	static class InnerClass{
		public void info() {
			System.out.println("정적내부클래스의 동적일반메서드");
		}
	}
}
