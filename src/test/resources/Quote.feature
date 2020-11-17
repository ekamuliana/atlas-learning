Feature: Quote Feature

  Scenario: Verify user can  add quote and show in grid view
    Given user open atlas web playground
    When user input quote "There's a will there's a way"
    And user select color "Magenta"
    And user click button add quote
    And user wait for 5 seconds
    Then user see quote "There's a will there's a way" with color "Magenta"
