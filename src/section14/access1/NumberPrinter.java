package section14.access1;

public class NumberPrinter {
	
	// printNumber메서드를 호출하는 곳에서 InterruptedException이란 예외를 처리하겠다.
	public void printNumber() throws InterruptedException {
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			
			Thread.sleep(1000);
			
		}
	}

}
