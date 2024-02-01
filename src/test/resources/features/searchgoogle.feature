Feature: Google Search Functionality

  As a user on the search page
  I want to perform a search operation
  So that I can view the results

  Background:
    Given I am on search page

  Scenario Outline: Successful google search
    Given I have entered a "<Search>" in the search box
    When I click on the search button
    Then I should see the "<ExpectedResult>" successfully
    Examples:
      | Search    |  | ExpectedResult                      |
      | wikipedia |  | Wikipedia                           |
      | 0123      |  | 123movies: Watch Free Movies Online |
      | @SJSU!    |  | San José State University           |