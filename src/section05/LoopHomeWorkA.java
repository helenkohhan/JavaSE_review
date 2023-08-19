package section05;

public class LoopHomeWorkA {
	public static void main(String[] args) {
		 
		System.out.println("1번 문제입니다.");
		for(int i=0; i<7; i++) {
			for(int j=0; j< i+1; j++) {
			System.out.print("*");
			}
		System.out.println();
	}
		
		System.out.println();
		System.out.println();
		
		System.out.println("2번 문제입니다.");
		for(int i=0; i<4; i++) {
			for(int j=0; j<3-i; j++) {
			System.out.print(" ");	
			}
			for(int k=0; k<i+1; k++ ) {
				System.out.print("*");
			}
		System.out.println();
		}	
	
		
		System.out.println();
		System.out.println();
		
		System.out.println("3번 문제입니다.");
		for(int i=0; i<4; i++) {
			for(int j=0; j<3-i; j++) {
				System.out.print(" ");
				}
				for(int k=0; k<(2*i)+1; k++) {
				System.out.print("*");		
				}
		System.out.println();		
		}	
		
		System.out.println();
		System.out.println();
		
		
	   System.out.println("4번 문제입니다.");
	    for(int i=0; i<7; i++) {
	    	if(i<4) {
	    		for(int j=0; j<6-i; j++) {
	    			System.out.print(" ");
	    		}for (int k=0; k<(2*i)+1; k++) {
	    			System.out.print("*");
	    		}
	    	} else { 
	    		for(int j=0; j<i; j++) {
	    			System.out.print(" ");
	    		}for(int k=0; k<9-(i*2)+4 ; k++) {
	    			System.out.print("*");
	    		}
	    	}
	    	System.out.println();
	    }
	   
       
	}  
	}


