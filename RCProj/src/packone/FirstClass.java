package packone;

import com.thoughtworks.selenium.DefaultSelenium;

public class FirstClass {

	public static void main(String[] args) {
		
		DefaultSelenium s=new DefaultSelenium("localhost", 4444, "*firefox ‪C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe", "http://");
		s.start();
		s.open("http://facebook.com");
		s.windowMaximize();
		

	}

}
