Feature: Googling Selenium Webdriver

  As a user 
  I want to be able to search for queries
  So I can get answers to my questions

  Scenario: Search for 'Selenium Webdriver'
    Given I am on the Google page
    When I type "Selenium Webdriver"
    Then I should see results for "Selenium Webdriver"
