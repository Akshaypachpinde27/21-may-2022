import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testng1 {

	@BeforeClass 
	public void beforeclass() {
		System.out.println("beforeclass");
	}
	
	@BeforeMethod 
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	
	@Test (priority = 2, enabled = true) 
	public void test1() {
		System.out.println("Test 1");
	
	}
	
	@Test (priority = 3)
	public void test2() {
		System.out.println("Test 2");
		Assert.fail();
	}
	
	@Test (priority = 10, dependsOnMethods= {"test4","test2"})
	public void test3() {
		System.out.println("Test 3");
	}
	
	@Test (priority =0,invocationCount = 2)
	public void test4() {
		System.out.println("Test 4");
	}
	
	@Test (timeOut=3000)//Maximum time to execute the test
	public void test5() {
		System.out.println("Test 5");
	}
	
	@AfterMethod
	public void afterMethod () {
		System.out.println("afterMethod");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}
	
	
	
	
}
