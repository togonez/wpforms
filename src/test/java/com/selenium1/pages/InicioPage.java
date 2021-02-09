package com.selenium1.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium1.uimaps.InicioMap;

public class InicioPage {
	WebDriver driver;
	
	public InicioPage(WebDriver driver) {
		this.driver = driver;
	}
	InicioMap inicioMap = new InicioMap(driver);
	
	public void selecionarTipoFormulario() {
		inicioMap.selectTipoFormulario.select(driver, "Feedback");
		inicioMap.buttonViewDemo("Neighborhood Events Questionnaire Form Demo").click(driver);
	}
	public void validarAcessoSucesso() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(inicioMap.tituloPage.getValue())));
			String resultado = driver.findElement(By.xpath(inicioMap.tituloPage.getValue())).getText();
			Assert.assertEquals("Erro", "Neighborhood Events Questionnaire Form Demo", resultado);
			System.out.println("[SUCESSO] - Botão identificado e clicado na página.");
		} catch (Exception e) {
			System.out.println("[FALHA] - Erro!");
		}
	}
}
