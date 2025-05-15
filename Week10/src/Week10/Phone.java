package Week10;

public class Phone {
	// 자식 객체가 가지는 공통된 속성과 기능을 선언
	// private 인 경우에는 상속이 안됨
	public String model;
	public String color;
	
	public Phone() {
		// TODO Auto-generated constructor stub
		// 기본 생성자
		this.model = model;
		this.color = color;
		
		System.out.println("Phone 생성자 호출");
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
	public void bell() {
		System.out.println("벨이 울립니다");
	}
	
	public void sendVoice(String msg) {
		System.out.println("나 : " + msg);
	}
	
	public void receiveVoice(String msg) {
		System.out.println("너 : " + msg);
	}
	
	public void bell() {
		System.out.println("벨이 울립니다");
	}
}