package com.Datadriven.velankani;

import org.testng.annotations.Test;

public class MainDatadriven extends Datadrivenactitime
{
  @Test
  public void loginactitime() throws InterruptedException
  {   
	  MainDatadriven.openBrowser();
	  for (int i=1; i<13; i++)
	  {
	  
		  MainDatadriven obj1 = new MainDatadriven();
		  obj1.getUserandPass(i);	
		  MainDatadriven.login(); 
		  MainDatadriven.getTitle(i);
	  }
	  Thread.sleep(500);
      MainDatadriven.logOut();
  }
}