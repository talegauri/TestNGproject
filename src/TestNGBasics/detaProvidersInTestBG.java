package TestNGBasics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class detaProvidersInTestBG {
	
	

	
	public void method1(String uName, String pwd) {
	System.out.println("UserName Is: "+uName);
	System.out.println();

	//System.out.println("prioritiesInTestNGmethod1");
}
	
@Test (invocationCount=10)
	

	
	public void method2() {
	System.out.println("Test1");
	//System.out.println("UserName Is: "+pwd);

	//System.out.println("prioritiesInTestNGmethod1");
}
	
@DataProvider (name = "testData")
public Object[] dpMethod() {
	Object[][]	myData=new Object[3] [3];
	// row 0 column 0
	myData[0][0]="Test1";
	// row 0 cloumn 1
	myData[0][1]="Test11";
	// row 0 cloumn 2

	myData[0][2]="Test111";
	// row 0 cloumn 2

	myData[1][0]="Test1111";
	// row 0 cloumn 2

	myData[1][1]="Test11111";
	// row 0 cloumn 2

	myData[1][2]="Test11111";

	
return myData;
	
	
}

}
