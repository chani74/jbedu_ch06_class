package sec04.exam;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		System.out.println(car1.maxSpeed);
		car1.company = "Hyundai";
		car1.drive();

		Car car2 = new Car();
		car2.company = "Kia";	
		
	}

}
