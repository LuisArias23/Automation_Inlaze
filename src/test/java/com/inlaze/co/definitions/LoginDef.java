package com.inlaze.co.definitions;

import com.inlaze.co.steps.login.LoginSteps;
import com.inlaze.co.steps.validations.ValidationStep;
import com.inlaze.co.utilities.websites.WebSite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginDef {
    @Steps(shared = true)
    WebSite url;
    @Steps(shared = true)
    LoginSteps login;
    @Steps(shared = true)
    ValidationStep validate;

    @Given("el usuario navega al sitio web")
    public void userNavigateTo() {
        url.navigateTo("https://test-qa.inlaze.com");
    }

    @When("ingresa credenciales validas")
    public void userLoginWhitValidCredentials() {
        login.typeUsername("luis.arias@gmail.com");
        login.typePassworde("Arias.123");
        login.clickLogin();
    }

    @Then("la aplicacion debe mostrar el modulo princial")
    public void systemShowHome() {
        Assert.assertTrue(validate.titleVisible());
    }

    @When("ingresa con contraseña incorrectas")
    public void userLoginWhitInValidCredentials() {
        login.typeUsername("luis.arias@gmail.com");
        login.typePassworde("Arias.14");
        login.clickLogin();
    }

    @Then("la aplicacion debe mostrar un mensaje de error de password")
    public void systemShowMessageErrorPassword() {
        Assert.assertTrue(validate.errorPasswordMessageIsDisplayed());
    }

    @When("ingresa con correo errado")
    public void userLoginWhitInValidemails() {
        login.typeUsername("luis.ariasgmail.com");
        login.typePassworde("Arias.123");
        login.clickLogin();
    }

    @Then("la aplicacion debe mostrar un mensaje de error de User")
    public void systemShowMessageErrorUser() {
        Assert.assertTrue(validate.errorUserdMessageIsDisplayed());
    }

    @When("ingresa con correo vacio")
    public void userNullLogin() {
        login.typeUsername("");
        login.typePassworde("Arias.123");
    }

    @Then("la aplicacion no debe habilitar el boton SING IN")
    public void systemNotShowButton() {
        Assert.assertFalse(validate.ButtonSingInIsDisplayed());
    }

    @When("ingresa con password vacio")
    public void passwordNullLogin() {
        login.typeUsername("luis.arias@gmail.com");
        login.typePassworde("jh");
    }

    @Then("Se visualiza el nombre del usuario en la aplicacion")
    public void systemShowNameUser() {
        Assert.assertTrue(validate.NameUserIsDisplayed());
    }

    @And("seleccona la opcion Logut")
    public void userLogout() {
        login.clickperfiln();
        login.clickLogout();
    }

    @Then("la aplicacion cierra sesion de manera corecta")
    public void logoutUser() {
        Assert.assertTrue(validate.TextSingInIsDisplayed());
    }
}
