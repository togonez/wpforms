package com.selenium1.uimaps;

import org.openqa.selenium.WebDriver;

import com.selenium1.core.Element;
import com.selenium1.enums.ByValue;

public class InicioMap {
	WebDriver driver;
	
	public InicioMap(WebDriver driver) {
		this.driver = driver;
	}

	public Element selectTipoFormulario = new Element(driver, ByValue.XPATH, "//div[@class='nav']/select");
	
	public Element buttonViewDemo(String string) {
		return new Element(driver, ByValue.XPATH, "(//a[text()='"+string+"']//following::a[text()='View Demo'])[1]");
	}
	
	public Element tituloPage = new Element(driver, ByValue.XPATH, "//div[@class='container']//following::h1[@class='title']");
}
