package com.inlaze.co.steps.login;

import com.inlaze.co.pages.login.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps extends LoginPage {
    @Step("Ingresar usuario")
    public void typeUsername(String username) {
        txt_username.sendKeys(username);
    }

    @Step("Ingresar contraseña")
    public void typePassworde(String password) {
        txt_password.sendKeys(password);
    }

    @Step("click en el boton login")
    public void clickLogin() {
        btn_login.click();
    }
    @Step("click en el boton perfil")
    public void clickperfiln() {
        btb_profile.click();
    }
    @Step("click en el boton Logout")
    public void clickLogout() {
        btb_logout.click();
    }
}
