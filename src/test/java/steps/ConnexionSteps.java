package steps;

import drivermanager.DriverManagement;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConnexionSteps {
    WebDriver driver = DriverManagement.getDriver();

    @Given("utilisateur est sur la page de connexion de url {string}")
    public void utilisateur_connexion(String url) {
        driver.get(url);
    }

    @When("il se connecte avec un identifiant valide {string} {string}")
    public void connexion_identifiant_valide(String username, String password) {
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.id("login-button"));

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submitButton.click();
    }

    @Then("il est connecté et redirigé vers la page Products")
    public void redirection_products() {
        WebElement productTitle = driver.findElement(By.xpath("//span[@class='title']"));
    }

    @When("il se connecte avec un identifiant invalide {string} {string}")
    public void connexion_identifiant_invalide(String username, String password) {
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.id("login-button"));

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submitButton.click();
    }

    @Then("il est pas connecté et voit un message erreur")
    public void non_connecte_msg_erreur() {
        WebElement errorMessage = driver.findElement(By.cssSelector(".error-message-container"));
        String expectedError = "Epic sadface: Sorry, this user has been locked out.";
        //Assert.assertEquals(expectedError, errorMessage.getText());
    }

}
