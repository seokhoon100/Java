package Week12;

public class Audio implements RemoteControl{
	private int volume;
	private int memoryVol;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다");	
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다");	
		
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	// default 메소드도 필요한 경우 재정의 가능
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVol = this.volume;
			System.out.println("--Audio 무음 처리--");	
			System.out.println("--현재 볼륨 크기--" + this.volume);	
			setVolume(MIN_VALUE);
		}
		else {
			System.out.println("--Audio 무음 해제--");	
			setVolume(memoryVol);
			System.out.println("--현재 볼륨 크기--" + this.volume);	
		}
	}

}