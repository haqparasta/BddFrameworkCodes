@RetailPage 
Feature: Retail Website Features 

# Every feature file starts with Feature: <Name of feature file>
# Every Scenario starts with Scenario: <Name of Test case we want to automate>
# Gherkin keywords are Given, When, Then, And & But
#Given is precondition 
#When is an Action taken
#Then is an expected result
#And is and action or can be used following Given Keyword as well
#But is used for negative  scenarios vrification 

Background: 
	Given User is on Retail website 
	
@Test 
Scenario: Search functionality Test case 

	When User search for 'iphone' 
	And User click on search button 
	Then User should see Iphone image 
	
	
	
	#In scenario Outline, we can run same scenario with multiple set of date
	#We will use Example keyword to pass different data
	#Every scenario outline follows with Examples keyword
	#Under Examples keyword, we place data inside the pipes | and we can separate the columns with pipes
	#In Examples, each row represents one time of execution
@MyCat 
Scenario Outline: Test Search functionality with multiple set of Data 
	When User search for '<itemName>' 
	And User click on search button 
	
	Examples: 
		|itemName|
		|iphone|
		|mac book|
		|Canon|
		
		
		@RegisterTest
		Scenario: Register an Account test case 
		
			When User click  on MyAccount 
			And User click on Register option 
			And User fill the Registration form with below information 
				|firstName|lastName|email|telephone|password|confirmPassword|subscribe|
				|John|Cena|CenaJ@gmai.com|2023034040|myC@t|myC@t|no|
			And User accept the privacy policy 
			And User click on Continue button 
			Then User should be registered in Retail Website 
			
			
			
			
			
			
