Feature: Bing Search Functionality

  As a user on the bing search page
  I want to perform a search operation
  So that I can view the results

  Background:
    Given I am on bing search page

  Scenario Outline: Successful bing search
    Given I have entered a "<Search>" in the bing search box
    When I click on the bing search button
    Then I should see the "<ExpectedResult>" successfully on bing
    Examples:
      | Search    |  | ExpectedResult                              |
      | Microsoft |  | Microsoft – Cloud, Computers, Apps & Gaming |
      | 123       |  | 123 GO! - YouTube                           |