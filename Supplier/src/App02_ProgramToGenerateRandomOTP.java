import java.util.Iterator;
import java.util.function.Supplier;

public class App02_ProgramToGenerateRandomOTP {

	public static void main(String[] args) {
		Supplier<String> s1 = () -> {
			String otp = "";
			for (int i = 0; i < 4; i++) {
				otp+=(int)(Math.random()*4);
			}
			
			return otp;
		};
		
		System.out.println(s1.get());
	}

}
