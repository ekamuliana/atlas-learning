package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.PageObject;

public class CucumberHooks extends PageObject {

  @Before
  public void beforeTest() {
    System.out.println("setup webdriver");
    WebDriverManager.chromedriver().setup();
  }

  @After
  public void afterTest() {
    getDriver().quit();
  }

}
