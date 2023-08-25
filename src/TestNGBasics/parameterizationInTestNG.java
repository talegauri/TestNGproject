package TestNGBasics;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizationInTestNG {

	
	
	
	@Test(groups="Smoke Testing")	

	@Parameters({"userName","password"})
	
	public void method1(String uName, String pwd) {
	System.out.println("UserName Is: "+uName);
	System.out.println("UserName Is: "+pwd);

	//System.out.println("prioritiesInTestNGmethod1");
}
   @Test
public void method2() {
	 //  Assert.assertEquals("20","21");
	System.out.println("prioritiesInTestNGmethod2");
	// in this the priority is not mentioned that means it is default /0)
}
    @Test
public void method3() {
	System.out.println("prioritiesInTestNGmethod3");

}
}

