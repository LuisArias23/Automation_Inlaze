package com.inlaze.co.definitions;

import com.inlaze.co.steps.login.LoginSteps;
import com.inlaze.co.steps.registro.RegistroStep;
import com.inlaze.co.steps.validations.ValidationStep;
import com.inlaze.co.utilities.websites.WebSite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class RegistroDef {
    @Steps(shared = true)
    WebSite url;
    @Steps(shared = true)
    RegistroStep registro;
    @Steps(shared = true)
    ValidationStep validate;

    @Given("el usuario ingresa sitio web")
    public void userNavigateTo() {
        url.navigateTo("https://test-qa.inlaze.com");
    }

    @When("selecciona la opcion Sing Up")
    public void selecciona_la_opcion_Sing_Up() {
        registro.clickSingUphome();
    }

    @And("Diligencia el formulario correctamente")
    public void Diligencia_el_formulario_correctamente() {
        registro.typeUsername("Prueba2 aa");
        registro.typeEmail("Prueba2@gmail.com");
        registro.typePassword("Pruebas1234");
        registro.typeConfPassword("Pruebas1234");
    }

    @Then("al seleccionar el boton Sing up la aplicacion hace el registro correctamente")
    public void al_seleccionar_el_boton_Sing_up_la_aplicacion_hace_el_registro_correctamente()  {
        registro.clickSingUp();
    }
    @And("Diligencia el formulario correctamente y solo ingresa una paabra en el campo nombre")
    public void Diligencia_el_formulario_correctamente_y_solo_ingresa_una_paabra_en_el_campo_nombree() {
        registro.typeUsername("Prueba2");
        registro.typeEmail("Prueba2@gmail.com");
        registro.typePassword("Pruebas1234");
        registro.typeConfPassword("Pruebas1234");
    }

    @Then("la aplicacion no habilita el boton Sing Up")
    public void la_aplicacion_no_habilita_el_boton_Sing_Up()  {
        Assert.assertFalse(validate.BtnSingUpIsDisplayed());
    }
    @And("Diligencia el formulario correctamente e ingresa el correo en un formato diferente al admitido")
    public void Diligencia_el_formulario_correctamente_e_ingresa_el_correo_en_un_formato_diferente_al_admitido() {
        registro.typeUsername("Prueba2 aa");
        registro.typeEmail("Prueba2gl.com");
        registro.typePassword("Pruebas1234");
        registro.typeConfPassword("Pruebas1234");
    }
    @And("Diligencia el formulario correctamente e ingresa un correo ya registrado")
    public void Diligencia_el_formulario_correctamente_e_ingresa_un_correo_ya_registrado() {
        registro.typeUsername("Prueba2 aa");
        registro.typeEmail("Prueba2@gmail.com");
        registro.typePassword("Pruebas1234");
        registro.typeConfPassword("Pruebas1234");
        registro.clickSingUp();
    }
    @Then("la aplicacion no debe dejar registrar al usuario")
    public void la_aplicacion_no_debe_dejar_registrar_al_usuario()  {
        Assert.assertTrue(validate.TextSingInIsNotDisplayed());
    }
    @And("Diligencia el formulario correctamente e ingresa una contraseña de longitud menor a la permitida")
    public void Diligencia_el_formulario_correctamente_e_ingresa_una_contraseña_de_longitud_menor_a_la_permitida() {
        registro.typeUsername("Prueba2 aa");
        registro.typeEmail("Prueba2@gmail.com");
        registro.typePassword("P4");
        registro.typeConfPassword("P4");
    }
    @And("Diligencia el formulario correctamente e ingresa una contraseña sin cracteres especiales")
    public void Diligencia_el_formulario_correctamente_e_ingresa_una_contraseña_sin_cracteres_especiales() {
        registro.typeUsername("Prueba2 aa");
        registro.typeEmail("Prueba2@gmail.com");
        registro.typePassword("Aa4");
        registro.typeConfPassword("Aa4");
    }
    @And("Diligencia el formulario correctamente sin el campo full name")
    public void Diligencia_el_formulario_correctamente_sin_el_campo_full_name() {
        registro.typeEmail("Prueba2@gmail.com");
        registro.typePassword("Aa4");
        registro.typeConfPassword("Aa4");
    }
    @And("Diligencia el formulario correctamente sin el campo Email")
    public void Diligencia_el_formulario_correctamente_sin_el_campo_Email() {
        registro.typeUsername("Prueba2 aa");
        registro.typePassword("Aa4");
        registro.typeConfPassword("Aa4");
    }
    @And("Diligencia el formulario correctamente sin el campo Password")
    public void Diligencia_el_formulario_correctamente_sin_el_campo_Password() {
        registro.typeUsername("Prueba2 aa");
        registro.typeEmail("Prueba2@gmail.com");
        registro.typeConfPassword("Aa4");
    }
    @And("Diligencia el formulario correctamente sin el campo Confirmacion Password")
    public void Diligencia_el_formulario_correctamente_sin_el_campo_Confirmacion_Password() {
        registro.typeUsername("Prueba2 aa");
        registro.typeEmail("Prueba2@gmail.com");
        registro.typePassword("Aa4");
    }
    @And("Diligencia el formulario correctamente con contraseñas diferentes")
    public void Diligencia_el_formulario_correctamente_con_contraseñas_diferentes() {
        registro.typeUsername("Prueba2 aa");
        registro.typeEmail("Prueba2@gmail.com");
        registro.typePassword("Aea4");
        registro.typeConfPassword("Aa4");
    }
    @And("se visualiza un alert indicando que las contraseñas no coinciden")
    public void se_visualiza_un_alert_indicando_que_las_contraseñas_no_coinciden() {
   Assert.assertTrue(validate.AlertDifPasswordIsDisplayed());
    }
    @And("Diligencia el formulario correctamente con espacios en la contraseñas")
    public void Diligencia_el_formulario_correctamente_con_espacios_en_la_contraseñas() {
        registro.typeUsername("Prueba2 aa");
        registro.typeEmail("Prueba2@gmail.com");
        registro.typePassword("Pru  1234");
        registro.typeConfPassword("Pru  1234");
    }
}
