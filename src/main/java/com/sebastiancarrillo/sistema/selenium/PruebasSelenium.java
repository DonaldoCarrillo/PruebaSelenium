/**
 * 
 */
package com.sebastiancarrillo.sistema.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * @author DCARRILLO
 *
 */
public class PruebasSelenium {
	
	public void pruebaSelenium() {
		try {
	        System.setProperty("webdriver.chrome.driver", "C:/ChromeDriver/chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://demoqa.com/elements");

	        WebElement formElement = driver.findElement(By.linkText("Check Box"));
	        formElement.click();

	        // Realiza más acciones según sea necesario
	        // Ejemplo: Llenar un formulario
	       // WebElement firstNameField = driver.findElement(By.id("firstName"));
	        //firstNameField.sendKeys("John");

	        // Puedes continuar interactuando con la página según tus necesidades.

	        // Cierra el navegador
	        driver.quit();
		}catch(Exception ex) {
			System.out.println("Este es el error " + ex.getMessage());
		}
	}

}
