package Week14;

public class BeepTaskEx{
	public static void main(String[] args) throws InterruptedException {
		// Thread 
		// 
		// 구현 객체 생성
		
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("***");
			Thread.sleep(1000);
		}
	}
}
