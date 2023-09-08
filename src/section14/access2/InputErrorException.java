package section14.access2;

public class InputErrorException extends Exception{

	private String message;
	
	// 생성자 생성
	public InputErrorException(String message) { //message="입력이 잘못되었습니다."
		this.message = message;
		
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
	
}
