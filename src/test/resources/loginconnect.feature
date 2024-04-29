Feature:Test Login Functionality and Start Tracking your forms for a website
  Background: User is able to login successfully and Start Tracking your forms for a website
  Scenario Outline:
    Given User is on the login screen on the browser
    When User adds email as '<Username>'
    And  User adds password as '<Password>'
    And  User clicks on submit button
    Then User logins successfully and can access the dashboard
    When User clicks on Insights drop down
    And Clicks on Forms option in Insights drop down
    And  Clicks on Start Tracking your forms button on the Form Analytics page
    Then The button succesfully navigates user and User reaches a New Campaign page
    When User clicks on Manual setup using Form Name or ID or CSS Selector radio button as the Select an option to setup form tracking option
    And User enters their website '<url>' in the text box under Enter URLs where you want to track the form
    And Selects the Enable Scheduling checkbox under the Advanced Options category
    Then The user clicks on Create button ,The user has successfully setup and campaign for tracking the form analysis for their website


    Examples:
      | Username  | Password | url |
      | cyb3rark97@gmail.com | Rafelia14041997@ |testark97.blog|



