#Author: your.email@your.domain.com

Feature: add customer
  
  Scenario: Add customer flow validation
    Given User launches telecom application
    And User click on add customer button
  When User enters the values in fields
  And User click on submit button
  Then User should be displayed customer id is generated

  
 Scenario: Add customer flow validation by using 1 dimensional list
    Given User launches telecom application
    And User click on add customer button
  When User enters the values in fields by using one dimensional list
  |nandha|kumar|nandhakumarsubbaiah@gmail.com|am here to join|7845699817|
  And User click on submit button
  Then User should be displayed customer id is generated
  
  Scenario: Add customer flow validation by using 1 dimensional map
    Given User launches telecom application
    And User click on add customer button
  When User enters the values in fields by using one dimensional map
  |fname|nandha|
  |lname|kumar|
  |email|nandhakumarsubbaiah@gmail.com|
  |addr|am here to join|
  |phneno|7845699817|
  And User click on submit button
  Then User should be displayed customer id is generated
  
  Scenario: Add customer flow validation by using 2 dimensional list
    Given User launches telecom application
    And User click on add customer button
  When User enters the values in fields by using two dimensional list
  |nandhaj|kumare|nandhakumarsubbaiah1@gmail.com|am here to join1|7845699817|
  |nandhak|kumarf|nandhakumarsubbaiah2@gmail.com|am here to join2|7845699817|
  |nandhal|kumarg|nandhakumarsubbaiah3@gmail.com|am here to join3|7845699817|
  And User click on submit button
  Then User should be displayed customer id is generated