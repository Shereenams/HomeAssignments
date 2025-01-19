package week1.day2;

public class Browser {

	public String launchbrowser(String browserName) {
		System.out.println("Browser lunched successfully");
		return browserName;
	}
	public void loadURL() {
		System.out.println("Application URL loaded successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser ob= new Browser();
		ob.launchbrowser("chrome");
		ob.loadURL();
	}

}
