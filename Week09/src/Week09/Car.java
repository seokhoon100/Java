package Week09;

public class Car {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if (gas == 0) {
			return false;
		}
		return true;
	}
	
	void run() {
		while (gas > 0) {
			System.out.println("달립니다. (gas 잔량 :" + gas + ")");
			gas -= 1;
		}
		System.out.println("달립니다. (gas 잔량 :" + gas + ")");
	}
	
}