Feature: Converting from Roman numeral to integers

  Rule: Numbers up to ten are represented by I, V and X
    Scenario Outline: The roman numeral of <Roman> corresponds to <Integer Value>
      When a number in roman numerals is represented as "<Roman>"
      Then the equivalent integer value is <Integer Value>
      Examples:
        | Roman | Integer Value |
        | I     | 1             |
        | II    | 2             |
        | III   | 3             |
        | IV    | 4             |
        | V     | 5             |
        | VI    | 6             |
        | VII   | 7             |
        | VIII  | 8             |
        | IX    | 9             |
        | X     | 10            |
