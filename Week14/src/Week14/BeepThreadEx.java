package Week14;

public class BeepThreadEx {
	public static void main(String[] args) {
		// main 스레드
		// 작업 스레드 생성
		Thread thread = new BeepThread();
		thread.start();
		
		// main 작업
		for (int i = 0; i < 5; i++) {
			System.out.println("***");
		}
	}
}
