package Week13;

public class RamenCooker extends run{
	
	String name;
	
	public RamenCooker() {
		for (int i = 0; i < 5; i++) {
			System.out.println("삐-");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) { }
		}
	}
	
	// 
	// 
	
	@Override
	public void run() {
		try {
		System.out.println("🍲" + name + " : 물을 끓이는 중...");
		Thread.sleep(1000);
		
		System.out.println("🍲" + name + " : 면을 넣는 중...");
		Thread.sleep(1000);
		
		System.out.println("🍲" + name + " : 라면 완성~!");
		Thread.sleep(2000);
		} catch(InterruptedException e) { }
	}
}
