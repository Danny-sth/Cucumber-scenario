package ru.sf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {

    private static final WebDriver WEB_DRIVER;
    private static final HomePage HOME_PAGE;

    static {
        System.setProperty("webdriver.chrome.driver",
                "/home/danny/Projects/cucumber-scenario/src/main/resources/chromedriver");
        WEB_DRIVER = new ChromeDriver();
        HOME_PAGE = new HomePage(WEB_DRIVER);
    }

    @Given("url of H&M {string}")
    public void url_of_h_m(String url) {
        WEB_DRIVER.get(url);
    }

    @When("website is open accept all cookie")
    public void website_is_open_accept_all_cookie() {
        HOME_PAGE.acceptAllCookie();
    }

    @Then("start search {string}")
    public void start_search(String searchParam) {
        HOME_PAGE.searchGoods(searchParam);
    }

    @Then("click on first image")
    public void click_on_first_image() {
        WEB_DRIVER.findElement(By.className("image-container")).click();
    }

    @Then("choose the size")
    public void choose_the_size() {
        HOME_PAGE.chosse_the_size();
    }

    @Then("click add button")
    public void click_add_button() {
        HOME_PAGE.clickAddButton();
    }
}
