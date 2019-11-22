package MainPage;

import org.testng.annotations.Test;

import page_objects.MainPageModel;
import page_objects.ServiceModel;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FlujoServicio {

	public static ChromeDriver driver;
	MainPageModel mainpage;
	ServiceModel service;
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "src/main/java/Driver/chromedriver");
		driver = new ChromeDriver();
		mainpage = new MainPageModel(driver);
		service = new ServiceModel(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Para cambiar la resolucion de la pantalla
		Dimension d = new Dimension(1440, 1024);
		driver.manage().window().setSize(d);
		// Set URL
		driver.get("https://www.choucairtesting.com/");
	}
	
	@Test
	public void paginaPrincipalServicio() throws InterruptedException {
		System.out.println("Texto principal:::" + mainpage.labelBigText());
		System.out.println("Texto Automatización SAP:::" + mainpage.labelAutomation());
		System.out.println("Texto Aliados Principales:::" + mainpage.labelClient());
		Thread.sleep(2000);
		mainpage.buttonSearchIcon();
		Thread.sleep(2000);
		System.out.println("Texto de Búsqueda:::" + mainpage.labelTextSearch());
		Thread.sleep(2000);
		mainpage.buttonPrincipal();
		Thread.sleep(2000);
		mainpage.buttonService();
		Thread.sleep(3000);
		service.buttonSolutions();
		Thread.sleep(2000);
		service.buttonUsability();
		Thread.sleep(2000);
		System.out.println("Texto Parrafo Usabilidad:::" + service.labelUsability());
		Thread.sleep(2000);
		service.buttonPrincipal();	
	}
	

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
