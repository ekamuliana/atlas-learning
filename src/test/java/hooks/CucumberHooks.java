package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.PageObject;

public class CucumberHooks extends PageObject {

  @Before
  public void beforeTest() {
    this.driver.manage().window().maximize();
  }

  @After
  public void afterTest() {
    getDriver().quit();
  }

}
