Feature: Launching Amazon Application

@smoke
Scenario: Launch Amazon Application
Given User Hit Amazon Url
Then Amazon Application is Open
Then User Verify Page Header


@smoke
Scenario: Login into Amazon
Then User Enters LoginID
Then User Enters Password
Then User verifies the Home Page
  Then User close the browser