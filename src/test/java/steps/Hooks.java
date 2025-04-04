package steps;

import drivermanager.DriverManagement;
import io.cucumber.java.After;

public class Hooks {
    @After
    public void fermerNavigateur() {
        DriverManagement.quitDriver();
    }
}
