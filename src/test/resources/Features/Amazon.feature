Feature: Launching Amazon Application

@smoke
Scenario: Launch Amazon Application
Given User Hit Amazon Url
Then Amazon Application is Open
Then User Verify Page Header