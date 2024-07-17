package com.inlaze.co.pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(id = "email")
    protected WebElementFacade txt_username;
    @FindBy(xpath = "//div[@class='w-full join']/input")
    protected WebElementFacade txt_password;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    protected WebElementFacade btn_login;
    @FindBy(xpath = "//div[@class=\"w-10 rounded-full\"]")
    protected WebElementFacade btb_profile;
    @FindBy(xpath = "(//ul/li)[3]")
    protected WebElementFacade btb_logout;
}
