package pages;

public class AtlasPages extends PageObject {

    public void openAtlasPage() throws InterruptedException {
        getDriver().get("https://www.atlasid.tech/");
        Thread.sleep(5000);
    }
}
