package com.upraise.server.steps;

import static com.qmetry.qaf.automation.step.CommonStep.click;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import static com.qmetry.qaf.automation.step.CommonStep.waitForPresent;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.testng.Priority;

public class StepsLibrary {
	/**
	 * @param searchTerm
	 *            : search term to be searched
	 */
	@QAFTestStep(description = "Details for login {username} , {password}") @Priority(1) 	
	public static void login(String username,  String password , String Isvalid){
	sendKeys(username, "login.field");
	sendKeys(password, "password.field");
	click("login.button");
}


@QAFTestStep(description = "Add Individual Objective {title}") @Priority(2)
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

@QAFTestStep(description = "Add Team Objective {title}") @Priority(3)
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

}


}