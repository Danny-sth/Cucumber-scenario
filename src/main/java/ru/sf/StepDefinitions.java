package ru.sf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StepDefinitions {

    private static final WebDriver WEB_DRIVER;

    static {
        System.setProperty("webdriver.chrome.driver",
                "/home/danny/Projects/cucumber-scenario/src/main/resources/chromedriver");
        WEB_DRIVER = new ChromeDriver();
    }

    @Given("url of H&M {string}")
    public void url_of_h_m(String url) {
        WEB_DRIVER.get(url);
    }

    @When("website is open accept all cookie")
    public void website_is_open_accept_all_cookie() {
        WEB_DRIVER.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    @Then("start search {string}")
    public void start_search(String searchParam) {
        WebElement searchButton =
                WEB_DRIVER.findElement(By.xpath("/html/body/header/nav/ul[1]/li[2]/button"));
        searchButton.click();
        WebElement searchField = WEB_DRIVER.findElement(By.id("main-search"));
        searchField.sendKeys(searchParam);
        searchField.submit();
    }

    @Then("click on first image")
    public void click_on_first_image() {
        WEB_DRIVER.findElement(By.className("image-container")).click();
    }

    @Then("choose the size")
    public void choose_the_size() {
        WEB_DRIVER.findElement(By.className("button-buy")).click();
        WebDriverWait waiter = new WebDriverWait(WEB_DRIVER, Duration.ofSeconds(30));

        WEB_DRIVER.findElements(By.className("option")).get(3).click();
    }

    @Then("click add button")
    public void click_add_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
