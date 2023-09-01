package section12.access2;

public interface Cat {
	
	// 인터페이스에서 static final 생략가능
	// 'public int PAW=4;' 로 표기할 수 있음
	public static final int PAW=4; 	// static 상수
	
	
	// 추상메서드로만 구성되어 있다. abstract 생략가능
	public abstract void eat();
	
	//abstract 생략해도 추상메서드이다.
	public void sleep();

	public abstract void hunt();
	
	
	
	
}
