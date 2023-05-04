Feature: We are testing background keyword here

  Background: the user wants to go to OrangeHrm website
    Given the user wants to OrangeHrm website
    When The user wants to enter username and password
    Then the user wants to click on login button
    And the user wants to verify that browser loaded on Dashboard

  @TC200  @Smoke  @Regression  @BackgroundKeyword
  Scenario: Adding a new employee
    Then the user wants to click on PIM Module
    And the user wants to go toAdd Employee Page
    Then the user wants to add first name as "Hawre"
    Then the user wants to add last name as "Ali"
    Then the user wants to save personal information
    Then the user should be able to see "Personal Details"

  #In this Scenario, we use Map to provide Multiple pieces of information

  @TC300 @Regression   @BackgroundKeyword
  Scenario: Adding a new employee - different format
    Then the user wants to click on PIM Module
    And the user wants to go toAdd Employee Page
    Then the user wants to add employee's first name and last name as following
    # Key             Value
      |FirstName|     Shanuaz251|
      |LastName |     Renasutech215|
    Then the user wants to add login details as following
    # Key             Value
      |UserName|       Shahnuaz12375|
      |Password|      Renastech!123@|
      |Status  |           Disabled |
    Then the user wants to save personal information
    Then the user should be able to see "Personal Details"


  @BackgroundKeyword
  Scenario: Adding a new employee - Third format using List
    Then the user wants to click on PIM Module
    And the user wants to go toAdd Employee Page
    Then the user wants to add employee's first and last name as following list
    #FirstName    LastName
      |Serhoooooat|      Renannstech3?33|
      |Bahuio6ar |        Banha1233$$%|
    Then the user wants to add login in a list way
    #Username         Password            Status
      |Renastecfh$32   |Renastech?23851|     Disabled|
      |Aligh876f         | Ali123&*369fgj|     Enabled|
      |Hana5hjk        | Hana32uy21$%5|      Enabled|
    Then the user wants to save personal information
    Then the user should be able to see "Personal Details


  @BackgroundKeyword
  Scenario Outline: Adding a new employee - Using Scenario Outline
    And the user wants to go to Admin Module
    Then the user wants to go to Nationalities Section
    And the user wants to click on add new nationality
    Then the user wants to add new nationalities as "<Nationalities>"

    Examples:
      |Nationalities|
      |USA          |
      |Kurdish      |
      |Turkish|
      |India|