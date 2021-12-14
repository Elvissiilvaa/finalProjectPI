package br.com.Elvissiilvaa.leilao.e2e.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class BrowserFactory {

//  Documentação
//	http://chromedriver.storage.googleapis.com/index.html
//	https://github.com/mozilla/geckodriver/releases	

	
	// simulando o navegador. 
	public WebDriver createWebDriver() {
		String webdriver = System.getProperty("browser", "htmlunit"); //VM Argument: -Dbrowser=firefox
		switch (webdriver) {
			case "firefox":
				return initFirefoxDriver();
			case "chrome":
				return initChromeDriver();
			default:
				return new HtmlUnitDriver();
		}
	}

	
	// aqui vai ser aberto o Crhome 
	private  WebDriver initChromeDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\elvis\\Downloads\\Compressed\\1821-bdd-cucumber-java-aula6\\Bdd Front e Back\\drivers\\chromedriver.exe");
		return new ChromeDriver();
	}

	// aqui vai ser aberto  o firefox. 
	private  WebDriver initFirefoxDriver() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\elvis\\Downloads\\Compressed\\1821-bdd-cucumber-java-aula6\\Bdd Front e Back\\drivers\\geckodriver.exe");
		return new FirefoxDriver();
	}
}
