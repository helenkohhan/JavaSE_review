package section11;
/*
 * ****다형성(Polymorphism)

 * 	   같은 인터페이스 또는 부모클래스를 공유하는 객체가
 * 	   여러 유형의 타입을 가질 수 있는 기능을 말한다.
 * 
 */

import section11.access1.Bus;

import section11.access1.Car;

public class Polymorphism01 {
	public static void main(String[] args) {
		Bus bus1 = new Bus();
		bus1.drive();
		bus1.clickBell();
		System.out.println("================");
		
		
		Car car = new Bus();	//변수선언&타입을 Car로 했지만, 객체 생성은Bus 
								//>>> 이게 가능한 이유는 Bus가 Car를 상속받고 있기 때문에.
								//이것이 바로 다형성이다! 
		car.drive(); 			//타입은 car이지만, bus의 drive가 호출된다.
//		car.clickBell(); // car타입에 clickBell이 없기에 문법상오류; 컴파일러가 컴파일 에러발생
						 // 정체는 Bus지만, 껍데기가 Car라서 car에 있는 메서드만 실행가능한 것
		
		
		System.out.println("================");
		// 부모타입에서 자식타입으로 대입시 형변환필수!
		// Car껍데기를 Bus 껍데기로 바꿔줘서, bus의 메서드들을 사용할 수 있게된것
		Bus bus2 = (Bus)car;
		bus2.drive();
		bus2.clickBell();
		
		
	}

}




