package submit04.model;

public class MemberVO {

	private String memId;
	private String memPw;
	
	public MemberVO() {}
	
	// 회원가입 때 쓸 생성자
	// 아이디 비밀번호
	public MemberVO(String memId, String memPw) {
		this.memId = memId;
		this.memPw = memPw;
	}
	
	@Override
	public String toString() {
		return "MemberVO [memId=" + memId + ", memPw=" + memPw + "]";
	}
	
	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPw() {
		return memPw;
	}

	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}
	
}
