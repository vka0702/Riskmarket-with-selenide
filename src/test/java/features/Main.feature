@sampleTest
Feature: Country widget
  Scenario: User input "Испания" in country widget and insert it as a request
    Given open https://riskmarket-ext.sidenis.com/
    When user inputs "Испания" in country widget
    When user adds one tourists and date of birth "01-01-1987" into field Tourists
    Then field Tourists contains "1 турист"
