Feature: Payment Gateway functional test
@BuyingProduct_TC1 @BuyingPro   @Regression
  Scenario: Verify that user can buy a product
    Given the user wants to go payment gateway website
    When the user wants to buy an elephant toy
    Then the user wants to provide payment information
    And the user wants to click on pay now
    Then the user wants to verify message is successful

  #First step is to go to Website
  #Second step is to choose Quantity and Click on buy now button
  #Third step we will provide all required information
  #Fourth step-we will verify if we see success message

  @BuyingProduct_TC2 @BuyingPro  @Regression
  Scenario: Verify that user can buy multiple products
    Given the user wants to go payment gateway website
    When  the user wants to buy elephant toy as "5"
    Then the suer wants to enter credit card number as "5454545454545454"
    And the user wants to enter expiration month as "11"
    And  the user wants to enter expiration year as "2025"
    And the user wants to enter cvv code as "177"
    And the user wants to click on pay now
    Then the user wants to verify message as "Payment successfull!"

@dryRunTest  @Smoke
  Scenario: Verify that user can buy multiple products
    Given the user wants to go payment gateway website
    When  the user wants to buy elephant toy as "5"
    Then the suer wants to enter credit card number as "5454545454545454"
    And the user wants to enter expiration month as "11"
    And  the user wants to enter expiration year as "2025"
    And the user wants to enter cvv code as "177"
    And the user wants to click on pay now
  Then the user wants to verify message as "Payment successfull!"

  @TC600  @Smoke
  Scenario: Verify that user can buy multiple products - Using Map
    Given the user wants to go payment gateway website
    When  the user wants to buy elephant toy as "5"
    Then the user wants to provide entry payment information as following
    |CNumber  |5454545454545454|
    |EMonth   |11              |
    |EYear    |2025            |
    |CvvCode  |177             |
    And the user wants to click on pay now
    Then the user wants to verify message as "Payment successfull!"


    @TC700  @Smoke
  Scenario: Verify that user can buy multiple products - Using Map
    Given the user wants to go payment gateway website
    When  the user wants to buy elephant toy as "5"
    Then the user wants to provide entry payment information as following list
      |CNumber  |5454545454545454|
      |EMonth   |11              |
      |EYear    |2025            |
      |CvvCode  |177             |
    And the user wants to click on pay now
    Then the user wants to verify message as "Payment successfull!"


      @TC800  @Regression
      Scenario: Verify that user can buy multiple products - Using Map
        Given the user wants to go payment gateway website
        When  the user wants to buy elephant toy as following quantity
        |5|
        |9|
        |-0|
        Then the user wants to provide entry payment information as following list1
        |5454545454545454|  11|2025|  177|
        |1236549874569871|12  |2022|199  |
        And the user wants to click on pay now
        Then the user wants to verify message as "Payment successfull!"


