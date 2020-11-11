package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CucumberPages extends PageObject {

  public void openGosoftPage() throws InterruptedException {
    getDriver().get("http://gosoft.web.id/example/ui/index.html");
    Thread.sleep(2000);
  }

  public void clickDafrarDosenMenu() throws InterruptedException {
    WebElement buttonDaftarDosen = getDriver()
        .findElement(By.xpath("//a[contains(@href,'data-dosen')]"));
    buttonDaftarDosen.click();
    Thread.sleep(2000);
  }

  public boolean isTableDosenDisplayed() {
    WebElement tableDosen = getDriver().findElement(By.xpath("//div[@id='table-dosen_wrapper']"));
    return tableDosen.isDisplayed();
  }
}
