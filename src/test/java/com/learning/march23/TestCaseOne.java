package com.learning.march23;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestCaseOne {
	
	@Test
	public void test() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://forms.codeninjas.com/bts22");
	    Thread.sleep(2000);
	driver.quit();
}

}
