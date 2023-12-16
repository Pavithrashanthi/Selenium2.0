package newbasicproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAVITHRA\\OneDrive\\Desktop\\Pavithra Learnings\\Selenium_New\\chrome-win64\\chrome-win64\\chrome.exe");
//ChromeOptions options = new ChromeOptions();
//options.addArguments("--remote-allow-origins=*");
WebDriver driver = new ChromeDriver();
//driver = new ChromeDriver();


driver.manage().window().maximize();

//driver.get("https://www.google.co.in/");
driver.get("https://www.gmail.co.in/");


driver.close();
	}

}
