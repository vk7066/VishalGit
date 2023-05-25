package TestNG_Anotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test
  public void f() {
	  Reporter.log("Test annotations F method",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("before method annotation",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("after method annotation",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("before class annotation",true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("after class annotation",true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("before Test annotation",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("After Test annotation",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("beforeSuite annotation",true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("afterSuite annotation",true);
  }
  
  @Test
  public void testMethod()
  {
	  Reporter.log("Test Annotation test Meth",true);
	  
  }

}
