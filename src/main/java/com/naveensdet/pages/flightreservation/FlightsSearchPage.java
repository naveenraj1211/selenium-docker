package com.naveensdet.pages.flightreservation;

import com.naveensdet.pages.AbstractPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class FlightsSearchPage extends AbstractPage {

    @FindBy(id = "passengers")
    WebElement passengerSelect;

    @FindBy(id = "search-flights")
    WebElement searchFlightButton;


    public FlightsSearchPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isAt() {
        this.wait.until(ExpectedConditions.visibilityOf(this.passengerSelect));
        return this.passengerSelect.isDisplayed();
    }

    public void setPassengers(String noOfPassengers) {
        Select passengers = new Select(this.passengerSelect);
        passengers.selectByValue(noOfPassengers);
    }

    public void searchFlights() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", this.searchFlightButton);
        this.searchFlightButton.click();
    }
}
