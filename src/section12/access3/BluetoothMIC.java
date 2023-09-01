package section12.access3;

//인터페이스 끼리 상속은 extends 키워드로! 다중상속도 가능!
public interface BluetoothMIC extends Microphone, Speaker {
	
	public abstract void connect();
	
	
	
}
