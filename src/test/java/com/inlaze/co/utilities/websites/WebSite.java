package com.inlaze.co.utilities.websites;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class WebSite {
    @Steps(shared = true)
    PageObject inlaze;

    @Step("Navegar al sitio web")
    public void navigateTo(String url) {
        inlaze.setDefaultBaseUrl(url);
        inlaze.open();
    }
}
