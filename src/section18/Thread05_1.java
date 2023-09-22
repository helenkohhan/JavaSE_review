package section18;
/*
 * Thread05를 익명클래스와 람다식으로 표현
 * 
 */

public class Thread05_1 {
	public static void main(String[] args) {
		
		//[1]
		System.out.println("메인 스레드 시작!");
		
		Thread thread = new Thread(() -> {
				System.out.println("익명 클래스 스레드 시작!");
				try {
					Thread.sleep(2000);		//2초 일시정지
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("익명 클래스 스레드 종료!");
		});
		
		thread.start();
		
		
		System.out.println("메인 스레드 종료!");
		
		//[2]
		 new Thread(() -> {
			System.out.println("익명 클래스 스레드 시작!");
			try {
				Thread.sleep(2000);		//2초 일시정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("익명 클래스 스레드 종료!");
		}).start();
		
		
		System.out.println("메인 스레드 종료!");
		
		
	}

}
