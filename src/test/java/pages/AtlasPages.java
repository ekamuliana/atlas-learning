package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class AtlasPages extends PageObject {

  public void openAtlasPage() throws InterruptedException {
    getDriver().get("https://www.atlasid.tech/");
    Thread.sleep(5000);
  }
}
