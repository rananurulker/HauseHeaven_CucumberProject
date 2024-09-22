package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pages.HomePage;
import utilities.Driver;
import utilities.ConfigReader;

public class HauseHeavenStepDefinitions {
HomePage homePage=new HomePage();

    @Given("kullanici toURL adresine gider")
    public void kullanici_to_url_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("toURL"));

    }
    @Then("sayfada olup olmadigini kontrol eder")
    public void sayfada_olup_olmadigini_kontrol_eder() {

        Assertions.assertTrue(homePage.homePageHomeyazisiElementi.isDisplayed());

    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {

        Driver.quitDriver();
    }


}
