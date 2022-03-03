package kr.co.ict;

public class UserVO {
	// VO는 특정 테이블의 자료를 자바형식으로 저장하기 위해 선언합니다.
	// 그래서 SQL 데이터를 자바로 옮겨오기 위해서 
	// 1. 담당할 테이블의 컬럼을 전부 변수로 만듭니다.
	private String uId;
	private String uPw;
	private String uNick;
	private String uAge;
	private String uCard;
	private String uAdress;
	
	// 2. 생성자, getter, setter를 만들어주세요.
    // 우클릭 -> source -> generate setters and getters (setter, getter)
	// 우클릭 -> source -> generate constructor using fields (생성자)

	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getuPw() {
		return uPw;
	}

	public void setuPw(String uPw) {
		this.uPw = uPw;
	}

	public String getuNick() {
		return uNick;
	}

	public void setuNick(String uNick) {
		this.uNick = uNick;
	}

	public String getuAge() {
		return uAge;
	}

	public void setuAge(String uAge) {
		this.uAge = uAge;
	}

	public String getuCard() {
		return uCard;
	}

	public void setuCard(String uCard) {
		this.uCard = uCard;
	}

	public String getuAdress() {
		return uAdress;
	}

	public void setuAdress(String uAdress) {
		this.uAdress = uAdress;
	}
	
	// 3. (선택)toString을 만들어주세요.
		// toString은 콘솔이나 화면에 UserVO를 찍었을때 주소대신 내부 데이터가 나오도록 해 줍니다.
		// source -> generate toString()
			
		@Override
		public String toString() {
			return "UserVO [uId=" + uId + ", uPw=" + uPw + ", uNick=" + uNick + ", uAge=" + uAge
					+ ", uCard=" + uCard + ", uAdress=" + uAdress + "]";
		}
	
}












