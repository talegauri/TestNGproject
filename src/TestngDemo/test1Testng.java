package TestngDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1Testng {
	//What are the annotations in TestNG?
	//@Before suite
	//@Before Test
	//@Before Class
	//@Before Method
	//@Test
	//@After method
	//@After Class
	//@After Test
	//@After suite
	
	@AfterSuite
	
	public void method3() {
		System.out.println("test1method3");
	}
	
	@BeforeSuite

public void method1() {
		//WebDriver driver = new ChromeDriver();
		
	System.out.println("test1method1");
}
	@AfterTest
	public void method2() {
		System.out.println("test1method2");
		
	}
	@BeforeTest
	public void method4() {
		System.out.println("test1method4");

}
	@Test
	public void method5() {
		System.out.println("test1method5");
}
	@AfterClass
	public void method6() {
		System.out.println("test1method6");
	}
	@BeforeClass
	
	public void method7() {
		System.out.println("test1method7");
	}
	@Test
	public void method8() {
		System.out.println("test1method8");
	}
	@AfterMethod
	public void method9() {
		System.out.println("test1method9");
	}
	@BeforeMethod
	public void method10() {
		System.out.println("test1method10");
	}
}