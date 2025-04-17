package week2;

public class DataType2 {
	public static void main(String[] args) {
		//char 데이터 타입 => 정수값 저장
		//char => 음수가 없다!
		char cData1 = 'A';		//문자 리터럴 직접 저장
		char cData2 = 65;		//10진수로 저장
		char cData3 = '\u0041'; //16진수로 저장
		System.out.println("cData1 = " + cData1);
		System.out.println("cData2 = " + cData2);
		System.out.println("cData3 = " + cData3);
		
		char cData4 = '가';
		char cData5 = 44032;
		char cData6 = '\uac00';
		System.out.println("cData4 = " + cData4);
		System.out.println("cData5 = " + cData5);
		System.out.println("cData6 = " + cData6);

		String cData7 = "B";
		String cData8 = "하";
		String cData9 = "&";
		System.out.println("cData7 = " + cData7);
		System.out.println("cData8 = " + cData8);
		System.out.println("cData9 = " + cData9);
		
		//char 타입 변수의 유니코드 값을 알고 싶으면 int 타입에 대입
		String cData10 = cData7 + cData9;
		String cData11 = (String)(cData7 + cData9);
		System.out.println("cData10 = " + cData10);
		System.out.println("cData11 = " + cData11);
		
	}
}










