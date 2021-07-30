package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class acessoPage extends BasePage{
	
	public acessoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public AcessoSegmentos clickSolucoes() {
		driver.findElement(By.linkText("Soluções")).click();
		
		return new AcessoSegmentos(driver);
		
	}

}
