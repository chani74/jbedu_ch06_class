package sec01.exam;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체 선언 (생성) - Student 클래스로 stu1 객체 선언(생성)
		Student stu1 = new Student();
		Student stu2 = new Student();
		
		stu1.name = "hond gil-dong";
		stu1.age = 17;
		stu1.hakbun = "01234";
		stu1.grade = 4;
		
		stu2.name = "Lee soon-sin";
		stu2.age = 34;
		stu2.hakbun = "01235";
		stu2.grade = 3;
		
		stu1.study();
		stu2.study();
				
		
	}

}
