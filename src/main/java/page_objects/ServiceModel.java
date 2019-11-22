package page_objects;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceModel {
	
WebDriver driver;
	
	@FindBy(xpath = "//div[@class='elementor-element elementor-element-04ec0ee elementor-position-top elementor-vertical-align-top elementor-widget elementor-widget-image-box']")
	WebElement btnSolutions;
	
	@FindBy(xpath = "//a[contains(text(), 'Pruebas de Usabilidad')]")
	WebElement btnUsabilityTest;
	
	@FindBy(xpath = "//p[contains(text(),'Nuestro servicio de Usabilidad permite conocer los')]")
	WebElement lblUsability;
	
	@FindBy(xpath = "//img[@class='site-logo']")
	WebElement btnPrincipalPage;
	
	
	public ServiceModel (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void buttonSolutions () {
		btnSolutions.click();
	}
	
	public void buttonUsability () {
		btnUsabilityTest.click();
	}
	
	public String labelUsability () {
		String text;
		text = lblUsability.getText();
		
		return text;
	}
	
	public void buttonPrincipal () {
		btnPrincipalPage.click();
	}
	
}