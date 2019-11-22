package page_objects;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageModel {
	
	WebDriver driver;
	
	@FindBy(xpath = "(//h2[@class='maintitle'])[2]")
	WebElement lblBigText;
	
	@FindBy(xpath = "(//a[contains(text(),'Servicios')])[1]")
	WebElement btnService;
	
	@FindBy(xpath = "//*[@class='search-icon']")
	WebElement btnSearchIcon;
	
	@FindBy(xpath = "//input[@placeholder='Buscar …']")
	WebElement txtSearch;
	
	@FindBy(xpath = "//a[contains(text(),'Automatización de Pruebas SAP')]")
	WebElement lblAutomation;
	
	@FindBy(xpath = "//h2[contains(text(),'NUESTROS ALIADOS')]")
	WebElement lblClients;
	
	@FindBy(xpath = "//a[contains(text(),'Retos de la industria frente a la transformación d')]")
	WebElement lblTextRetos;
	
	@FindBy(xpath = "//img[@class='site-logo']")
	WebElement btnPrincipalPage;
	
	
	public MainPageModel (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String labelBigText () {
		String text = lblBigText.getText();
		return text;
	}
	
	public String labelAutomation () {
		String text = lblAutomation.getText();
		return text;
	}
	
	public String labelClient () {
		String text = lblClients.getText();
		return text;
	}
	
	public void buttonSearchIcon () {
		btnSearchIcon.click();
		txtSearch.click();
		txtSearch.clear();
		txtSearch.sendKeys("retos");
		txtSearch.sendKeys(Keys.ENTER);
	}
	
	public String labelTextSearch () {
		String text = lblTextRetos.getText();
		return text;
	}
	
	public void buttonPrincipal () {
		btnPrincipalPage.click();
	}
	
	public void buttonService () {
		btnService.click();
	}
}
