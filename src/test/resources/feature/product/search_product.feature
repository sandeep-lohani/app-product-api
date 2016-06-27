Feature: Product search
  As a customer, I want to select the products that are available to me, based on the location of my home.
 
  Scenario: Search products by location
    Given a customer with the customerId '123'
    When the customer searches for products available to his location
    Then 4 products should have been found
      And product 1 should have the category 'Sports'
      And product 1 should have the category 'News'
      
      
      