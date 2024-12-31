

public class User {
	private String userName;
	private boolean success = false;
	public boolean isSuccess() {
		return success;
	}
	
	public void setSuccess(boolean success) {
		this.success = success;
	}
	//Get method
	public String getUserName() {
		if(userName == null) return "WHOH";
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
