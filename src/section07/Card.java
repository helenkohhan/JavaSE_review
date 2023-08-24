package section07;

public class Card {
	
	// 정적(static) 변수
	public static int width = 62;
	public static int height = 88;
	
	public String type = "Spade";
	public String number= "A";
	
	// 즉, 모든 객체가 동일한 값을 가져야할 경우는 static변수를 사용하고
	// 모든 객체가 각각의 값을 가져야할 때는 일반변수를 사용하면 된다.
	// 이해하기 쉽게, 카드 게임을 할 때 매번 뽑는 한장한장의 카드의 크기는 동일하나
	// 카드에 적힌 모양과 문자는 다르다라는 것을 생각하면 된다.
	
	public void getInfo() {
		System.out.println("width:" + width);
		System.out.println("height:" + height);
		System.out.println("type:" + type);
		System.out.println("number:" + number);
		
	}
	
	

}
