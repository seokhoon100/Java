package Week10;

public class SmartPhoneEx extends Phone {
	public static void main(String[] args) {
		SmartPhone mine = new SmartPhone("갤럭시", "white");
		
		System.out.println("모델 : " + mine.getModel);
		System.out.println("색상 : " + mine.getColor);
		System.out.println("wifi : " + mine.iswifi());
		
		mine.bell();
		mine.sendVoice("Hello");
		mine.sendVoice("Hello");
		mine.hengup();
		
	}
}