package com.Test.SignUp;

import org.testng.annotations.Test;


import com.base.BaseUI;


public class Account extends BaseUI {
  @Test
  public void testCaseOne() {
	  
	  invokeBrowser("browserName");
	  openURL("websiteURL");
	  clickElement("/html/body/div[2]/div/div[2]/a[1]");
  }
}
