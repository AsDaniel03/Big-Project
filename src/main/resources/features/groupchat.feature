@RunAll
Feature: group chat

  Background: for group chat
  Given I navigated to homepage
  And I login with existing account

  @positive @gc1
  Scenario:User can be send a message
  When user select project name
  And user select group chat
  And user fill message
#  And user send image
  Then user should be send message

  @positive @gc2
  Scenario:User can be click icon close on message option
  When user select project name
  And user select group chat
  And user click message icon option
  And user click icon cancel menu message
  Then the message undelete

  @positive @gc3
  Scenario:User can be click icon close on delete message
  When user select project name
  And user select group chat
  And user click message icon option
  And user click cancel delete message
  Then the message undelete

  @positive @gc4
  Scenario:User can be delete a message
  When user select project name
  And user select group chat
  And user click message icon option
  And user delete message
  Then the message has been deleted

  @positive @gc5
  Scenario:User can't be send a message with blank text
  When user select project name
  And user select group chat
  And user send blank message
  Then user failed send message

  @positive @gc6
  Scenario:User can be click logo
    When user select project name
    And user select group chat
    And user click logo
    Then user navigated to homepage

  @Negative @gc7
  Scenario: Verify user can send address without space on chat
    When user select project name
    And user select group chat
    When User send address without space on chat
    Then User can see chat section
    And User can navigates to that link

  @Negative @gc8
  Scenario: user can't send message with enter
    When user select project name
    And user select group chat
    And user fill message
    And user send the message with enter
    Then user can't send the message

