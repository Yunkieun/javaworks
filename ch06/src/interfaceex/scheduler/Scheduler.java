package interfaceex.scheduler;

public interface Scheduler {
	// 다음 전화를 가져오기
	public void getNextCall();
	
	// 상담원에게 전화를 배분학
	public void sendCallToAgent();

}
