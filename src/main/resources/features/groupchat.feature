@RunAll
Feature: group chat

  Background: for group chat
  Given I navigated to homepage
  And I login with existing account

  @gc1
  Scenario:User can be send a message
  When user select project name
  And user select group chat
  And user fill message
#  And user send image
  Then user should be send message

  @gc2
  Scenario:User can be click icon close on message option
  When user select project name
  And user select group chat
  And user click message icon option
  And user click icon cancel menu message
  Then the message undelete

  @gc3
  Scenario:User can be click icon close on delete message
  When user select project name
  And user select group chat
  And user click message icon option
  And user click cancel delete message
  Then the message undelete

  @gc4
  Scenario:User can be delete a message
  When user select project name
  And user select group chat
  And user click message icon option
  And user delete message
  Then the message has been deleted

  @gc5
  Scenario:User can't be send a message with blank text
  When user select project name
  And user select group chat
  And user send blank message
  Then user failed send message

  @gc6
  Scenario:User can be click logo
    When user select project name
    And user select group chat
    And user click logo
    Then user navigated to homepage

