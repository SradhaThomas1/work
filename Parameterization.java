package parameterization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameterization {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//For getting excel path
		FileInputStream excel=new FileInputStream("C:\\Users\\josep\\Desktop\\logincredentials.xlsx");
		//Convert to workbook
		XSSFWorkbook wb=new XSSFWorkbook(excel);
		//Choosing sheet
		XSSFSheet sh=wb.getSheet("Sheet1");
		
		for(int i=0;i<5;i++) {
			driver.findElement(By.name("email")).sendKeys(sh.getRow(i).getCell(0).getStringCellValue());
			driver.findElement(By.name("pass")).sendKeys(sh.getRow(i).getCell(1).getStringCellValue());
			driver.findElement(By.name("login")).click();
			
			if(driver.getTitle().contentEquals("facebook"))
			{
					System.out.println("Login Success");
					//create another column in sheet
					sh.getRow(i).createCell(2).setCellValue("pass");
				}
			else
			{
				System.out.println("Login failed");
				sh.getRow(i).createCell(2).setCellValue("fail");
			}
			FileOutputStream result=new FileOutputStream("C:\\Users\\josep\\Desktop\\logincredentials.xlsx");
			//write to workbook
			wb.write(result);
			driver.get("https://www.facebook.com/");
		}
	}

}
