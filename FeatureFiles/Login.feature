Feature: OrangeHRM Modules
@LoginSingleData
Scenario: Validate Login Module
When I open OrangeHRM url on chrome
And I enter username and password
When I click Login Button
Then verify dash text contains in url
When I close the browser
@ScenariowithDatatable
Scenario Outline: Login With Multiple Data
When I open OrangeHRM URL on "<Browser>"
And I enter "<UserName>" in username field
And I enter "<Password>" in password field
When clicking Login Button
Then I should verify dashboard in URL
When closing browser
Examples:
|Browser|Username|Password|
|Chrome|Admin|Qedge123!@#|
|Firefox|Admin1|Qedge123!@#|
|Chrome|Admin2|Qedge123!@#|
|Firefox|Admin|Qedge123!@#|
|Firefox|Admin|Qedge123!@#|
|Chrome|Admin|Qedge123!@#|