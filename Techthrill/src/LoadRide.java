//overloading
class Authentication{
	void login(String email, String password) {
		System.out.println("Logging in successfully with username and password");	
		}
	void login(String phone, long otp) {
		System.out.println("Logging in successfully with mobile number and OTP");
	}
}
//overriding
class Theme{
	void themeColorScheme() {
		System.out.println("Primary color: Red");
		System.out.println("Secondary color: blue");
	}
	void darkToLightMode(boolean enable) {
		System.out.println("Mode enabled from black to white");
	}
}

class CustomTheme extends Theme{
	void themeColorScheme() {
		System.out.println("Primary color: Saffron");
		System.out.println("Secondary color: white");
	}
	void darkToLightMode(boolean enable) {
		System.out.println("Mode enabled from dark grey to amber and white");
	}
}
public class LoadRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
