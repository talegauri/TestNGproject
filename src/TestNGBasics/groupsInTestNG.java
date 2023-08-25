package TestNGBasics;

import org.testng.annotations.Test;

public class groupsInTestNG {

	@Test(groups={"Smoke Testing","Regression"})
	public void method1() {
	
	System.out.println("groupsInTestNGmethod1");
}
	
@Test(groups = "Regression",priority=1)
public void method2() {
	System.out.println("groupsInTestNGmethod2");
	// in this the priority is not mentioned that means it is default /0)
}

@Test(groups = "Regression")
public void method3() {
	System.out.println("groupsInTestNGmethod3");

}
}
	

