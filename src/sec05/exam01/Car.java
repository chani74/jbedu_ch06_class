package sec05.exam01;

public class Car {
	//필드
	String model;
	int speed;
	
	//creator
	Car(String model){
		this.model = model	;
	}

	//method
	void setSpeed(int speed) {
		this.speed = speed;
	}

	void run() {
		for (int i=10;i<=50;i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + " is running..(speed:"+this.speed+"km/h)");
		}
	}
}

