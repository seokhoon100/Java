package Week10;

public class Car {
	// 객체지향 프로그램에서는
	// 클래스
	private String company;
	private String model;
	private String color;
	private int 		 maxSpeed;
	
	// 외부에서 값이 필요한 경우
	// 값을 제공하기 위해 getter() 메소드 선언
	public String getCompany() {
		return company;
	}
	
	// 외부에서 값을 지정해 주는 경우
	// setter() 메서드 이용
	// 이 때, 유효성 검사도 가능
    public void {
    	
    }

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaxSpeed(int maSpeed) 
	{
		// 유효성 검사 가능
		if (maxSpeed > 350)
			maxSpeed = 350;
		else
			this.maxSpeed = 350;
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void setCompany(String company) {
		this.company = company;
	}
}