package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class acessoSementeiraPage extends BasePage{

	public acessoSementeiraPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public acessoSementeiraPage clickSementeira() {
	
		driver.findElement(By.linkText("Sementeira")).click();
    return this;
}
}
