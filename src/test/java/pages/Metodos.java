package pages;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String site) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}

	public void segundaP() {
		driver.navigate().to("https://jobs.quickin.io/primecontrol/apply?src=website");

	}

	public void clicar2(By elemento) {

		driver.findElement(elemento).click();

	}

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void suitto() {
		 List<String> abas = new ArrayList<String>(driver.getWindowHandles());
		 
		 driver.switchTo().window(abas.get(1));
		 

	}
	
	public void enviarCurriculo(){
		WebElement arquivo1 = driver.findElement(By.xpath("//input[@class=\'custom-file-input\']"));

	    File file = new File("./target/curriculo/amandasantos.docx");
	    arquivo1.sendKeys(file.getAbsolutePath());
	    
		
	}
	 
	
	

	public void esperar(int tempo) throws InterruptedException {

		Thread.sleep(tempo);

	}
	public void txtLink(String text) {
		driver.findElement(By.linkText(text));
	}
	
	public void enviarFinalizar() {
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/section/div/div/form/button")).submit();
	}
	
	
	}

