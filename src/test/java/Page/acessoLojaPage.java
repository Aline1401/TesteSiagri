package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class acessoLojaPage extends BasePage{

	public acessoLojaPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public acessoLojaPage clickLojaAgropecuaria() {
		driver.findElement(By.linkText("Loja agropecu�ria")).click();
		return this;
	}

}
