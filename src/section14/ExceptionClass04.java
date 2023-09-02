package section14;
/*
 * 	Exception 종류
 *	1. 
 * 
 * 	2. 
 * 	
 * 
 * 
 */

public class ExceptionClass04 {
	public static void main(String[] args) {
		
		for(int i =0; i<10; i++) {
			System.out.println(i);
			
			try {
				//1초 일시정지(밀리세컨즈)
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
