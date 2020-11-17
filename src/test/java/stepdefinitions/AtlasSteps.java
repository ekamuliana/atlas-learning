package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.AtlasPages;

public class AtlasSteps {

  AtlasPages atlasPages = new AtlasPages();

  @Given("user open atlas page")
  public void userOpenAtlasPage() throws InterruptedException {
    atlasPages.openAtlasPage();
  }
}
