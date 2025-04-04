package steps;

import drivermanager.DriverManagement;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PanierSteps {
    WebDriver driver = DriverManagement.getDriver(); // Initialisation du driver

    @When("il ajoute le produit au panier")
    public void ilAjouteLeProduitAuPanier() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("shopping_cart_container")).click();
    }

    @Then("le produit est bien ajouté au panier")
    public void leProduitEstBienAjouteAuPanier() {
        WebElement itemName = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
    }

    @And("il clique sur le bouton checkout")
    public void checkout() {
        driver.findElement(By.id("checkout")).click();
    }
}
