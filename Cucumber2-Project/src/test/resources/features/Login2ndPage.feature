Feature: Login to SWAG Labs
  Scenario Outline: Login with multiple credentials
    Given User is on the login page
    When User enters "<username>" and "<password>"
    Then User should see "<result>"

    Examples:
      | username              | password      | result       |
      | standard_user         | secret_sauce  | Products     |
      | locked_out_user       | secret_sauce  | Products     |