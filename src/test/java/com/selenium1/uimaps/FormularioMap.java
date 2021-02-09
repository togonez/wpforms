package com.selenium1.uimaps;

import org.openqa.selenium.WebDriver;

import com.selenium1.core.Element;
import com.selenium1.enums.ByValue;

public class FormularioMap {
	WebDriver driver;
	
	public FormularioMap(WebDriver driver) {
		this.driver = driver;
	}

	//Formulario
	public Element radio1 = new Element(driver, ByValue.ID, "wpforms-260271-field_1_1"); //radio Extremely often
	public Element input1 = new Element(driver, ByValue.ID, "wpforms-260271-field_2"); //input If you do not attend events in this neighborhood, why not?
	public Element input2 = new Element(driver, ByValue.ID, "wpforms-260271-field_3"); //input What types of events would you attend if they were held in this neighborhood?
	public Element radio2 = new Element(driver, ByValue.ID, "wpforms-260271-field_4_3"); //radio Moderately often
	public Element input3 = new Element(driver, ByValue.ID, "wpforms-260271-field_5"); //input If you do not participate in activities in this neighborhood, why not?
	public Element input4 = new Element(driver, ByValue.ID, "wpforms-260271-field_6"); //input What types of activities would you participate in if they were available in this neighborhood?
	public Element btnSubmit = new Element(driver, ByValue.XPATH, "//button[text()='Submit']"); //button submit
	
	//Mensagem
	public Element tituloMensagem = new Element(driver, ByValue.XPATH, "//h3[text()='Congrats, You Completed the First Step!']");
	public Element btnMensagem = new Element(driver, ByValue.XPATH, "//h3[text()='Congrats, You Completed the First Step!']/..//a[@class='button']");
}
