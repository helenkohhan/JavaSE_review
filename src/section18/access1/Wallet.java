package section18.access1;

public class Wallet {
	
	public int totalMoney;
	
	public Wallet() {
		this.totalMoney = 10000;
	}

//[방법 1]
//      동기화 메서드(synchronized) - Thread Safe
//	public synchronized int getMoney() {
//		if(totalMoney == 0) {
//			return 0;
//		}
//		
//		totalMoney -= 1;
//		return 1;
//	}
	
//[방법 2]	
	public int getMoney() {
		if(totalMoney == 0) {
			return 0;
		}
		
		synchronized (this) {
			totalMoney -= 1;
		}
		
		return 1;
	}
	

}
