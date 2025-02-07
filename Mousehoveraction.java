package mousehoveraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehoveraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions action=new Actions(driver);
		WebElement all=driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span"));
		action.moveToElement(all).perform();
		all.click();
		Thread.sleep(2000);
		WebElement bestseller=driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a"));
		action.moveToElement(bestseller).perform();
		bestseller.click();
	}

}
