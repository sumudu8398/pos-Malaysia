package com.pos.pages;

import com.pos.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ParcelPage extends BasePage {


    private By createShipmentButton = By.xpath("//div[contains(text(),'Create Shipment Now')]");

    public ParcelPage(WebDriver driver) {
        super(driver);
    }

    public void clickCreateShipment(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(createShipmentButton));

        find(createShipmentButton).click();
    }
}
