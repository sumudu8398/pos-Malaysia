package com.pos.pages;

import com.pos.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParcelPage extends BasePage {


    private By createShipmentButton = By.xpath("//div[contains(text(),'Create Shipment Now')]");

    public ParcelPage(WebDriver driver) {
        super(driver);
    }

    public void clickCreateShipment(){
        find(createShipmentButton).click();
    }
}
