package com.naveensdet.pages.flightreservation;

import com.naveensdet.pages.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrationConfirmationPage extends AbstractPage {

    public RegistrationConfirmationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isAt() {
        this.wait.until(ExpectedConditions.visibilityOf(this.goToFlightsSearchButton));
        return this.goToFlightsSearchButton.isDisplayed();
    }

    @FindBy(id = "go-to-flights-search")
    private WebElement goToFlightsSearchButton;


    public void goToFlightsSearch() {
        this.goToFlightsSearchButton.click();
    }
}

