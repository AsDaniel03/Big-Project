@RunAll
Feature: Board

  Background: for board
    Given I navigated to homepage
    And I login with existing account

  @board1
  Scenario:User can create list
    When user select project name
    And user click board
    And user create list
    Then list should be created

  @board2
  Scenario:User can cancel create list
    When user select project name
    And user click board
    And user click icon cancel
    Then list is cancel create

  @board4
  Scenario:User can add a card
    When user select project name
    And user click board
    And user create card
    Then card has been added

  @board5
  Scenario:User can cancel add a card
    When user select project name
    And user click board
    And user cancel create card
    Then add card has been canceled

  @board6
  Scenario:User can create notes
    When user select project name
    And user click board
    And user select card
    And user create notes
    Then notes has been created

  @board7
  Scenario:User can edit notes
    When user select project name
    And user click board
    And user select card
    And user edit notes
    Then notes has been edited

  @board8
  Scenario:User can cancel edit notes
    When user select project name
    And user click board
    And user select card
    And user cancel edit notes
    Then notes has been cancel edited

  @board9
  Scenario:User can undo edit notes
    When user select project name
    And user click board
    And user select card
    And user undo edit notes
    Then notes has been undo edited

  @board10
  Scenario:User can redo edit notes
    When user select project name
    And user click board
    And user select card
    And user redo edit notes
    Then notes has been redo edited

  @board11
  Scenario:User can edit name attachments
    When user select project name
    And user click board
    And user select card
    And user edit name attachments
    Then attachment's name has been edit

  @board12
  Scenario:User can cancel delete attachments
    When user select project name
    And user click board
    And user select card
    And user cancel delete attachments
    Then attachment has been cancel delete

  @board13
  Scenario:User can delete attachments
    When user select project name
    And user click board
    And user select card
    And user delete attachments
    Then attachment has been deleted

  @board14
  Scenario:User can comment activities
    When user select project name
    And user click board
    And user select card
    And user comment activities
    Then successfully comment activities

  @board15
  Scenario:User can cancel comment activities
    When user select project name
    And user click board
    And user select card
    And user cancel comment activities
    Then successfully cancel comment activities

  @board16
  Scenario:User can edit comment activities
    When user select project name
    And user click board
    And user select card
    And user edit comment activities
    Then successfully edit comment activities

  @board17
  Scenario:User can reply comment activities
    When user select project name
    And user click board
    And user select card
    And user reply comment activities
    Then successfully reply comment activities

  @board18
  Scenario:User can cancel delete comment activities
    When user select project name
    And user click board
    And user select card
    And user cancel delete comment activities
    Then successfully cancel delete comment activities

  @board19
  Scenario:User can delete comment activities
    When user select project name
    And user click board
    And user select card
    And user delete comment activities
    Then successfully delete comment activities

  @board20
  Scenario:User can give cheers on comment activities
    When user select project name
    And user click board
    And user select card
    And user give cheers on comment activities
    Then successfully give cheers on comment activities

  @board21
  Scenario:User can give cheers on comment activities using blank text
    When user select project name
    And user click board
    And user select card
    And user give cheers on comment activities using blank text
    Then unsuccessfully give cheers on comment activities

  @board22
  Scenario:User can cancel give cheers on comment activities
    When user select project name
    And user click board
    And user select card
    And user cancel give cheers on comment activities
    Then successfully cancel give cheers on comment activities

  @board23
  Scenario:User can delete cheers on comment activities
    When user select project name
    And user click board
    And user select card
    And user delete cheers on comment activities
    Then successfully delete cheers on comment activities

  @board25
  Scenario:User can sort list from A to Z
    When user select project name
    And user click board
    And user select sort list from A to Z
    Then successfully sort list from A to Z

  @board26
  Scenario:User can sort list from Z to A
    When user select project name
    And user click board
    And user select sort list from Z to A
    Then successfully sort list from Z to A

  @board27
  Scenario:User can sort list by nearest due date
    When user select project name
    And user click board
    And user select sort list by nearest due date
    Then successfully sortlist by nearest due date

  @board28
  Scenario:User can sort list by furthest due date
    When user select project name
    And user click board
    And user select sort list by furthest due date
    Then successfully sortlist by furthest due date

  @board29
  Scenario:User can sort list by nearest created date
    When user select project name
    And user click board
    And user select sort list by nearest created date
    Then successfully sortlist by nearest created date

  @board30
  Scenario:User can sort list by furthest created date
    When user select project name
    And user click board
    And user select sort list by furthest created date
    Then successfully sortlist by furthest created date

  @board31
  Scenario:User can create due date time
    When user select project name
    And user click board
    And user select card
    And user create due date time
    Then successfully create due date time

  @board32
  Scenario:User can edit due date time
    When user select project name
    And user click board
    And user select card
    And user edit due date time
    Then successfully edit due date time

  @board33
  Scenario:User can remove due date time
    When user select project name
    And user click board
    And user select card
    And user remove due date time
    Then successfully remove due date time

  @board24
  Scenario:User can set a complete list
    When user select project name
    And user click board
    And user select set as a complete list
    Then successfully set as a complete list

  @board34
  Scenario:User can move card
    When user select project name
    And user click board
    And user select card
    And user move card
    Then successfully move card

  @board3
  Scenario:User can add a private card
    When user select project name
    And user click board
    And user select card
    And user click private card
    Then private card has been added

  @board35
  Scenario:User can archieve all card in this list
    When user select project name
    And user click board
    And user select archieve all card in this list
    Then successfully archieve all card in this list

  @board36
  Scenario:User can archieve this list
    When user select project name
    And user click board
    And user select archieve this list
    Then successfully archieve this list