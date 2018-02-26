Feature: End to End Functional Test 
Product search and purchase from amazon.com
User wants to search for Product and purchase from amazon.com
Validation criteria : User should be logged in to check out the product

Scenario Outline: Product Search and add to shopping cart
		Given user is on Home Page
		When he search for "<product>"
		And choose to buy the first item
		And Add product to shopping cart
		And User clicks on shopping cart
		And Cliks on proceed to check out
		Then User should be asked to login before checkout
	Examples:
    | product   | 
    | Head first java |

   