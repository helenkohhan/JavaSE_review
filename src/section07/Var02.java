package section07;

public class Var02 {
	public static void main(String[] args) {
		
		Card card1 = new Card();
		Card card2 = new Card();
		
		
		
		System.out.println("====card1====");
		card1.getInfo(); 

		System.out.println("====card2====");
		card2.getInfo(); 
		
		
		card1.number = "Q";
	  //card1.width = 70; // card1이라고 선언해도, 
		                  // width는 static 변수로 선언했기에 (static변수는 모든 객체가 공유함)
		                  // card1,card2의 width가 모두 바뀐다.
						  // 따라서 굳이 card1.width보단 Card.width라고 접근하면 된다.
		Card.width = 70;
		
		
		System.out.println("====card1====");
		card1.getInfo(); 

		System.out.println("====card2====");
		card2.getInfo(); 
		
		
	}

}
