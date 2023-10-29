Feature: Filling card
  Scenario: add item to card
   Given url of h&m  ('https://www2.hm.com/en_eur/index.html')
    When website is open choose location
    And  accept all cookies
    Then start search 'belt'
    Then click on first image
    And choose the size
    Then click add button