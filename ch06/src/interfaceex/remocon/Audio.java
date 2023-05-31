package interfaceex.remocon;

public class Audio implements RemoteControl{
	
	private int volumn;

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volumn > RemoteControl.MAX_VOLUME) {
			this.volumn = RemoteControl.MAX_VOLUME;
		}
		else if(volumn < RemoteControl.MIN_VOLUME) {
			this.volumn = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volumn = volume;
		}
		System.out.println("현재 오디오 볼륨: " + this.volumn);
		
	}

}
