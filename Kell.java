package kell;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Kell {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://143.244.141.48:5173/login");
		driver.findElement(By.name("email")).sendKeys("secret@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Secret@123");
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/form/button")).click();
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		WebElement add_entity=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/div/ul/li[2]/div/div[2]/p"));
		action.moveToElement(add_entity).perform();
		//component.click();
		WebElement node=driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[3]/div/div[2]/span"));
		action.moveToElement(node).perform();
		node.click();
		Thread.sleep(2000);
		
		
		
		
		//Creating node
		
		
		WebElement addentity=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/div/ul/li[2]/div/div[2]/p"));
		//action.moveToElement(add_entity).perform();
		addentity.click();
		WebElement zones=driver.findElement(By.xpath("/html/body/div[2]/div[3]/ul/li[4]/div/div[2]/span"));
		action.moveToElement(zones).perform();
		zones.click();
		Thread.sleep(2000);
		
		for (int k = 701, l = 701 , m=701, n=701; k <= 799 && l <= 799 && m<=799 && n<=799; k++, l++, m++, n++) {
			
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/button")).click();
		WebElement dropdown2 = driver.findElement(By.cssSelector("#demo-simple-select"));
		//
//					// Click on the dropdown to open it
					dropdown2.click();
		Thread.sleep(2000);
//					// Locate the option you want to select using CSS Selector
					//WebElement option2 = driver.findElement(By.cssSelector("nodes"+k));
					WebElement option2 = driver.findElement(By.xpath("//li[text()='nodes" + k + "']"));
		//
//					// Click the option to select it
					option2.click();
		
		
		//Select nodes=new Select(driver.findElement(By.xpath("//*[@id=\"demo-simple-select\"]")));
		//option2.selectByVisibleText("node"+ k);
		driver.findElement(By.name("description")).sendKeys("description");
		driver.findElement(By.name("zonename")).sendKeys("zone1" + l);
		driver.findElement(By.name("roadname")).sendKeys("road1");
		WebElement dropdown3 = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/form[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]"));
		//
//					// Click on the dropdown to open it
					dropdown3.click();
		Thread.sleep(2000);
		//Select phase=new Select(driver.findElement(By.xpath("//*[@id=\"demo-simple-select\"]")));
		//WebElement option3 = driver.findElement(By.xpath("//*[@id=\":r2f:\"]/li[1]"));
		//
//					// Click the option to select it
					//option3.click();
		driver.findElement(By.xpath("//body/div[@id='menu-phase']/div[3]/ul[1]/li[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/form/div/div/div[6]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/button")).click();
		WebElement dropdown4 = driver.findElement(By.cssSelector("#demo-simple-select"));
		//
//					// Click on the dropdown to open it
					dropdown4.click();
		Thread.sleep(2000);
//					// Locate the option you want to select using CSS Selector
					//WebElement option2 = driver.findElement(By.cssSelector("nodes"+k));
					WebElement option4 = driver.findElement(By.xpath("//li[text()='nodes" + k + "']"));
		//
//					// Click the option to select it
					option4.click();
					driver.findElement(By.name("description")).sendKeys("description");
					driver.findElement(By.name("zonename")).sendKeys("zone2" + m);
					driver.findElement(By.name("roadname")).sendKeys("road1");
					WebElement dropdown5 = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/form[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]"));
					//
//								// Click on the dropdown to open it
								dropdown5.click();
					Thread.sleep(1000);
					//Select phase=new Select(driver.findElement(By.xpath("//*[@id=\"demo-simple-select\"]")));
					driver.findElement(By.xpath("//body/div[@id='menu-phase']/div[3]/ul[1]/li[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/form/div/div/div[6]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/div[2]/div[2]/button")).click();
		WebElement dropdown6 = driver.findElement(By.cssSelector("#demo-simple-select"));
		//
//					// Click on the dropdown to open it
					dropdown6.click();
		Thread.sleep(2000);
//					// Locate the option you want to select using CSS Selector
					//WebElement option2 = driver.findElement(By.cssSelector("nodes"+k));
					WebElement option6 = driver.findElement(By.xpath("//li[text()='nodes" + k + "']"));
		//
//					// Click the option to select it
					option6.click();
		
		
		//Select nodes=new Select(driver.findElement(By.xpath("//*[@id=\"demo-simple-select\"]")));
		//option2.selectByVisibleText("node"+ k);
		driver.findElement(By.name("description")).sendKeys("description");
		driver.findElement(By.name("zonename")).sendKeys("zone3" + n);
		driver.findElement(By.name("roadname")).sendKeys("road1");
		WebElement dropdown7 = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/form[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]"));
		//
//					// Click on the dropdown to open it
					dropdown7.click();
		Thread.sleep(1000);
		//Select phase=new Select(driver.findElement(By.xpath("//*[@id=\"demo-simple-select\"]")));
		driver.findElement(By.xpath("//body/div[@id='menu-phase']/div[3]/ul[1]/li[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[2]/form/div/div/div[6]/button")).click();
		Thread.sleep(2000);
		}
		
		
		
		}
		
		
	}


