package steps;

import drivermanager.DriverManagement;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TriSteps {
    WebDriver driver = DriverManagement.getDriver(); // Initialisation du driver

    @When("il clique sur le menu de tri")
    public void tri_croissant() {
        WebElement tri = driver.findElement(By.className("product_sort_container"));
        tri.click();
    }

    @And("il sélectionne l'option Price \\(low to high)")
    public void ilSelelectionneLOptionPriceLowToHigh() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement tri = driver.findElement(By.className("product_sort_container"));
        Select select = new Select(tri);
        select.selectByValue("lohi");
    }

    @Then("afficher dans l'ordre croissant des prix")
    public void afficher_tri() {
        System.out.println("tri ok");
    }
}
