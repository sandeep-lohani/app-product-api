#Introduction
This is a small web project to retrieve product data for a particular customer based on his/her location.
Implemented
+ Created a website which will return available products, based on a customerId of the user i.e. 
o	123 or 135 or 145 etc.

+ the user input their id via a standard HTML <form>& receive results showing: 
o	category
o	product name
o	location

#Implementation details
	+ the backend of the application uses core Java SE8, EE with spring boot
	+ the project compiles on a machine with Maven 3.3 and Java SE8 
	+ the website runs on 8080 port of ‘localhost’, via embedded application server (e.g. Jetty) in spring boot
Set-up
	+ Maven build project using command mvn:install which compiles the application, creates a jar(app-product-selection.jar) and runs the Junit tests.
	+ Run java command to run this spring boot jar java –jar app-product-selection.jar from /target folder
	+ Logs are generated at /var/log/application/product-api

#Usage
##Dependencies
Included dependencies for spring boot, swagger, Jackson, junit and cucumber
##How to Run
	+ Hit URL on browser - http://localhost:8080/local/ 
	+ Input - Enter valid customer name in the input box provided i.e. 123 etc.
	+ Result - The product data is displayed in tabular format and subsequest checkout submit takes to a confirmation page with product details
##Alternate Way to Run
	+ Hit swagger URL on browser - http://localhost:8080/local/swagger-ui.html
	+ Input - Enter valid customer name in request parameter i.e. 123 etc.
	+ Result - The product data is displayed in response
#To do
	+ UI can be further enhanced to do more validation and proper error response
	+ More exception handling can be put in place
