package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.PageObject;

public class CucumberHooks extends PageObject {

  @After
  public void afterTest() {
    getDriver().quit();
  }

}
