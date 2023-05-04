Feature: Login toGmail and Google search

  Scenario: Verify login to Gmail with positive credentials is successful
    Given  The user wants to got to google
    When   The user wants to click on gmail
    Then   The user wants to verify if Gmail page is opened successfully
    And    The user wants to click on sign in button
    And    The user wants to enter correct email address
    And    The user wants to enter correct password
    And    The user wants to click on login button
    Then   The user wants to verify that signing in was successful

  Scenario: Verify that user is able to search in emails
    Given  The user wants to got to google
    When   The user wants to click on gmail
    Then   The user wants to verify if Gmail page is opened successfully
    And    The user wants to click on sign in button
    And    The user wants to enter correct email address
    And    The user wants to enter correct password
    Then   The user wants to verify that signing in was successful
    And    The user wants to search for Renastech in emails
    Then   The user wants to verify that search was successful

    #Make a search on Google for Renastech and click on first related website
    #and make sure website opened successfully
  Scenario: Verify that the user is able to go ro Renastech using google search
    Given The user wants to go to Google
    When  The user wants to search for Renastech
    And   The user wants to click on google search button
    And   The user wants to click enter Renastech in results
    Then  The user wants to verify that Renastech Website is opened
        #Usually we use Then keyword  where there is some VERIFICATION

        # Each step is sentence sensitive. So you need to pass exact same step to use it in another scenario
  Scenario: Verify that the user is able to go to Renastech by clicking, I'm Feeling Lucky button
    Given The user wants to go to Google
    When  The user wants to search for Renastech
    And   The user wants to click on I'm Feeling Lucky Button
    Then  The user wants to verify that Browser is directed to renastcech.com

    # We can use these steps here when providing details on how reproduce a bug in Jira Ticket

    #This is cucumber bdd framework with Junit
  #Selenium Automation tool for web browser
  #Junit__this is testing framework.FOR ASSERTION/ INSTEAD OF JUNIT WE CAN USE TESTNG


