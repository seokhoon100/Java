package week2;

public class Hello {
	public static void main(String[] args) {
		//main 메소드 단축기 : main + ctrl + spacebar
		//main 메소드는 반드시 필요 => JVM이 main을 찾아서 실행 => 프로그램 실행릐 시작점
		//출력 단축기 : sysout + ctrl + spacebar 
		//실행 단축기 : ctrl + F11
		System.out.println("객체지향 프로그램");
		
		/*System.out.println("객체");
		 System.out.println("지향");*/
		
		//주석 단축기 : ctrl + /(토글키)
		System.out.println("/*객체지향*/ 프로그래밍");
		
		//숫자 출력 시 주의사항
		System.out.println(17 + 35);
		System.out.println("17 + 35 = " + (17 +35));
		
		//다양한 출력 포맷
		//문자열 포맷(printf)
		//% : 프린트 포맷 기호
		//%s: 문자열
		//%d: 정수
		//%f: 실수
		//\n: 줄바꿈
		
		System.out.printf("이름 : %s\n", "백석훈");
		System.out.printf("나이 : %d세\n", 25);
		
		System.out.printf("과목 : %s %s %s\n", "객체", "지향", "프로그래밍");
	}
}
