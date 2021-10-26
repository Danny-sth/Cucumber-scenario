Feature: Filling card
  Scenario: Add item to card
    Given url of H&M 'https://www2.hm.com/ru_ru/index.html'
    When website is open accept all cookie
    Then start search 'ремень'
    Then click on first image
    And choose the size
    Then click add button