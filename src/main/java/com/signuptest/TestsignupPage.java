package com.signuptest;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import javax.sound.midi.Patch;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class TestsignupPage<ITesseract> {
	
	WebDriver driver= new ChromeDriver();
	

  @Test
  public void f() throws InterruptedException {
	  System.setProperty("Webdriver.chrome.driver","D:\\chromedriver_win32.exe");
		
		driver.get("https://testffc.nimapinfotech.com/auth/login");
		driver.manage().window().maximize();
		
				Thread.sleep(2);
		driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("sakshi100301@gmail.com");
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Sakshi@12345");
		
//	//	driver.manage().timeouts((30,TimeUnit.SECONDS));
//		Thread.sleep(2);
//		driver.findElement(By.id("captcahCanvas"));
//		
//		File src=driver.findElement(By.id("captcahCanvas")).getScreenshotAs(OutputType.FILE);
//		String  path=System.getProperty("user.dir")+"/screenshots/capcha.png";
//		
//		FileHandler.copy(src, new File(path));
//		
//		ITesseract image=new Tesseract();
//		String imageText= image.doOCR(new File(path));
//		
//		String FinalText=imageText.split("below")[1].replaceAll("[^a-zA-Z0-9","");
//		System.out.println("Final capch is"+FinalText);
//		driver.findElement(By.xpath("//input[@ng-reflect-name='captchaValue']")).sendKeys(FinalText);
//		
		
		driver.findElement(By .id("kt_login_signinwithotp_submit")).click();
		
  }	
}
;