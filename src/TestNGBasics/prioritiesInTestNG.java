package TestNGBasics;

import org.testng.annotations.Test;

public class prioritiesInTestNG {
	//Default proprity will be 0
	//Priority will be negative number
	
	@Test(priority =1)
	public void method1() {
	
	System.out.println("prioritiesInTestNGmethod1");
}
@Test(priority =0)
public void method2() {
	System.out.println("prioritiesInTestNGmethod2");
	// in this the priority is not mentioned that means it is default /0)
}
@Test(priority = -1)
public void method3() {
	System.out.println("prioritiesInTestNGmethod3");

}
}