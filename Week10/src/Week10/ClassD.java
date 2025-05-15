package Week10;

public class ClassD {
	// 필드의 접근제한자
	public int field1;
	int field2;				// 접근제한자가 생략 => default
	private int field3;

	public ClassD() {
		// 클래스 내부에서는 영향을 밭지 않는다
		field1 = 10;
		field2 = 10;
		field3 = 10;
		
		method1();
		method2();
		method3();
	}
	
	public void method1() { }
	void method2() { }				// 생략되면 default
	private method3() { }
}