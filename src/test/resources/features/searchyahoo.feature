Feature: Yahoo Search Functionality

  As a user on the yahoo search page
  I want to perform a search operation
  So that I can view the results

  Background:
    Given I am on yahoo search page

  Scenario Outline: Successful yahoo search
    Given I have entered a yahoo "<Search>" in the search box
    When I click on the enter button
    Then I should see the "<ExpectedResult>" successfully on yahoo
    Examples:
      | Search  |  | ExpectedResult            |
      | Gmail   |  | Gmail - Email from Google |
      | 123     |  | 123 GO! - YouTube         |
      | @Yahoo! |  | Yahoo                     |



