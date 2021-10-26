Feature: Is it Friday yet?
  Scenario: Sunday is not Friday
    Given today is 'Friday'
    When I ask about  whether it's Friday yet
    Then I should be told 'Nope'