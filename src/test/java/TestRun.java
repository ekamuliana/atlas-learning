import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestRun {

    @Test
    public void testRunWebAutomation() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        //setting chrome capabilities https://peter.sh/experiments/chromium-command-line-switches/
        options.addArguments("--start-maximized,--incognito");
        WebDriver driver = new ChromeDriver(options);
        //for mac it --start-maximized not working properly. So need use this command to maximize
        driver.manage().window().maximize();
        driver.get("https://www.atlasid.tech/");
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void testCafe() throws InterruptedException {
        //Initiate drive & open page
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://devexpress.github.io/testcafe/example/");

        //Click button
        WebElement btnPopulate = driver.findElement(By.xpath("//input[@id='populate']"));
        btnPopulate.click();

        Thread.sleep(2000);

        //Handle alert
        driver.switchTo().alert().accept();

        //Input Name
        WebElement inputName = driver.findElement(By.xpath("//input[@id='developer-name']"));
//    Thread.sleep(2000);
        String name = inputName.getAttribute("value");
        System.out.println("Name : " + name);

        //Assert
        Assert.assertEquals("Peter Parker", name);

        //Checkbox
        WebElement cbRemote = driver.findElement(By.xpath("//input[@id='remote-testing']"));
        cbRemote.click();

        WebElement cbParaTest = driver.findElement(By.xpath("//input[@id='background-parallel-testing']"));

        Assert.assertEquals(true, cbRemote.isSelected());
        Assert.assertEquals(false, cbParaTest.isSelected());

        //Dropdown
        WebElement dd = driver.findElement(By.xpath("//select[@id='preferred-interface']"));
        dd.click();

        Select select = new Select(dd);
        String text = select.getOptions().get(1).getText();
        Assert.assertEquals("JavaScript API", text);
        Thread.sleep(2000);

        //Slider
        WebElement tcf = driver.findElement(By.xpath("//input[@id='tried-test-cafe']"));
        tcf.click();

        WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(slider, 30, 0);


        driver.quit();
    }
}
