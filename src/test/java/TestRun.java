import javax.swing.Action;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestRun {

  @Test
  public void testRunWebAutomation() throws InterruptedException {
//    ChromeOptions options = new ChromeOptions();
//    //setting chrome capabilities https://peter.sh/experiments/chromium-command-line-switches/
//    options.addArguments("--start-maximized,--incognito");
    WebDriver driver = new ChromeDriver();
//    //for mac it --start-maximized not working properly. So need use this command to maximize
    driver.manage().window().maximize();
    driver.get("https://www.atlasid.tech/");
//    Thread.sleep(5000);
//    driver.quit();
  }


  @Test
  public void testArguments() throws InterruptedException {
    ChromeOptions chromeOptions = new ChromeOptions();
//    chromeOptions.addArguments("--headless");
    chromeOptions.addArguments("--start-maximized");

    WebDriver driver = new ChromeDriver(chromeOptions);
    driver.get("https://www.atlasid.tech/");
    driver.manage().window().maximize();

    //elements

    //assertion

    Thread.sleep(5000);

    driver.quit();
  }

  @Test
  public void findLocators() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("http://gosoft.web.id/wonderfulQuote/");
    driver.manage().window().maximize();

    //elements find by class
    driver.findElement(By.className("form-control"));

    //element find xpath
    driver.findElement(By.xpath("//textarea[@class='form-control']"));

    Thread.sleep(5000);

    driver.quit();
  }

  @Test
  public void testTestCafe() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    //open page
    driver.get("https://devexpress.github.io/testcafe/example/");
    //click pupulate
    WebElement buttonPopulate = driver.findElement(By.xpath("//input[@id='populate']"));
    buttonPopulate.click();
    Thread.sleep(1000);
    //handle alert
    driver.switchTo().alert().accept();
    //get text
    WebElement inputName = driver.findElement(By.xpath("//input[@id='developer-name']"));
    Thread.sleep(2000);
    String name = inputName.getAttribute("value");
    System.out.println("name: " + name);
    //assert
    Assert.assertEquals("Peter Parker", name);

    //checkbox
    WebElement cbRemote = driver.findElement(By.xpath("//input[@id='remote-testing']"));
    cbRemote.click();
    WebElement cbParallel = driver
        .findElement(By.xpath("//input[@id='background-parallel-testing']"));
    cbParallel.click();

    //assert check box
    Assert.assertEquals(true, cbRemote.isSelected());
    Assert.assertEquals(true, cbParallel.isSelected());

    //dropdown
    WebElement dropDown = driver.findElement(By.xpath("//select[@id='preferred-interface']"));
    Select select = new Select(dropDown);
    //select by index
    int index = 1;
    select.selectByIndex(index);
    String textDropDown = select.getOptions().get(index).getText();

    Thread.sleep(5);
    Assert.assertEquals("JavaScript API", textDropDown);

    //slider
    WebElement cbTestCafe = driver.findElement(By.xpath("//input[@id='tried-test-cafe']"));
    cbTestCafe.click();
    WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));
    Actions actions = new Actions(driver);
    Thread.sleep(2000);
    actions.dragAndDropBy(slider, 30,0).build().perform();
    Thread.sleep(5000);

    driver.quit();
  }
}
