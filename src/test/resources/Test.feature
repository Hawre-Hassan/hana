Feature: This is about login functionality of Amazon
# We use "hashtag" to COMMENTS on Feature File
# Gherkin Language has key words lik Given, When, Then, And, But
# Testrail ans Zephyr Scale are two test case management tools. We don't use them if we use Cucumber BDD framework
  #Cucumber increases Re-usability and Readability

  @dryRunTest
#This is happy path///POSITIVE Scenario
  Scenario: Login amazon with Correct UserName and Correct Password
    Given The user wants to go to Amazon's Website
    When The user wants to enter correct username
    Then The user wants to enter correct password
    And The user wants to click on login button

    #This is boundary Testing///Negative Scenario
  Scenario:Login amazon with Correct UserName and Incorrect Password
    Given The user wants to go to Amazon's Website
    When The user wants to enter correct username
    Then The user wants to enter incorrect password
    And The user wants to click on login button
    And The user wants to verify login is unsuccessful

  #This is boundary Testing///Negative Scenario
  Scenario:Login amazon with Incorrect UserName and Correct Password
    Given The user wants to go to Amazon's Website
    When The user wants to enter incorrect username
    Then The user wants to enter incorrect password
    And The user wants to click on login button
    And The user wants to verify login is unsuccessful