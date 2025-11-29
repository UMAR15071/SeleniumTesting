package selIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntro {

	public static void main(String[] args) {
		
		//WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\syedm\\Downloads\\geckodriver-v0.36.0-win-aarch64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();// Another method driver.quit() can be used if all tabs are required to be closed
	}

}
