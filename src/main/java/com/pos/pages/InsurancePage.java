package com.pos.pages;

import com.pos.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InsurancePage extends BasePage {

    private By carWidget = By.xpath("//*[@id=\"vhl\"]/div[1]/div[2]/div/div[1]/div");
    private By motorcycleWidget = By.xpath("//*[@id=\"vhl\"]/div[1]/div[2]/div/div[2]");
    private By componentHeader = By.xpath("//*[@id=\"section2\"]/h5");

    public InsurancePage(WebDriver driver) {
        super(driver);
    }

    public Boolean isVisibleWidget(String vehicle){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(carWidget));

        return switch (vehicle) {
            case "car" -> find(carWidget).isDisplayed();
            case "motorCycle" -> find(motorcycleWidget).isDisplayed();
            default -> null;
        };

    }

    public String clickWidget(){
        find(carWidget).click();
        return find(componentHeader).getText();
    }


}
