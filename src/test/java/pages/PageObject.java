package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObject {

  public static WebDriver driver = new ChromeDriver();

  public WebDriver getDriver() {
    return this.driver;
  }

}
