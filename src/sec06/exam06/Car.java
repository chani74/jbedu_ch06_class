package sec06.exam06;

public class Car {
	//field
	private int speed;
	private boolean stop ;
	
	//creator
	
	// method
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0 ;
			return;
		} else {
			this.speed = speed;
		}
		
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed  = 0;
	}
	
	
}
