package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FirstFeatureStepDefinition {

    int int1,int2,toplam;

    @Given("Elimizde 3 sayisi mevcut")
    public void elimiz3deSayisiMevcut() {
        int1 = 3;
    }
    @Given("Elimizde 5 sayisi mevcut")
    public void elimiz5deSayisiMevcut() {
        int2 = 5;
    }

    @When("Bu sayilar toplandiginda")
    public void buSayilarToplandiginda() {
        toplam = int1+int2;
    }

    @Then("Toplamin 8 oldugu gorulmelidir")
    public void toplaminOlduguGorulmelidir() {
        Assert.assertEquals(8,toplam);
    }


}
