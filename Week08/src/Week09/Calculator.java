package Week09;

public class Calculator {
	String  color;
	String  size;
	
	public Calculator(String color, String size)
	{
		this.color = color;
		this.size = size;
	}

	void PowerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void PowerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	int plus(int x, int y) {
		return x+y;
	}
	
	double divide(int x, int y) {
		return (double)x/y;
	}
	
	int sum1(int[] values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++)
			sum += values[i];
		return sum;
	}
	
	int sum2(int...values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++)
			sum += values[i];
		return sum;
	}
}