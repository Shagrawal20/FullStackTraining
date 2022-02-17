
@UserAPI
Feature: Rest API Assignment

  @Get
  Scenario Outline: Fetch list of user on basis of page number
    Given Get List of user API
    When Enter different value in page number <page>
    And status code should be <statuscode>
    Then Verify response    

    Examples: 
      | page | statuscode |
      | 1 | 200 |
      | 2 | 200 |
      
  @Post
    Scenario Outline: Create new user
    Given Create new user
    When Enter Username as "<name>" and Job as "<job>"
    And status code should be <statuscode>  
    Then Verify response  
    
    Examples: 
      | name | job |statuscode |
      | Shubhi | QA |201 |
      | Abhi | SDET |201 |
      
  @Put
    Scenario Outline: Update exixting user in list
    Given Update existing user
    When Update Userid: <id> with username: "<name>" and Job: "<job>"
    And status code should be <statuscode> 
    Then Verify response  
    
    Examples: 
      | id | name | job |statuscode |
      | 1 | Shubhi | Automation Tester |200 |
      | 5 | Abhi | Data Analyst |200 |
                     
  @Delete
    Scenario Outline: Delete exixting user from list
    Given Delete User
    When Delete UserID <id>
    And status code should be <statuscode>    
    Then Verify response 
    
    Examples: 
      | id | statuscode |
      | 2 | 204 |
      | 4 | 204 |                