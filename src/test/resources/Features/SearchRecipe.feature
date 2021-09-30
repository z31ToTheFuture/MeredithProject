Feature: Search Recipe

  Scenario: Search for Chicken Recipes
    Given User navigates to All Recipes homepage
    When User enters Chicken Recipes in search box and clicks search button
    Then Results for Chicken Recipes is displayed