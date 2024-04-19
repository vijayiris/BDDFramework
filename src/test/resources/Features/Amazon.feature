Feature: Launching Amazon Application

@smoke
Scenario: Launch Amazon Application
Given User Hit Amazon Url
Then Amazon Application is Open
Then User Verify Page Header
Then User Enters LoginID
Then User Enters Password
Then User verifies the Home Page