package section15;
/*
 * 	java.time 패키지
 * 	 - 날짜 시간 관련 패키지
 * 	 - JDK8 이상 사용가능하다.
 * 
 */

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class JavaTime {
	public static void main(String[] args) {
		
		// 현재 날짜와 시간 가져오기
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("Current Date and Time: " + currentDateTime);
		
		// 날짜와 시간 분리
		LocalDate currentDate = currentDateTime.toLocalDate();
		LocalTime currentTime = currentDateTime.toLocalTime();
		System.out.println("Current Date: " + currentDate);
		System.out.println("Current Time: " + currentTime);
		
		// 특정 날짜와 시간 생성
		LocalDateTime specificDateTime = LocalDateTime.of(2023, Month.JANUARY, 1, 12, 0);
		System.out.println("Specific Date and Time: " + specificDateTime);
		
		// 날짜 연산 (1주일 후)
		LocalDateTime oneWeekLater = currentDateTime.plusWeeks(1);
		System.out.println("One Week Later: " + oneWeekLater);
		
		// 날짜를 형식에 맞게 포맷팅
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		String formattedDate = currentDateTime.format(dateFormatter);
		System.out.println("Formatted Date: " + formattedDate);
		
		//문자열을 날짜로 파싱
		String dateString = "2023.09.01";
		LocalDate parsedDate = LocalDate.parse(dateString, dateFormatter);
		System.out.println("Parsed Date: " + parsedDate);
		
		
		// 기본 시스템 타임존 가져오기
		ZoneId systemZone = ZoneId.systemDefault();
		System.out.println("System Time Zone: " + systemZone);
		
		// 특정 타임존으로 날짜와 시간 설정
		ZoneId newYorkZone = ZoneId.of("America/New_York");
		ZonedDateTime newYorkDateTime = ZonedDateTime.now(newYorkZone);
		System.out.println("New York Date and Time: " + newYorkDateTime);
		
		// 현재 UTC 시간 가져오기
		Instant currentUTC = Instant.now();
		System.out.println("Current UTC Time: " + currentUTC);
		
		
		
	}

}





