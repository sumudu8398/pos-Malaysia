package tests;

import base.BaseTestObject;
import com.pos.constants.Constants;
import com.pos.constants.RelativeURLs;
import com.pos.constants.Times;
import com.pos.pages.ConsignmentPage;
import com.pos.pages.HomePage;
import com.pos.pages.InsurancePage;
import com.pos.pages.ParcelPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class PosWebsiteTests extends BaseTestObject {

    @Test
    public void verifyThatPosWebsiteOffersToBuyInsurance() throws InterruptedException {

        driver.get(RelativeURLs.HOME_PAGE);

        HomePage homePage = new HomePage(driver);

        homePage.clickBuyInsurance();


        // Wait for 1 second
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        for (String windowHandler : driver.getWindowHandles()) {

            driver.switchTo().window(windowHandler);

        }

        Thread.sleep(Times.ONE_SECOND);

        Assert.assertEquals(driver.getCurrentUrl(), RelativeURLs.INSURANCE_PAGE);

        InsurancePage insurancePage = new InsurancePage(driver);

        Assert.assertTrue(insurancePage.isVisibleWidget(Constants.CAR),"Car Widget is not enable");
        Assert.assertTrue(insurancePage.isVisibleWidget(Constants.MOTORCYCLE), "MotorCycle Widget is not enable");

        Assert.assertEquals(insurancePage.clickWidget(),"Ok, let's get to know you");


    }

    @Test
    public void verifyThatPosWebsiteHasLinksToCreateEConsignmentNote() throws InterruptedException {

        driver.get(RelativeURLs.HOME_PAGE);

        HomePage homePage = new HomePage(driver);
        homePage.hoverMouse();
        homePage.clickParcel();

        Thread.sleep(Times.ONE_SECOND);
        Assert.assertEquals(driver.getCurrentUrl(), RelativeURLs.PARCEL_PAGE);

        ParcelPage parcelPage = new ParcelPage(driver);
        parcelPage.clickCreateShipment();

        Thread.sleep(Times.ONE_SECOND);
        Assert.assertEquals(driver.getCurrentUrl(), RelativeURLs.CONSIGNMENT_PAGE);

        ConsignmentPage consignmentPage = new ConsignmentPage(driver);

        Assert.assertEquals(consignmentPage.getSenderTitle(),"Sender Info");
        Assert.assertEquals(consignmentPage.getReceiverTitle(),"Receiver Info");
        Assert.assertEquals(consignmentPage.getSummaryTitle(),"Summary");
        Assert.assertEquals(consignmentPage.getParcelTitle(),"Parcel Info");
    }

}
