package predicate;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

class User {
	String userName;
	String pwd;

	public User(String usernaString, String pwd) {
		this.userName = usernaString;
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", pwd=" + pwd + "]";
	}
	
	
}

public class App03_UserAuthenticationProgramUsingPredicate {
	public static void main(String[] args) {
		List<User> list = Arrays.asList(new User("shubham", "java"), new User("Ansh", "Javascript"),
				new User("Vatsal", "Php"));

		Predicate<User> p1 = user -> user.userName.equals("shubham") && user.pwd.equals("java");

		for (User usr : list) {
			if(p1.test(usr)) {
				System.out.println(usr);
			}
		}
	}
}
