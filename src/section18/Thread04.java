package section18;

public class Thread04 {
	public static void main(String[] args) {
		
		System.out.println("메인 스레드 시작!");
		
		
//		1) Runnable 인터페이스를 InterThread로 상속받아 구현한다. 
//		2) 그리고 Thread 생성하여, 생성한 객체의 매개변수로 interThread를 넣어주면 된다.	
		
//		Runnable interThread = new InterThread();
//      Runnable을 적든, InterThread를 적든 상관없음
		InterThread interThread = new InterThread();
		Thread thread = new Thread(interThread);
		thread.start();
		
		
		System.out.println("메인 스레드 종료!");
		
		
	}

}
