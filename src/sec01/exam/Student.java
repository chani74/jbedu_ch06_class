package sec01.exam;

public class Student {
	
	// 속성, 필드 ,멤버변수
	String schoolName = "korea 학교";
	String name; // 학생이름
	int age ; // 	학생나이 
	String hakbun; // 학번
	int grade;	// 학년
	
	
	// 메소드 ( 클래스 나에 선언된 함수 
	public void study() {
		System.out.println(name + "님이 공부합니다.!!");
	}
	
	public void play() {
		System.out.println(name + "님이 놀러갑니다.!!");
	}
}
