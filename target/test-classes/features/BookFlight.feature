Feature: bookflight
  I want to book a flight on the despegar.com page

  Scenario: Book a flight
    Given the user enters the index page of despegar.com
    When select medellin as city of origin
    And select Bogota as your destination city
    And select departure and return date
    And the user clicks the search button
    And the user selects the first flight he sees with the select button
    Then we should see the message Falta poco! Completa tus datos y finaliza tu compra

