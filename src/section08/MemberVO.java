package section08;
/*
 * this - 자기자신을 가리키는 참조키워드
 * 
 */



public class MemberVO {
	
	//private - 자기자신 클래스에서만 접근 가능한 접근제한자
	// 자기 클래스안에서만 접근가능하게 막아두는 것 = private
	private String id;
	private String pwd;
	private String name;
	private int age;
	private String mobile;
	
	
	// 마우스 우클릭 -> source -> Generate Getters and Setters
	// 접근제한자가 public으로 생겨났으므로, 외부에서도 접근가능하게됨
	// 변수 하나당 get과 set 2개가 생겨나며,
	// get = 값을 돌려받는 메서드, set = 값을 입력받는 메서드
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;	 
		// this.id는 자기자신의 값이니까 클래스의 변수인 private String id를 의미.
		// 즉, String 매개변수로 받은 값인 id를 
		// 전역변수인 this.id에 넣겠다라고 생각하면된다. 
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age <= 0) {
			System.out.println("잘못된 수를 입력하였습니다.");
			return; //메서드 종료
		}
		
		this.age = age;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	

}
