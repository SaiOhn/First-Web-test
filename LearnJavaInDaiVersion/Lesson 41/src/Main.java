

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setUserName("Sai Ohn Myint");
		user.setSuccess(true);
		System.out.println(user.getUserName().toLowerCase());
		 System.out.printf("Are you a successful man - " + user.isSuccess() );
	
	}
	
	

}
