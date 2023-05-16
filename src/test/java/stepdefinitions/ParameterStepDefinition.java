package stepdefinitions;

import io.cucumber.java.en.Given;

public class ParameterStepDefinition {
    @Given("Bu parametreli bir step ve degeri {word}")
    public void buParametreliBirStepVeDegeri(String arg0) {
        System.out.println("Step imizden "+arg0+" degeri okundu");
    }
}
