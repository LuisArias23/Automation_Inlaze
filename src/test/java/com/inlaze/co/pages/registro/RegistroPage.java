package com.inlaze.co.pages.registro;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegistroPage extends PageObject {

    @FindBy(xpath = " //a[@class=\"font-bold text-primary\"]")
    protected WebElementFacade btb_PriSingUp;
    @FindBy(id = "full-name")
    protected WebElementFacade text_fullName;
    @FindBy(id = "email")
    protected WebElementFacade text_email;
    @FindBy(xpath = "(//div[@class=\"w-full join\"])[1]/input")
    protected WebElementFacade text_password;
    @FindBy(xpath = "(//div[@class=\"w-full join\"])[2]/input")
    protected WebElementFacade text_Cofpassword;
    @FindBy(xpath = " //button[@class=\"btn btn-primary\"]")
    protected WebElementFacade btb_SingUp;

}
