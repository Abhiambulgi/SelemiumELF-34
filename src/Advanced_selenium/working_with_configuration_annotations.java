package Advanced_selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class working_with_configuration_annotations {
@Test
public void test(){
	System.out.println("Test Case");
}
@BeforeSuite
public void BeforeSuite(){
	System.out.println("Before Suite");
}
@AfterSuite
public void AfterSuite(){
	System.out.println("After Suite");
}
@BeforeTest
public void BeforeTest(){
	System.out.println("Before Test");
}
@AfterTest
public void AfterTest(){
	System.out.println("After Test");
}
@BeforeClass
public void BeforeClass(){
	System.out.println("Before Class");
}
@AfterClass
public void AfterClass(){
	System.out.println("After Class");
}
@BeforeMethod
public void BeforeMethod(){
	System.out.println("Before Method");
}
@AfterMethod
public void AfterMethod(){
	System.out.println("After Method");
}

}
