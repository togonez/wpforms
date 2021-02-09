package com.selenium1.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium1.uimaps.FormularioMap;

public class FormularioPage {
	WebDriver driver;

	public FormularioPage(WebDriver driver) {
		this.driver = driver;
	}

	FormularioMap formularioMap = new FormularioMap(driver);

	public void preencherFormulario() {
		formularioMap.radio1.click(driver);
		formularioMap.input1.sendKeys(driver, "Teste");
		formularioMap.input2.sendKeys(driver, "Teste");
		formularioMap.radio2.click(driver);
		formularioMap.input3.sendKeys(driver, "Teste");
		formularioMap.input4.sendKeys(driver, "Teste");
		formularioMap.btnSubmit.click(driver);
	}

	public void validarMensagemSucesso() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath(formularioMap.tituloMensagem.getValue())));
			String resultado = driver.findElement(By.xpath(formularioMap.btnMensagem.getValue())).getText();
			System.out.println(resultado);
			Assert.assertEquals("Erro", "Get Started with WPForms Today", resultado);
			System.out.println("[SUCESSO] - Mensagem " + resultado + " identificada na página.");
		} catch (Exception e) {
			System.out.println("[FALHA] - Erro!");
		}
	}
}
