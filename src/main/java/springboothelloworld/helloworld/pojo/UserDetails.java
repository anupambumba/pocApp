package springboothelloworld.helloworld.pojo;

public class UserDetails {
	private String memberId=null;

	public UserDetails() {
		super();
	}

	public UserDetails(String memberId) {
		super();
		this.memberId = memberId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	

}
