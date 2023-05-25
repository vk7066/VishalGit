package TestNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demoTest2 {
	@Test
	  public void a() {
		  Reporter.log("a method demo test2",true);
		  
	  }
	  @Test
	  public void b()
	  {
		 
		  Reporter.log("b method demo test2",true);
	  }
	  public void c()
	  {
		  int i,j,res;
		  i=0;
		  j=5;
		  res=j/i;
		  Reporter.log("c method demo test2",true);
	  }
}
