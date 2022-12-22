@tag
Feature: Admin Login
  I want to use this template to check Admin Login
  
   @tag1
  Scenario: Check Admin Login with valid inputs
    Given user open browser with url "https://eforms.com/"
    Then user should see home page
    When user click sign in
    Then user should see login page
    When user enter email as "ghanshyam.selenium@gmail.com"
    And user enter password as "9669655776_g"
    And user click signin
    Then user should see my eform module
    When user click logout
    Then user should see login page
    And user close browser