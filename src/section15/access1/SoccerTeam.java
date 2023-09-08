package section15.access1;

public class SoccerTeam implements Cloneable {
	
	public String teamName;
	public String location;
	public int since;
	public String league;
	
	//생성자 만들고 매개변수에 위의 값들 넣어주기
	public SoccerTeam(String teamName, String location, int since, String league) {
		
		this.teamName = teamName;
		this.location = location;
		this.since = since;
		this.league = league;
		
	}
	
	@Override
	public String toString() {
		return teamName + "@" + league;
	}
	
	
	// 접근제한자가 protected면 같은 패키지거나 상속받은 상태에서만 접근가능
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	//clone을 public한 메서드로 감싸주어, 패키지가 다르고 상속을 받지 않은
	// JavaLang02 클래스에서 SoccerTeam sTeam3 = (SoccerTeam) sTeam1.callClone();을 구현함
	public Object callClone() throws CloneNotSupportedException{
		return clone();
	}
}
