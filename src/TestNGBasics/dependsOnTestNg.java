package TestNGBasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnTestNg {

	
		
		@Test(dependsOnMethods ={"method2",})
		public void method1() {
		
		System.out.println("prioritiesInTestNGmethod1");
	}
	@Test
	public void method2() {
		Assert.assertEquals("20","21");
		
	
		//System.out.println("prioritiesInTestNGmethod2");
		
		// in this the priority is not mentioned that means it is default /0)
	}
	@Test
	public void method3() {
		System.out.println("prioritiesInTestNGmethod3");
	
	
	
	}
	
	
	

}
