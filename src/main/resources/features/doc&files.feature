@RunAll
Feature: Doc&files

  Background: for doc&files
    Given I navigated to homepage
    And I login with existing account

  @doc&files1
  Scenario:User can add a new doc
    When user select project name
    And user select doc&files
    And user select add a new doc
    And user select publish
    Then add a new doc is success

  @doc&files2
  Scenario:User can add a new doc for private only
    When user select project name
    And user select doc&files
    And user select add a new doc
    And user choose private only
    And user select publish
    Then add a new doc for private only is success

  @doc&files3
  Scenario:User can cancel add a new doc
    When user select project name
    And user select doc&files
    And user select add a new doc
    And user select cancel
    Then cancel add a new doc is success

  @doc&files4
  Scenario:User can edit doc&files
    When user select project name
    And user select doc&files
    And user choose files
    And user select edit
    Then user success edit file

  @doc&files5
  Scenario:User can comment on doc&files
    When user select project name
    And user select doc&files
    And user choose files
    And user fill coment
    Then user success comment file

  @doc&files6
  Scenario:User can edit comment on doc&files
    When user select project name
    And user select doc&files
    And user choose files
    And user edit comment
    Then user success edit comment file

  @doc&files7
  Scenario:User can delete comment on doc&files
    When user select project name
    And user select doc&files
    And user choose files
    And user delete comment
    Then user success delete comment

  @doc&files8
  Scenario:User can archieve doc&files
    When user select project name
    And user select doc&files
    And user choose files
    And user select archieve doc
    Then user success archieve doc&files

  @doc&files9
  Scenario:User can create a new folder
    When user select project name
    And user select doc&files
    And user create a new folder
    Then user success create a new folder

  @doc&files10
  Scenario:User can close edit folder
    When user select project name
    And user select doc&files
    And user close edit  folder
    Then user success close edit folder

  @doc&files11
  Scenario:User can add member/subscribers
    When user select project name
    And user select doc&files
    And user select add a new doc
    And user add member
    Then add member is success

  @doc&files12
  Scenario:User can remove member/subscribers
    When user select project name
    And user select doc&files
    And user select project with member
    And user remove member
    Then remove member is success
