package sec06.exam.member;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberDto mDto = new MemberDto();
//		mDto.memberAge // <- not visible error!!
		
		String Id = "Tiger";
		String Pw = "123456";
		String name = "이은찬" ;
		int Age = 50;
		String phone = "010-8638-4832";
		String address = "서울시 성동수 성수 2가 3동";
		
		mDto.setMemberId(Id);
		mDto.setMemberPw(Pw);
		mDto.setMemberName(name);
		mDto.setMemberAge(Age);
		mDto.setMemberPhone(phone);
		mDto.setMemberAddress(address);
		
		System.out.println(mDto.getMemberId());
		
		
	}

}
