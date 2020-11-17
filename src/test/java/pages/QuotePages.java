package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class QuotePages extends PageObject {

    public void openPage() {
        driver.get("http://bdd.atlasid.tech/");
    }

    public void inputQuote(String quote) {
        WebElement element = driver.findElement(By.id("inputQuote"));
        element.sendKeys(quote);
    }

    public void selectColor(String color) {
        WebElement element = driver.findElement(By.id("colorSelect"));

        Select select = new Select(element);
        select.selectByValue("Magenta");
    }

    public void addQuote() {
        WebElement element = driver.findElement(By.id("buttonAddQuote"));
        element.click();
    }

    public Boolean checkQuoteAndColor(String quote, String color) {
        List<WebElement> quotesList = driver.findElements(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]"));
        List<WebElement> panels = driver.findElements(By.name("quotePanel"));
        for (int i = 0; i < quotesList.size()-1; i++) {
            if(quotesList.get(i).equals(quote) && panels.get(i).getAttribute("style").contains(color)){
                return true;
            }
        }

        return false;
    }
}
