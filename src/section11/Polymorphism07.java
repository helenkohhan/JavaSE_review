package section11;

import section11.access3.Ade;
import section11.access3.Coffee;
import section11.access3.Drink;

public class Polymorphism07 {
	public static void main(String[] args) {
		
		// 부모타입으로 자식객체를 형성가능하다는 것을 알아둬야함
		// 껍데기는 drink로 되어 있지만 진짜는 ade와 coffe임 
		Drink drink1 = new Ade();
		Drink drink2 = new Coffee();

		//instanceof = drink1이 ade로 되어있는지를 확인해주는 연산자
		System.out.println(drink1 instanceof Ade);
		System.out.println(drink1 instanceof Coffee);

		System.out.println(drink2 instanceof Ade);
		System.out.println(drink2 instanceof Coffee);
	
	
	}

}
