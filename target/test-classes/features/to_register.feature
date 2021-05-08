Feature: Register user

  As QA Automation
  I want to register User
  to check availability

  Background:
    Given Alexa open the web

  @Register
  Scenario: Successful register
    When the Alexa record the data
      | email           | firstName | lastName | password | dateMonth | dateDay | dateYear | addressName | addressLastName | addressCompany | address  | addressCity | state   | postalCode | country       | cellPhone  | addressReference |
      | asdf20@gmail.com | Luisa     | Giraldo  | 12345    | March     | 4       | 1996     | luisa       | giraldo         | SAS            | calle 45 | Medellin   | Arizona | 50002    | United States | 3122585956 | cualquier cosa   |
    Then he sees the message "MY ACCOUNT"
    And he sees the user name "Luisa Giraldo"
