package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CucumberPages;

public class CucumberSteps {
  CucumberPages cucumberPages = new CucumberPages();

  @Given("user open gosoft page")
  public void userOpenGosoftPage() throws InterruptedException {
    cucumberPages.openGosoftPage();
  }

  @When("user click daftar dosen menu")
  public void userClickDaftarDosenMenu() throws InterruptedException {
    cucumberPages.clickDafrarDosenMenu();
  }

  @Then("user see data dosen")
  public void userSeeDataDosen() {
    Assert.assertTrue(cucumberPages.isTableDosenDisplayed());
  }
}
