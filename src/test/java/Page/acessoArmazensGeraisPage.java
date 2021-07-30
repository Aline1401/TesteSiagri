package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class acessoArmazensGeraisPage extends BasePage{

	public acessoArmazensGeraisPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public acessoArmazensGeraisPage clickArmazensGerais() {
		driver.findElement(By.linkText("Armazéns gerais")).click();
		return this;
	}

	
}
