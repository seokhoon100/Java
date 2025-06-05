package Week12;

public class TonFree implements EarPhone {
	
	public TonFree() {
		System.out.println("\nLG TonFree 이어폰 연결");
	}
	@Override
	public void play() {
		System.out.println("LG TonFree 음악 재생 중~");
	}

	@Override
	public void stop() {
		System.out.println("LG TonFree 음악 재생 종료");
	}
	
}
