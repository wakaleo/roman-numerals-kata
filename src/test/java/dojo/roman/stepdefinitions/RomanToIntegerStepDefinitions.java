package dojo.roman.stepdefinitions;

import dojo.roman.RomanNumbers;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanToIntegerStepDefinitions {

    String romanNumeral;


    @When("a number in roman numerals is represented as {string}")
    public void a_number_in_roman_numerals_is_represented_as(String romanNumeral) {
        this.romanNumeral = romanNumeral;
    }

    @Then("the equivalent integer value is {int}")
    public void the_equivalent_integer_value_is(Integer expectedValue) {
           int romanNumberAsAnInteger = RomanNumbers.asInt(romanNumeral);
           assertThat(romanNumberAsAnInteger).isEqualTo(expectedValue);
    }
}
