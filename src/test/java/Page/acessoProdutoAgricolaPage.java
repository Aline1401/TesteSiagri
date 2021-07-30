package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class acessoProdutoAgricolaPage extends BasePage{

	public acessoProdutoAgricolaPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public acessoProdutoAgricolaPage clickProdutorAgricola() {
	
	driver.findElement(By.linkText("Produtor agrícola")).click();
    return this;
}
}
