Feature: Functional testing on Orange HRM
@Smoke @Regression
  Scenario: Login to Orange HRM
    Given the user wants to OrangeHrm website
    When The user wants to enter username and password
    Then the user wants to click on login button
    And the user wants to verify that browser loaded on Dashboard

@ParameterizedDashboard @TC100  @Smoke @Regression
  Scenario: Login to Orange HRM with Parameterized message
    Given the user wants to OrangeHrm website
    When The user wants to enter username and password
    Then the user wants to click on login button
    And  the user wants to verify that browser loaded on "Dashboard"

@TC200  @Smoke  @Regression
  Scenario: Adding a new employee
    Given the user wants to OrangeHrm website
    When The user wants to enter username and password
    Then the user wants to click on login button
    And the user wants to verify that browser loaded on Dashboard
    Then the user wants to click on PIM Module
    And the user wants to go toAdd Employee Page
    Then the user wants to add first name as "Hawre"
    Then the user wants to add last name as "Ali"
    Then the user wants to save personal information
    Then the user should be able to see "Personal Details"

  #In this Scenario, we use Map to provide Multiple pieces of information

@TC300 @Regression @BackgroundKeyword
  Scenario: Adding a new employee - different format
    Given the user wants to OrangeHrm website
    When The user wants to enter username and password
    Then the user wants to click on login button
    And the user wants to verify that browser loaded on Dashboard
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

@TC400   @Regression
  Scenario: Adding a new employee - Third format using List
    Given the user wants to OrangeHrm website
    When The user wants to enter username and password
    Then the user wants to click on login button
    And the user wants to verify that browser loaded on Dashboard
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
    Then the user should be able to see "Personal Details"

  #Scenario outline is the place we implement DDT(Data Driven Test)
  #requirement one upper case
  # in the scenario outline, it will run scenario we created and take one of the examples in this
  #scenario will run 6 times because we have 6 rows in the examples
  @Scenario_Outline2
  Scenario Outline: Adding a new employee - Using Scenario Outline
    Given the user wants to OrangeHrm website
    When The user wants to enter username and password
    Then the user wants to click on login button
    And the user wants to verify that browser loaded on Dashboard
    Then the user wants to click on PIM Module
    And the user wants to go toAdd Employee Page
    Then the user wants to add employee's first and last name as following list
    #FirstName    LastName
      |Serhoooooat|      Renannstech3?33|
      |Bahuio6ar |        Banha1233$$%|
    Then the user wants to add login information "<username>" "<password>" "<status>"

    Examples:
    |username|         password|            status|
    |renastech357    |Renastech2022  |      Disabled|
    |Renastecfh$32   |Renastech?23851|      Disabled|
    |Aligh876f       | Ali123&*369fgj|      Enabled |
    |Hana5hjk        | Hana32uy21$%5 |      Enabled |
    |Seary654        | abcd@!456     |      Enabled |


  @Scenario_Outline1
  Scenario Outline: Adding a new employee - Using Scenario Outline
    Given the user wants to OrangeHrm website
    When The user wants to enter username and password
    Then the user wants to click on login button
    And the user wants to verify that browser loaded on Dashboard
    Then the user wants to click on PIM Module
    And the user wants to go toAdd Employee Page
    Then the user wants to add employees as "<firstName>" "<lastName>"
    Then the user wants to add login information "<username>" "<password>" "<status>"

    Examples:
      |username|          password|            status|     firstName|   lastName|
      |renastech357    |Renastech2022  |      Disabled|     sadsddf |sfdsdgfdgdfg |
      |Renastecfh$32   |Renastech?23851|      Disabled|ghfghfghj    |ghfhgfhfg    |
      |Aligh876f       | Ali123&*369fgj|      Enabled |jmhggg       |kjkhgfffff   |
      |Hana5hjk        | Hana32uy21$%5 |      Enabled |dfgdfgfdg    |twew55qii    |
      |Seary6554        | ab5cd@!456   |      Enabled |nmkjghfd     |yhgdwqa45ss  |
    # Given the user wants to OrangeHrm website
#Then the user wants to go to OrangeHRM Website - We can not use steps after examples keyword because it needs to read out steps for examples
  #We cn leave examples empty which going to be null by default.
@Scenario_Outline3
  Scenario Outline: Adding a new employee - Using Scenario Outline
    Given the user wants to OrangeHrm website
    When The user wants to enter username and password
    Then the user wants to click on login button
    And the user wants to verify that browser loaded on Dashboard
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