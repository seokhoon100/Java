package Week12;

public class TV implements RemoteControl{
	//
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");	
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");	
		
	}

	@Override
	public void setVolume(int volume) {
		
		// 유효성 검사
		if(volume > MAX_VALUE)
			volume = MAX_VALUE;
		else if  (volume < MIN_VALUE)
			volume = MIN_VALUE;
		
		this.volume = volume;
		System.out.println("현재 볼륨 : " + volume);	
	}
}