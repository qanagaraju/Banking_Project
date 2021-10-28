@featureTest
Feature: Test script for cucumber login cases


@Scenario2
  Scenario: My login Test
    Given user launch browser
	When user insert username
	When user insert password
	Then user click login button
	Then user close test
	
	
	