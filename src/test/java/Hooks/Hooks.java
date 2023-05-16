package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setup(){
        System.out.println("Before method calisti...");
    }
    @After
    public void teardown(){
        System.out.println("After method calisti...");

        //driver kapatma
        //fail olan testlerde screeenschoot alma...
    }
}
