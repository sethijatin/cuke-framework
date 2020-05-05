@Automation
Feature: Scenarios Accept Parameters
  """
  As a hybrid framework
  I need to provide the functionality to consume data out of the box
  So that no more integrations are required at the users end to consume the data.
  """

  @Scenario
   Scenario: I am scenario which accepts data in different forms
     Given A precondition which takes no parameters
     When An action with an inline parameters Mango and Apple
     Then An outcome with parameter as a table of names
       | First Name | Last Name |
       | Jatin      | Sethi     |
       | Rohan      | Gupta     |
     And An outcome with parameter as a paragraph
     """
     I am a random paragraphs and can take line breaks.

     I also accept line breaks
     """

  @Scenario-Outline
  Scenario Outline: I am a scenario which can be looped with the different set of data
    Given A precondition which takes no parameters
    When An action with an inline parameters <First Name> and <Last Name>
    Then An outcome with parameter as a paragraph
    """
     A simple error message or message which is given to the users.
     """

    Examples:
    | First Name | Last Name |
    | Jatin      | Sethi     |
    | Rohan      | Gupta     |

    @data-level-tags
    Examples:
    | First Name   | Last Name     |
    | Vaibhav      | Vashishta     |
    | Amit         | Bansal         |