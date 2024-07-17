package com.inlaze.co.steps.registro;

import com.inlaze.co.pages.registro.RegistroPage;
import net.thucydides.core.annotations.Step;

public class RegistroStep extends RegistroPage {
    @Step("click en el boton Sing Up home")
    public void clickSingUphome() {
        btb_PriSingUp.click();
    }

    @Step("Ingresar nombre usuario")
    public void typeUsername(String username) {
        text_fullName.sendKeys(username);
    }
    @Step("Ingresar email")
    public void typeEmail(String email) {
        text_email.sendKeys(email);
    }
    @Step("Ingresar password")
    public void typePassword(String password) {
        text_password.sendKeys(password);
    }
    @Step("Ingresar confimacion password")
    public void typeConfPassword(String password) {
        text_Cofpassword.sendKeys(password);
    }
    @Step("click en el boton Sing Up")
    public void clickSingUp() {
        btb_SingUp.click();
    }
}
