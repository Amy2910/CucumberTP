package steps;

import drivermanager.DriverManagement;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DeconnexionSteps {
    WebDriver driver = DriverManagement.getDriver(); // Initialisation du driver

    @When("il clique sur le bouton de déconnexion Logout")
    public void deconnecter() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement menuButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("react-burger-menu-btn")));
        menuButton.click();
        WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));
        logoutButton.click();
    }

    @Then("redirection vers la page de connexion")
    public void redirectionVersLaPageDeConnexion() {
        System.out.println("deconnexion");
    }
}
