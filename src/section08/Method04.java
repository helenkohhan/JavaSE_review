package section08;
/*
 * 
 * *****오버로딩(Overloading)******
 * 	 클래스 내에서 같은 이름을 가진 메서드를 여러개 정의하는 것을 말한다.
 * 	 매개변수 개수 또는 타입이 다르면 가능하다.
 * 	 
 * 	 즉, 같은 기능이지만, 입력값이랑 결과값 또는 연산하는 것이 달라질 수 있을때
 *   사용하는것이 오버로딩
 * 
 * 
 */

public class Method04 {
	
	
	public static void main(String[] args) {
		
		
		printPokemon("025","피카츄");
		printPokemon("025","피카츄","전기");
		printPokemon(25,"피카츄");
		
		
	}
	
	
	// 3번과 동일
	public static void printPokemon(String no, String name) {
		System.out.println("No. " + no);
		System.out.println("Name. " + name);
	}
	
	//4. *****오버로딩(overloading) 메서드
	public static void printPokemon(String no, String name, String type) {
		System.out.println("No. " + no);
		System.out.println("Name. " + name);
		System.out.println("Type. " + type);
	}
	
	// 타입만 달라져도 오버로딩이 가능하다.
	public static void printPokemon(int no, String name) {
		System.out.println("No. " + no);
		System.out.println("Name. " + name);
	}
	
	
	

}
