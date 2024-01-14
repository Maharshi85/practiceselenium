package normalproject.in;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice_One {

	public static void main(String[] args) {
		//WebDriver dri=new ChromeDriver();
		WebDriver dri=new EdgeDriver();
		dri.manage().window().maximize();
		dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dri.get("http://localhost:8888");
		dri.findElement(By.name("user_name")).sendKeys("admin");
		dri.findElement(By.name("user_password")).sendKeys("password");
		dri.findElement(By.id("submitButton")).click();
		//push and pull done
	}
}
