import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CucumberSteps {

  WebDriver driver = new ChromeDriver();

  @Given("user open gosoft page")
  public void userOpenGosoftPage() throws InterruptedException {
    driver.manage().window().maximize();
    //open page
    driver.get("http://gosoft.web.id/example/ui/index.html");
    Thread.sleep(1000);
  }

  @When("user click daftar dosen menu")
  public void userClickDaftarDosenMenu() throws InterruptedException {
    WebElement buttonDaftarDosen = driver.findElement(By.xpath("//a[contains(@href,'data-dosen')]"));
    buttonDaftarDosen.click();
    Thread.sleep(1000);
  }

  @Then("user see data dosen")
  public void userSeeDataDosen() {
    WebElement tableDosen = driver.findElement(By.xpath("//div[@id='table-dosen_wrapper']"));
    Assert.assertTrue(tableDosen.isDisplayed());
  }
}
