package package1;

public class ClassC {
	// 패키지가 다르면 반드시 import
	// public : 패키지가 달라도 호출 가능
	ClassA c1 = new ClassA(true);
	
	// default : 패키지가 달라도 호출 가능
	// ClassA c2 = new ClassA(10);
	
	// private : 자기 패키지가 달라도 호출 가능
	// ClassA c3 = new ClassA("문자열");
	
	
	
}