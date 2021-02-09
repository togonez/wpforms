package com.selenium1.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.selenium1.core.Driver;
import com.selenium1.pages.FormularioPage;
//import com.selenium1.pages.FormularioPage;
import com.selenium1.pages.InicioPage;

//Exercicio 1 da Turma 2/2020 - Beca de testes everis
//Autor: Vinicius Alves de Carvalho - 09/06/2020
//
//1 - Acessar o site: https://wpforms.com/demo/
//2 - No select “Viewing All Templates” selecionar “FeedBack”
//3 - Clicar em “View Demo” do card “Neighborhood Events Questionnaire Form Demo”
//4 - Preencher todos os campos (radio button e textbox) do formulário com qualquer valor.
//5 - Enviar (Submit) o formulário
//6 - Validar que foi o formulário foi enviado.
//
//OBS: Usar a estrura de Page Object

public class CT01 {
	WebDriver driver;
	InicioPage inicioPage;
	FormularioPage formularioPage;

	@Before
	public void before() {
		driver = new Driver().getDriver();
		Driver.acessarURL(driver, "https://wpforms.com/demo");
		inicioPage = new InicioPage(driver);
		formularioPage = new FormularioPage(driver);
	}

	@Test
	public void test() {
		inicioPage.selecionarTipoFormulario();
		inicioPage.validarAcessoSucesso();
		formularioPage.preencherFormulario();
		formularioPage.validarMensagemSucesso();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@After
	public void after() {
		Driver.close(driver);
	}
}
