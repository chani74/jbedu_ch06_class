package sec04.exam05;

public class Car {

	//필드
	int speed ;
	
	//생성자
	
	//메소드
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("key Trun on. ");
	}
	
	void run() {
		for (int i=10;i<=50;i+=10) {
			speed = i ;
			System.out.println("run..(speed:"+speed+"km/h)");
		}
	}
}
