$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CNET_IncidentAutomation.feature");
formatter.feature({
  "line": 1,
  "name": "CNET INCIDENT AUTOMATION SCENARIOS",
  "description": "",
  "id": "cnet-incident-automation-scenarios",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "CNET_IncidentAutomation",
  "description": "",
  "id": "cnet-incident-automation-scenarios;cnet-incidentautomation",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@CNETIncidentFlow"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Launch Browser and Navigate to CNET INCIDENT URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Switch to MainFrame",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Verify whether Login page is correctly opened or not",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter Username and Password as \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Enter Value in Filter Navigation Field Text Box \"\u003cFilterValue\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 10,
      "value": "#Then Click on All Button for change request scenario"
    },
    {
      "line": 11,
      "value": "#Then Switch to MainFrame"
    }
  ],
  "line": 12,
  "name": "Click on Create New Button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Switch to MainFrame",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Select Sub Category Name as \"\u003csubCategoryValue\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Select Impact Name as \"\u003cimpactValue\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Click On caller LookUP",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Switch to Multiple Window and Select Text as \"\u003ccallerValue\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Select urgency Name as \"\u003curgencyValue\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Click On Business Service LookUP",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Switch to Multiple Window and Select Text as \"\u003cbusinessService\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Click On Configuration Item LookUP",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Switch to Multiple Window and Select Text as \"\u003cconfigurationItem\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Click On Assigned Group LookUP",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Switch to Multiple Window and Select Text as \"\u003cassignedGroup\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Click On Assigned To LookUP",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Switch to Multiple Window and Select Text as \"\u003cassignedTo\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Enter short Description as \"\u003cshortDescriptionValue\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Click on Submit Button",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Validate Priority as \"\u003cpriority\u003e\" State as \"\u003cstateValue\u003e\" and Assigned Group as \"\u003cassignedGroup\u003e\" and Assigned To as \"\u003cassignedTo\u003e\" from the incident list",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "Click on recent Incident Created",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "Verify Major incident Tab is available on screen",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "Tap on Major incident tab button",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Click on Resolve Button",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Select incident state as \"\u003cincidentStateValue\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Click on Resolution Information Tab",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Select Resolution Code as \"\u003cresolutionCodeValue\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Enter Resolution Note as \"\u003cresolutionNoteValue\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Click on Resolve Button",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 39,
      "value": "#Then Click On Problem LookUP"
    },
    {
      "line": 40,
      "value": "# Then Switch to Multiple Window and Select Text as \"\u003cproblemValue\u003e\""
    },
    {
      "line": 41,
      "value": "#Then Verify Major incident Tab is available on screen"
    },
    {
      "line": 42,
      "value": "#Then Tap on Major incident tab button"
    },
    {
      "line": 43,
      "value": "#Then Click on Resolve Button"
    }
  ],
  "line": 44,
  "name": "Click on recent Incident Created",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "Click on Close Incident",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "Validate State as \"\u003cstateValueAfterCloseIncident\u003e\" the incident list",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "Switch to Multiple Window",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "Click on User Menu Dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "Click on Logout",
  "keyword": "Then "
});
formatter.examples({
  "line": 51,
  "name": "",
  "description": "",
  "id": "cnet-incident-automation-scenarios;cnet-incidentautomation;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "FilterValue",
        "callerValue",
        "subCategoryValue",
        "businessService",
        "impactValue",
        "urgencyValue",
        "configurationItem",
        "assignedGroup",
        "assignedTo",
        "shortDescriptionValue",
        "stateValue",
        "priority",
        "resolutionCodeValue",
        "resolutionNoteValue",
        "incidentStateValue",
        "problemValue",
        "stateValueAfterCloseIncident"
      ],
      "line": 52,
      "id": "cnet-incident-automation-scenarios;cnet-incidentautomation;;1"
    },
    {
      "cells": [
        "admin",
        "Cnet345$",
        "Incident",
        "Bud Richman",
        "Email",
        "Blackberry",
        "1 - High",
        "1 - High",
        "Zoom V.92 USB Modem",
        "Service Desk",
        "Beth Anglin",
        "Sample Testing",
        "In Progress",
        "1 - Critical",
        "Solved (Work Around)",
        "Testing",
        "Resolved",
        "PRB0040012",
        "Closed"
      ],
      "line": 53,
      "id": "cnet-incident-automation-scenarios;cnet-incidentautomation;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5262808771,
  "status": "passed"
});
formatter.scenario({
  "line": 53,
  "name": "CNET_IncidentAutomation",
  "description": "",
  "id": "cnet-incident-automation-scenarios;cnet-incidentautomation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@CNETIncidentFlow"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Launch Browser and Navigate to CNET INCIDENT URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Switch to MainFrame",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Verify whether Login page is correctly opened or not",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter Username and Password as \"admin\" and \"Cnet345$\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Enter Value in Filter Navigation Field Text Box \"Incident\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 10,
      "value": "#Then Click on All Button for change request scenario"
    },
    {
      "line": 11,
      "value": "#Then Switch to MainFrame"
    }
  ],
  "line": 12,
  "name": "Click on Create New Button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Switch to MainFrame",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Select Sub Category Name as \"Email\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Select Impact Name as \"1 - High\"",
  "matchedColumns": [
    6
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Click On caller LookUP",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Switch to Multiple Window and Select Text as \"Bud Richman\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Select urgency Name as \"1 - High\"",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Click On Business Service LookUP",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Switch to Multiple Window and Select Text as \"Blackberry\"",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Click On Configuration Item LookUP",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Switch to Multiple Window and Select Text as \"Zoom V.92 USB Modem\"",
  "matchedColumns": [
    8
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Click On Assigned Group LookUP",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "Switch to Multiple Window and Select Text as \"Service Desk\"",
  "matchedColumns": [
    9
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Click On Assigned To LookUP",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "Switch to Multiple Window and Select Text as \"Beth Anglin\"",
  "matchedColumns": [
    10
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Enter short Description as \"Sample Testing\"",
  "matchedColumns": [
    11
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Click on Submit Button",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Validate Priority as \"1 - Critical\" State as \"In Progress\" and Assigned Group as \"Service Desk\" and Assigned To as \"Beth Anglin\" from the incident list",
  "matchedColumns": [
    9,
    10,
    12,
    13
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "Click on recent Incident Created",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "Verify Major incident Tab is available on screen",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "Tap on Major incident tab button",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Click on Resolve Button",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Select incident state as \"Resolved\"",
  "matchedColumns": [
    16
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Click on Resolution Information Tab",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "Select Resolution Code as \"Solved (Work Around)\"",
  "matchedColumns": [
    14
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Enter Resolution Note as \"Testing\"",
  "matchedColumns": [
    15
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "Click on Resolve Button",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 39,
      "value": "#Then Click On Problem LookUP"
    },
    {
      "line": 40,
      "value": "# Then Switch to Multiple Window and Select Text as \"\u003cproblemValue\u003e\""
    },
    {
      "line": 41,
      "value": "#Then Verify Major incident Tab is available on screen"
    },
    {
      "line": 42,
      "value": "#Then Tap on Major incident tab button"
    },
    {
      "line": 43,
      "value": "#Then Click on Resolve Button"
    }
  ],
  "line": 44,
  "name": "Click on recent Incident Created",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "Click on Close Incident",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "Validate State as \"Closed\" the incident list",
  "matchedColumns": [
    18
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "Switch to Multiple Window",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "Click on User Menu Dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 49,
  "name": "Click on Logout",
  "keyword": "Then "
});
formatter.match({
  "location": "ReusableSteps.launch_Browser_and_Navigate_to_CNet_Incident_URL()"
});
formatter.result({
  "duration": 38605049995,
  "status": "passed"
});
formatter.match({
  "location": "ReusableSteps.switch_to_MainFrame()"
});
formatter.result({
  "duration": 177402421,
  "status": "passed"
});
formatter.match({
  "location": "ReusableSteps.verify_whether_Login_page_is_correctly_opened_or_not()"
});
formatter.result({
  "duration": 16397110,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 32
    },
    {
      "val": "Cnet345$",
      "offset": 44
    }
  ],
  "location": "ReusableSteps.enter_Username_and_Password_as_and(String,String)"
});
formatter.result({
  "duration": 2107009720,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Incident",
      "offset": 49
    }
  ],
  "location": "IncidentManagementSteps.enter_Value_in_Filter_navigation_Field_Text_Box(String)"
});
formatter.result({
  "duration": 19905837006,
  "status": "passed"
});
formatter.match({
  "location": "IncidentManagementSteps.clickOnNewButton()"
});
formatter.result({
  "duration": 366039740,
  "status": "passed"
});
formatter.match({
  "location": "ReusableSteps.switch_to_MainFrame()"
});
formatter.result({
  "duration": 239446034,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Email",
      "offset": 29
    }
  ],
  "location": "IncidentManagementSteps.subCategory(String)"
});
formatter.result({
  "duration": 4929129609,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 - High",
      "offset": 23
    }
  ],
  "location": "IncidentManagementSteps.impactName(String)"
});
formatter.result({
  "duration": 3508627278,
  "status": "passed"
});
formatter.match({
  "location": "IncidentManagementSteps.clickOnCaller()"
});
formatter.result({
  "duration": 3617076053,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bud Richman",
      "offset": 46
    }
  ],
  "location": "ReusableSteps.HandleMultipleWindows(String)"
});
formatter.result({
  "duration": 5035126643,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 - High",
      "offset": 24
    }
  ],
  "location": "IncidentManagementSteps.urgencyName(String)"
});
formatter.result({
  "duration": 430937516,
  "status": "passed"
});
formatter.match({
  "location": "IncidentManagementSteps.clickOnBusinessService()"
});
formatter.result({
  "duration": 3645107916,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blackberry",
      "offset": 46
    }
  ],
  "location": "ReusableSteps.HandleMultipleWindows(String)"
});
formatter.result({
  "duration": 5082317406,
  "status": "passed"
});
formatter.match({
  "location": "IncidentManagementSteps.configurationItem()"
});
formatter.result({
  "duration": 4278569104,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Zoom V.92 USB Modem",
      "offset": 46
    }
  ],
  "location": "ReusableSteps.HandleMultipleWindows(String)"
});
formatter.result({
  "duration": 5276131904,
  "status": "passed"
});
formatter.match({
  "location": "IncidentManagementSteps.clickOnAssigedGroup()"
});
formatter.result({
  "duration": 3539836611,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Service Desk",
      "offset": 46
    }
  ],
  "location": "ReusableSteps.HandleMultipleWindows(String)"
});
formatter.result({
  "duration": 4983803461,
  "status": "passed"
});
formatter.match({
  "location": "IncidentManagementSteps.clickOnAssignedTo()"
});
formatter.result({
  "duration": 3586264438,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Beth Anglin",
      "offset": 46
    }
  ],
  "location": "ReusableSteps.HandleMultipleWindows(String)"
});
formatter.result({
  "duration": 5007575890,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sample Testing",
      "offset": 28
    }
  ],
  "location": "IncidentManagementSteps.shortDescription(String)"
});
formatter.result({
  "duration": 825462005,
  "status": "passed"
});
formatter.match({
  "location": "IncidentManagementSteps.click_On_SubmitButton()"
});
formatter.result({
  "duration": 310460972,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 - Critical",
      "offset": 22
    },
    {
      "val": "In Progress",
      "offset": 46
    },
    {
      "val": "Service Desk",
      "offset": 82
    },
    {
      "val": "Beth Anglin",
      "offset": 116
    }
  ],
  "location": "IncidentManagementSteps.verifyValuesAfterIncidentCreated(String,String,String,String)"
});
formatter.result({
  "duration": 3096012597,
  "status": "passed"
});
formatter.match({
  "location": "IncidentManagementSteps.selectIncident()"
});
formatter.result({
  "duration": 504851093,
  "status": "passed"
});
formatter.match({
  "location": "IncidentManagementSteps.verifyMajorIncident()"
});
formatter.result({
  "duration": 3719809232,
  "status": "passed"
});
formatter.match({
  "location": "IncidentManagementSteps.tapOnMajorIncident()"
});
formatter.result({
  "duration": 562662214,
  "status": "passed"
});
formatter.match({
  "location": "IncidentManagementSteps.resolveButton()"
});
formatter.result({
  "duration": 6055266580,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Resolved",
      "offset": 26
    }
  ],
  "location": "IncidentManagementSteps.incidentState(String)"
});
formatter.result({
  "duration": 227546990,
  "status": "passed"
});
formatter.match({
  "location": "IncidentManagementSteps.resolutionInformation()"
});
formatter.result({
  "duration": 6453127198,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Solved (Work Around)",
      "offset": 27
    }
  ],
  "location": "IncidentManagementSteps.resolutionCode(String)"
});
formatter.result({
  "duration": 1322941199,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Testing",
      "offset": 26
    }
  ],
  "location": "IncidentManagementSteps.resolutionNote(String)"
});
formatter.result({
  "duration": 598052720,
  "status": "passed"
});
formatter.match({
  "location": "IncidentManagementSteps.resolveButton()"
});
formatter.result({
  "duration": 5903886905,
  "status": "passed"
});
formatter.match({
  "location": "IncidentManagementSteps.selectIncident()"
});
formatter.result({
  "duration": 553274782,
  "status": "passed"
});
formatter.match({
  "location": "IncidentManagementSteps.closeIncident()"
});
formatter.result({
  "duration": 2276107956,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Closed",
      "offset": 19
    }
  ],
  "location": "IncidentManagementSteps.validateStateAfterCloseIncident(String)"
});
formatter.result({
  "duration": 2140478348,
  "error_message": "java.lang.AssertionError: expected [Closed] but found [Resolved]\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat org.testng.Assert.failNotEquals(Assert.java:513)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:135)\r\n\tat org.testng.Assert.assertEquals(Assert.java:116)\r\n\tat org.testng.Assert.assertEquals(Assert.java:190)\r\n\tat org.testng.Assert.assertEquals(Assert.java:200)\r\n\tat steps.IncidentManagementSteps.validateStateAfterCloseIncident(IncidentManagementSteps.java:356)\r\n\tat ✽.Then Validate State as \"Closed\" the incident list(CNET_IncidentAutomation.feature:46)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ReusableSteps.switchToMultipleWindow()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ReusableSteps.click_on_User_Menu_Dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ReusableSteps.click_on_Logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1034495,
  "status": "passed"
});
});