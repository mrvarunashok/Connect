package ConnectTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPRO {
@Test(dataProvider="dp")
public void f (int n,String s) {
	
	System.out.println("In:"+n+"ands"+s);

}

@BeforeMethod
public void beforeMethod() {
}

@DataProvider 
public Object[][] dp ()
{
	return new Object[][]
			{
			new Object[] {1,"a"},
			new Object[] {2,"b"},};
}

}
