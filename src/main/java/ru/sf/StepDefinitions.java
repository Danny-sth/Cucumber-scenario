package ru.sf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class StepDefinitions {

    private String today;
    private String actualAnswer;

    @Given("today is {string}")
    public void today_is(String today) {
        this.today = today;
    }

    @When("I ask about  whether it's Friday yet")
    public void i_ask_about_whether_it_s_friday_yet() {
        this.actualAnswer = WeekAnalizer.isItFridayToday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        assertEquals("Nope", actualAnswer);
    }
}
