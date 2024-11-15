package sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("123456-1234567", "홍길동"	);
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "USA";				// final 변수는 수정 불가, 오류남
//		p1.ssn	= "111111-1111111";		// final 변수는 수정 불가, 오류남
		p1.name = "이길동";
		
	}

}
