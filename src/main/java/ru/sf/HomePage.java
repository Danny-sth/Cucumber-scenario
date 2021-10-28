package ru.sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private final WebDriver WEB_DRIVER;

    public HomePage(WebDriver web_driver) {
        WEB_DRIVER = web_driver;
    }

    public void acceptAllCookie() {
        WEB_DRIVER.findElement(By.id("onetrust-accept-btn-handler"))
                .click();
    }

    public void searchGoods(String goodName) {
        WebElement searchButton =
                WEB_DRIVER.findElement(By.xpath("/html/body/header/nav/ul[1]/li[2]/button"));
        searchButton.click();
        WebElement searchField = WEB_DRIVER.findElement(By.id("main-search"));
        searchField.sendKeys(goodName);
        searchField.submit();
    }

    public void chosse_the_size() {
        WebDriverWait waiter = new WebDriverWait(WEB_DRIVER, Duration.ofSeconds(30));
        waiter.until(ExpectedConditions.elementToBeClickable(By.className("trigger-button"))).click();
        waiter.until(ExpectedConditions.elementToBeClickable(By.className("option")))
                .findElements(By.className("option")).get(3).click();
    }

    public void clickAddButton() {
        WEB_DRIVER.findElement(By.className("button-buy")).click();
    }
}
