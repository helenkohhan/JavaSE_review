package section06;

public class ArrayHomeWorkTA {
	public static void main(String[] args) {
		
		// 7*7 2중배열 선언
		int[][] array=new int[7][7]; 
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j] = (i*7)+1+j;
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
		
		
	}

}
