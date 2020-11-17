package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import pages.QuotePages;

public class QuoteSteps {

    private QuotePages quotePages = new QuotePages();

    @Given("user open atlas web playground")
    public void userOpenAtlasWebPlayground() {
        quotePages.openPage();
    }

    @When("user input quote {string}")
    public void userInputQuote(String quote) {
        quotePages.inputQuote(quote);
    }

    @And("user select color {string}")
    public void userSelectColor(String color) {
        quotePages.selectColor(color);
    }

    @And("user click button add quote")
    public void userClickButtonAddQuote() {
        quotePages.addQuote();
    }

    @And("user wait for {int} seconds")
    public void wait5Sec(Integer wait) throws InterruptedException {
        Thread.sleep(wait.longValue());
    }

    @Then("user see quote {string} with color {string}")
    public void userSeeQuoteWithColor(String quote, String color) {
        Assert.assertTrue(quotePages.checkQuoteAndColor(quote, color));
    }
}
