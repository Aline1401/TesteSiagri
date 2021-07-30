package Test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Page.acessoArmazensGeraisPage;
import Page.acessoLojaPage;
import Page.acessoPage;
import Page.acessoProdutoAgricolaPage;
import Page.acessoSementeiraPage;
import suporte.Web;


public class acessoMenuTest {
	private static WebDriver driver;

	@Before
	public void Conectar() {
		driver = Web.createChrome();
	}

	@Test
	public void clickSegmentos() {
		new acessoPage(driver).clickSolucoes().menuSegmentos();
		
	}
	@Test
	public void clickLojaAgropecuaria() {
		new acessoPage(driver).clickSolucoes().menuSegmentos();
		new acessoLojaPage(driver).clickLojaAgropecuaria();
	}
	@Test
	public void clickArmazem() {
		new acessoPage(driver).clickSolucoes().menuSegmentos();
		new acessoArmazensGeraisPage(driver).clickArmazensGerais();
	}
	@Test
	public void clickProdutoAgricola() {
		new acessoPage(driver).clickSolucoes().menuSegmentos();
		new acessoProdutoAgricolaPage(driver).clickProdutorAgricola();
	
	}
	public void clickSementeira() {
		new acessoPage(driver).clickSolucoes().menuSegmentos();
		new acessoSementeiraPage(driver).clickSementeira();
	}
	
}
