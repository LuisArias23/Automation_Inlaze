package com.inlaze.co.pages.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationPage extends PageObject {

    @FindBy(xpath = "//section/h2")
    protected WebElementFacade lbl_welcome;
    @FindBy(xpath = "//div[text()=\"Password doesn't match\"]")
    protected WebElementFacade lbl_errorPassword;
    @FindBy(xpath = "//div[text()=\"User not found\"]")
    protected WebElementFacade lbl_errorUser;
    @FindBy(xpath = "//button[@disabled=\"\"]")
    protected WebElementFacade btn_login;
    @FindBy(xpath = "//h2[text()=\"luis arias\"]")
    protected WebElementFacade lbl_NameUser;
    @FindBy(xpath = "//h1[text()=\"Sign in\"]")
    protected WebElementFacade lbl_Sing_In;
    @FindBy(xpath = " //button[@class=\"btn btn-primary\"]")
    protected WebElementFacade btn_SingUp;
    @FindBy(xpath = "//span[text()=\" Passwords do not match \"]")
    protected WebElementFacade lbl_password;
}
