Feature: CNET INCIDENT AUTOMATION SCENARIOS

  @CNETIncidentFlow
  Scenario Outline: CNET_IncidentAutomation
    Given Launch Browser and Navigate to CNET INCIDENT URL
    Then Switch to MainFrame
    Then Verify whether Login page is correctly opened or not
    Then Enter Username and Password as "<Username>" and "<Password>"
    Then Enter Value in Filter Navigation Field Text Box "<FilterValue>"
    #Then Click on All Button for change request scenario
    #Then Switch to MainFrame
    Then Click on Create New Button
    Then Switch to MainFrame
    Then Select Sub Category Name as "<subCategoryValue>"
    Then Select Impact Name as "<impactValue>"
    Then Click On caller LookUP
    Then Switch to Multiple Window and Select Text as "<callerValue>"
    Then Select urgency Name as "<urgencyValue>"
    Then Click On Business Service LookUP
    Then Switch to Multiple Window and Select Text as "<businessService>"
    Then Click On Configuration Item LookUP
    Then Switch to Multiple Window and Select Text as "<configurationItem>"
    Then Click On Assigned Group LookUP
    Then Switch to Multiple Window and Select Text as "<assignedGroup>"
    Then Click On Assigned To LookUP
    Then Switch to Multiple Window and Select Text as "<assignedTo>"
    Then Enter short Description as "<shortDescriptionValue>"
    Then Click on Submit Button
    Then Validate Priority as "<priority>" State as "<stateValue>" and Assigned Group as "<assignedGroup>" and Assigned To as "<assignedTo>" from the incident list
    Then Click on recent Incident Created
    Then Verify Major incident Tab is available on screen
    Then Tap on Major incident tab button
    Then Select incident state as "<incidentStateValue>"
    Then Click on Resolution Information Tab
    Then Select Resolution Code as "<resolutionCodeValue>"
    Then Enter Resolution Note as "<resolutionNoteValue>"
    Then Click on Resolve Button
    #Then Click On Problem LookUP
    #Then Switch to Multiple Window and Select Text as "<problemValue>"
    # Then Verify Major incident Tab is available on screen
    #Then Tap on Major incident tab button
    #Then Click on Resolve Button
    Then Click on recent Incident Created
    Then Click on Close Incident
    Then Validate State as "<stateValueAfterCloseIncident>" the incident list
    Then Switch to Multiple Window
    Then Click on User Menu Dropdown
    Then Click on Logout

    Examples: 
      | Username | Password | FilterValue | callerValue | subCategoryValue | businessService | impactValue | urgencyValue | configurationItem   | assignedGroup | assignedTo  | shortDescriptionValue | stateValue  | priority     | resolutionCodeValue  | resolutionNoteValue | incidentStateValue | problemValue | stateValueAfterCloseIncident |
      | admin    | Cnet345$ | Incident    | Bud Richman | Email            | Blackberry      | 1 - High    | 1 - High     | Zoom V.92 USB Modem | Service Desk  | Beth Anglin | Sample Testing        | In Progress | 1 - Critical | Solved (Work Around) | Testing             | Resolved           | PRB0040012   | Closed                       |
