package sec05.exam04;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Singleton obj1 = new Singleton();
		Singleton obj2 = new Singleton();
		 // 컴파일 에러 남 
		*/
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1==obj2) {
			System.out.println("같은 싱글톤 객체입니다.");
		} else {
			System.out.println("다른 싱글톤 객체입니다.");
		}
		
	}

}
