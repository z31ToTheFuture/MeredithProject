package Steps;

import Page.HomePage;
import Utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchRecipeSteps extends CommonMethods {

    @Given("User navigates to All Recipes homepage")
    public void user_navigates_to_all_recipes_homepage() {
        setUp();
    }
    @When("User enters Chicken Recipes in search box and clicks search button")
    public void user_enters_chicken_recipes_in_search_box_and_clicks_search_button() {
        HomePage homepage = new HomePage();

        homepage.search("Chicken Recipes");

    }
    @Then("Results for Chicken Recipes is displayed")
    public void results_for_chicken_recipes_is_displayed() {
        HomePage homePage=new HomePage();
        String actualResult= homePage.getResults();

        Assert.assertEquals("Recipe Results for Chicken Recipes",actualResult);

    }



}
