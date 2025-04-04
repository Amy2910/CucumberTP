Feature: Connexion à l'application Sauce Demo


  Scenario: Connexion réussie avec un identifiant valide
    Given utilisateur est sur la page de connexion de url "https://www.saucedemo.com/"
    When il se connecte avec un identifiant valide "standard_user" "secret_sauce"
    Then il est connecté et redirigé vers la page Products



