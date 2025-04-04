package steps;

import drivermanager.DriverManagement;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutSteps {
    WebDriver driver = DriverManagement.getDriver(); // Initialisation du driver

    @And("il remplit les champs avec {string}, {string}, {string}")
    public void ilRemplitLesChampsAvec(String firstname, String lastname, String postal) {
        WebElement firstName = driver.findElement(By.id("first-name"));
        WebElement lastName = driver.findElement(By.id("last-name"));
        WebElement postalCode = driver.findElement(By.id("postal-code"));
        WebElement continueCheckoutButton = driver.findElement(By.id("continue"));

        firstName.sendKeys(firstname);
        lastName.sendKeys(lastname);
        postalCode.sendKeys(postal);
        continueCheckoutButton.click();
    }

    @And("il clique sur finish")
    public void finish() {
        WebElement finishButton = driver.findElement(By.id("finish"));
        finishButton.click();
    }

    @Then("la commande est confirmee")
    public void laCommandeEstConfirmee() {
        WebElement spanTitle = driver.findElement(By.tagName("span"));
    }
}
