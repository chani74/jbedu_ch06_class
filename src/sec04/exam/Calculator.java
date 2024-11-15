package sec04.exam;

public class Calculator {
	// field
	
	int first;
	int second ;
	
	
	
	// creator
	public Calculator() {
		
	}
	
	public Calculator(int first, int second) {
		this.first = first;
		this.second = second;
	}
	
	
	// method
	int add2 () {
		int result = this.first + this.second;
		return result;
	}
	
	int add ( int first , int second) {
		
		this.first = first;
		this.second = second;
		
		int result = this.first + this.second;
		return result;
	}
	
	int sub( int first , int second) {
		
		this.first = first;
		this.second = second;
		
		int result = this.first - this.second;
		return result;
	}
	
	int mul( int first , int second) {
		
		this.first = first;
		this.second = second;
		
		int result = this.first * this.second;
		return result;
	}
	
	double div( int first , int second) {
		
		this.first = first;
		this.second = second;
		
		int result = this.first / this.second;
		return result;
	}		
	
	double average() {
		double result = add2()/2; // 클래스 내부 메소드 호출
		return result;
	}
	
	double average2(int first , int second) {
		double result = add(first, second)/2; // 클래스 내부 메소드 호출
		return result;
	}
}
