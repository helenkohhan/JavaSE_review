package section09;

public class Book {
	// 전역변수들은 값이 초기화(대입)가 안되어있으면 default값이 들어감.
	// 즉, 참조형변수들은 null이, 정수형은 0이 들어감
	String title;
	int price;
	int totalPage;
	String author;
	
	
	
	// 생성자 : 객체 생성시 실행
	// - 생성자는 메서드처럼만들어주면 되지만, 메서드와 다른점은 반환값이 없다. 
	//   메서드는 반환값이 없을 때 void를 적지만, 생성자는 void type 자체를 적지않는다.
	
	// this - 자기자신 참조 키워드
	
	public Book() {
		// 멤버 초기화
		this.title = "멘토씨리즈 자바";
		this.price = 32000;
		this.totalPage = 603;
		this.author = "김영우";
		
	}
	
	
//	  String title;, int price;, int totalPage;, String author; 변수들을 출력해주는 메서드
	public void getInfo() {
		System.out.println("title: " + title);
		System.out.println("price: " + price);
		System.out.println("totalPage: " + totalPage);
		System.out.println("author: " + author);
	}
	
	
}
