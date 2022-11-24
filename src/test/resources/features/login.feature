Feature: Login Test

  @wip
  Scenario Outline: Positive Login Test

    Given The user is on the login page
    When The user enters "<valid username>" and "<valid password>"
    Then The user should be able to login successfully

    Examples:
      | valid username          | valid password |
      | standard_user           | secret         |
      | problem_user            | secret_sauce   |
      | performance_glitch_user | secret_sauce   |



