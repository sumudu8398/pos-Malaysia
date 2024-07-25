package com.pos.pages;

import com.pos.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConsignmentPage extends BasePage {

    private By senderTitleLocator = By.xpath("//div[@class='tab-title'][normalize-space()='Sender Info']");
    private By receieverTitleLocator = By.xpath("//div[@class='tab-title'][normalize-space()='Receiver Info']");
    private By parcelTitleLocator = By.xpath("//div[contains(text(),'Parcel Info')]");
    private By summaryTitleLocator = By.xpath("//div[contains(text(),'Summary')]");



    public ConsignmentPage(WebDriver driver) {
        super(driver);
    }


    public String getSenderTitle(){
        return find(senderTitleLocator).getText();
    }

    public String getReceiverTitle(){
        return find(receieverTitleLocator).getText();
    }

    public String getParcelTitle(){
        return find(parcelTitleLocator).getText();
    }

    public String getSummaryTitle(){
        return find(summaryTitleLocator).getText();
    }


}
