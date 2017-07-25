package com.upraise.cloud.tests;

import static com.qmetry.qaf.automation.step.CommonStep.verifyText;
import static com.upraise.cloud.steps.CloudStepsLibrary.*;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import com.qmetry.qaf.automation.testng.Priority;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.ExcelUtil;
import com.qmetry.qaf.automation.testng.Priority;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider;
import com.qmetry.qaf.automation.testng.dataprovider.QAFDataProvider.*;

public class UpcloudTest extends WebDriverTestCase {

	  @QAFDataProvider(dataFile = "resources/env2/logindata.txt")
	   @Test(description = "Login test" , groups={"SMOKE"}) 
		public void upraiselogin(Map <String, String> data){
	    	new WebDriverTestBase().getDriver().manage().window().maximize();
	    	new WebDriverTestBase().getDriver().get("/");
	    	login(data.get("username"),data.get("password"), data.get("Isvalid"));
			verifyText("upraise.menu","UpRaise");
			
			}


	  /* @Test(description = "Add Individual Objective" , groups={"SMOKE"}) 
	    public void AddIobjective(){
		addindividualobjective("Auto I Objective");
		new WebDriverTestBase().getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    verifyText("message.container", "New objective added successfully. If it is not visible please check your filters.");
	   }
	   
	   

	   @Test(description = "Add Team Objective" , groups={"SMOKE"}) 
	    public void AddTobjective(){
		   addteamobjective("Auto T Objective");
		new WebDriverTestBase().getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    verifyText("message.container", "New objective added successfully. If it is not visible please check your filters.");
	   }*/
	}

