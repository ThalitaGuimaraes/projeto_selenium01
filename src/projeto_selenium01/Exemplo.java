package projeto_selenium01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exemplo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thali\\Desktop\\Teste de Software\\workspace_testes\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://cotiinformatica.com.br");
	}

}
