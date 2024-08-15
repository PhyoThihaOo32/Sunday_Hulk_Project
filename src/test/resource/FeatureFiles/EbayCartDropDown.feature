@regression @smoke @us-248
Feature: Ebay Cart Functionality

Description: User should able to add items in cart

	Background: 
		Given Open Ebay Homepage
	
	Scenario: Ebay cart functionality
		Given Search for Big Tall Cotton Tee Shirt
		When Select the Big Tall Cotton Tee on item list
		And Select Size
		And Select Men Size
		And Select Shade
		And Select Quantity
		Then Add to shopping cart
		
#	Scenario: Ebay cart functionality for shoes
#		Given Search for Nike Air Jordan
#		When Select the Nike Air Jordan on item list
#		And Select US Shoe Size
#		And Select Quantity
#		Then Add to shopping cart