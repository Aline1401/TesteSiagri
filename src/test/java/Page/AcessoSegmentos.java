package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AcessoSegmentos extends BasePage{
	public AcessoSegmentos(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public AcessoSegmentos menuSegmentos() {
		driver.findElement(By.linkText("Segmentos")).click();
		return this;
	}
	
}
