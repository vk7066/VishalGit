package TestNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demoTest1 {
  @Test
  public void g() {
	  Reporter.log("g method demo test1",true);
	  
  }
  @Test
  public void h()
  {
	  Reporter.log("h method demo test1",true);
  }
  @Test
  public void i()
  {
	  Reporter.log("i method demo test1",true);
  }
}
