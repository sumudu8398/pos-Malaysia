package com.pos.pages;

import com.pos.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {

    private By buyInsuranceButton = By.xpath("//*[@id=\"contentBody\"]/div/app-auth-layout/app-home/div/div/div/div[2]/div/div[1]/a[3]");
    private By closeModalButton = By.xpath("//*[@id=\"mat-mdc-dialog-3\"]/div/div/app-alert/div/div");
    private By parcelLocator = By.xpath("//span[normalize-space()='Parcel']");
    private By mouseHoverLocator = By.xpath("/html/body/app-root/div/app-floating-bar/div[1]/div/div/div/div/div[1]/a/span");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickBuyInsurance(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(buyInsuranceButton));

//        find(closeModalButton).click();
        find(buyInsuranceButton).click();

    }

    public void hoverMouse(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(mouseHoverLocator));

        Actions actions = new Actions(driver);
        WebElement sendElement = find(mouseHoverLocator);
        actions.moveToElement(sendElement).perform();
    }

    public void clickParcel(){
        find(parcelLocator).click();
    }



}
