package section08;
/*
 * - VO(Value Object) = DTO(Data Transfer Object)
 * 	 : 값 오브젝트로써 목적의 맞는 변수의 집합
 * 	   Database 또는 네트워크 통신 간 값 운반용으로 사용된다.
 * 
 * 
 * - 캡슐화(정보은닉) : 객체의 속성과 행위를 하나로 묶고
 * 				    외부로부터 내부를 감싸 숨겨 은닉한다. -> 보안성이 올라간다.
 * 					= private으로 묶는 것	
 * 
 */ 




public class Method10 {
	public static void main(String[] args) {
		MemberVO memberVO = new MemberVO();
		
		// 값을 입력
		memberVO.setId("abc");
		memberVO.setPwd("abc123!@#");
		memberVO.setName("홍길동");
		memberVO.setAge(-17); // default 값인 '0'이 나온다.
		memberVO.setMobile("01012345678");

		// 값을 가져옴
		String id = memberVO.getId();
		String pwd = memberVO.getPwd();
		String name = memberVO.getName();
		int age = memberVO.getAge();
		String mobile = memberVO.getMobile();
		
		System.out.println("id: " + id);
		System.out.println("pwd: " + pwd);
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("mobile: " + mobile);
		
		
	}

}
