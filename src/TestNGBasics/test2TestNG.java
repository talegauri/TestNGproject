package TestNGBasics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test2TestNG {

@Test(groups="Smoke Testing")	
@Parameters({"userName","password"})

public void method1(String uName, String pwd) {
System.out.println("UserName Is: "+uName);
System.out.println("UserName Is: "+pwd);
}
	public void method1() {
	
	System.out.println("test2method1");
}
@Test
public void method2() {
	System.out.println("test2method2");
}


	
	
}
