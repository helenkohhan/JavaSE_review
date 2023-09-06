package section11;

/*
 * ****instanceof 연산자

 * 	객체가 특정 클래스 또는 인터페이스의 인스턴스인지 여부를 확인하는 연산자
 * 
 */


import java.util.Scanner;


import section11.access3.Ade;
import section11.access3.Coffee;
import section11.access3.Drink;


public class Polymorphism06 {
	public static void main(String[] args) {
		
		int chooseNum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1) 코카콜라");
		System.out.println("2) 아메리카노");
		System.out.println("음료를 선택하세요>>>");
	
	
		chooseNum = scan.nextInt();
		
		System.out.println("선택한 번호: " + chooseNum);
	
		
		Drink drink = chooseDrink(chooseNum);
		
		if(drink instanceof Ade) {
			Ade ade = (Ade)drink;		// 자동형변환된 부모객체를 다시 자식객체로 강제형변환시킨것
			ade.setZero(true);			// 그로인해, 자식객체에만 있는 setZero메서드를 호출할 수 있음
			ade.getInfo();
			ade.getDiscountInfo();
		} else if(drink instanceof Coffee) {
			Coffee coffee = (Coffee) drink;
			coffee.setDecaf(true);
			coffee.getInfo();
			coffee.getDiscountInfo();
		}
			
	}
	
	/**
	 * 음료선택 메서드
	 * 
	 * 
	 * @param chooseNum 1: Ade, 2:Coffee
	 * @return Drink
	 * 
	 */
	public static Drink chooseDrink(int chooseNum) {
		Drink drink = null;		//  지역변수이며, null로 초기화한 상태
		
		if(chooseNum == 1) {
			drink = new Ade();
		} else if (chooseNum == 2) {
			drink = new Coffee();
		}
		return drink;
	}
	

}
