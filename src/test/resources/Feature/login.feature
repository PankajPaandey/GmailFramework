Feature: Gmail login Feature

Background:
Given Launch the Gmail URL

@ComposeMail
Scenario: Gmail login test scenario
When Verify Gmail login Page
Then User enter username as "pandey810821@gmail.com"
And user enter next button
Then User enter password as "Pankaj8652"
And user enter login button
Then user verify gmail homepage
When user compose mail
Then user verify New Message popup
And user create mail To "pankajpandey7295@gmail.com" Subject "Automation QA" Body "FYI.. Please find attachment"
When user attch testcase
Then user send email


