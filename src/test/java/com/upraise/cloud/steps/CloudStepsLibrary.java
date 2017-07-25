package com.upraise.cloud.steps;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import static com.qmetry.qaf.automation.step.CommonStep.waitForPresent;

import java.util.concurrent.TimeUnit;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.testng.Priority;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;

public class CloudStepsLibrary {
	
	@QAFTestStep(description = "Details for login {username} , {password}") 	
	public static void login(String username,  String password , String Isvalid){
	sendKeys(username, "login.field");
	click("next.button");
	new WebDriverTestBase().getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	sendKeys(password, "password.field");
	click("login.button");
	new WebDriverTestBase().getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

/*
@QAFTestStep(description = "Add Individual Objective {title}") 
   public static void addindividualobjective(String title){
	click("upraise.menu");
	click("menu.Iobj");
	click("button.individual");
	click("link.cycledropdown");
	sendKeys("April", "input.cyclefield");
	click("link.cycleselect");
	waitForPresent("field.objectivetitle");
	click("field.objectivetitle");
	sendKeys(title, "field.objectivetitle");
	click("button.objsave");

}

@QAFTestStep(description = "Add Team Objective {title}") 
public static void addteamobjective(String title){
	click("upraise.menu");
	click("menu.tobj");
	click("button.team");
	click ("team.dropdown");
	sendKeys("Automation","team.select");
	click("link.cycledropdown");
	sendKeys("April", "input.cyclefield");
	click("link.cycleselect");
	waitForPresent("field.objectivetitle");
	click("field.objectivetitle");
	sendKeys(title, "field.objectivetitle");
	click("button.objsave");

}*/


}