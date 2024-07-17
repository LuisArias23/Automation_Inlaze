package com.inlaze.co.steps.validations;

import com.inlaze.co.pages.validations.ValidationPage;
import net.thucydides.core.annotations.Step;


public class ValidationStep extends ValidationPage {

    @Step("Validar visualizacion titulo bienvenida")
    public Boolean titleVisible() {
        return lbl_welcome.isDisplayed();
    }

    @Step("validacion visualizacion mensaje error contraseña")
    public Boolean errorPasswordMessageIsDisplayed() {
        return lbl_errorPassword.isDisplayed();
    }
    @Step("validacion visualizacion mensaje error Usuario")
    public Boolean errorUserdMessageIsDisplayed() {
        return lbl_errorUser.isDisplayed();
    }
    @Step("validacion Habilitacion del boton SING IN")
    public Boolean ButtonSingInIsDisplayed() {
        return btn_login.isEnabled();
    }
    @Step("validacion Visualizacion nombre del usuario")
    public Boolean NameUserIsDisplayed() {
        return lbl_NameUser.isDisplayed();
    }
    @Step("validacion Texto de la pagina Login")
    public Boolean TextSingInIsDisplayed() {
        return lbl_Sing_In.isDisplayed();
    }
    @Step("validacion habilitacion del boton Sing Up")
    public Boolean BtnSingUpIsDisplayed() {
        return btn_SingUp.isClickable();
    }
    @Step("validacion Texto de la pagina Login")
    public Boolean TextSingInIsNotDisplayed() {
        return lbl_Sing_In.isDisabled();
    }
    @Step("validacion Texto del alert contraseas no coinciden")
    public Boolean AlertDifPasswordIsDisplayed() {
        return lbl_password.isDisplayed();
    }
}
