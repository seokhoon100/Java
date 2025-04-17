package week3;

public class OneOperand3 {
	public static void main(String[] args) {
		// 단항 연산자 : ++, -- (증감 연산자)
		// ++ : 자신의 값에 1을 더한다
		int x =10;
		int y =10;
		int z;
		
		// ++ 기호가 앞에 있으면 시작 전에 1증가
		System.out.println("++x = " + (++x));
		// ++ 기호가 뒤에 있으면 시작 후 다음 라인으로 지나가면서 값이 1증가
		System.out.println("x++ = " + (x++));
		System.out.println("x = " + x);
		
		// x = 12
		// --기호 : 자신의 값 1 감소
		
		z = x++;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		
		// z = 12, x = 13
		z = ++x + y--;
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}





