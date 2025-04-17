package week3;

public class TwoOperand2 {
	public static void main(String[] args) {
		// 이항 연산자 : 비교 연산자 (<, >, <=, >=, ==(같다), !=(다르다))
		// 논리 연산자 : &&(and, &), ||(or, |)
		
		int charCode1 = 'A';
		if (charCode1 >= 65 && charCode1 <= 90) {
			// True && True == True
			// 65와 90 사이인 경우
			System.out.println((char)charCode1 + "는 대문자다.");
		}
		
		int charCode2 = 'b';
		if ((char)charCode2 >= 97 && charCode2 <= 122) {
			System.out.println((char)charCode2 + "는 소문자다.");
		}
		
		char charCode3 = '9';
		if (!(charCode3 < 48) && !(charCode3 > 57)) {
			System.out.println(charCode3 + ": 0 ~ 9 사이의 수");
		}
		
		int iValue = '4';
		// % : 나눈 나머지
		if ((iValue % 2) == 0) {
			System.out.println(iValue + ": 2의 배수 or 짝수");
			
		// 2의 배수이거나 (or, ||) 3의 배수인지 체크
		if ((iValue % 2 == 0) || (iValue % 3 == 0) ) 
			// True || False => True
			System.out.println(iValue + ": 2의 배수 or 짝수");
		}
		
		
	}
}





