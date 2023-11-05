Selenium Automation Test Case Suite README

# Test Suite Description

This Selenium automation test case suite is designed to test the functionality of Automation Project Application using the Selenium WebDriver and testNG framework
The suite covers various Login Test case Scenarios.

# Test Case Structure

The test cases are organized into Page object model based on their functional areas or features. Login folder contains test case files, associated resources.
The structure is as follows:

TestCases
---------------
test/
java/
org.saucedemo/
LoginPageTest.java

Resources
---------------
test/
resources/
config.properties

main/
java/
org.saucedemo/
config/
config.properties

Reports
-----------
test-output/
html/
emailable-report.html


# Prerequisites

Before running the test cases in this suite, ensure that you have the following prerequisites in place:

- Java Development Kit (JDK) installed.
- Selenium WebDriver libraries and dependencies.
- A compatible web browser installed (Chrome).
- WebDriver executable (ChromeDriver) available and configured.
- Test framework (TestNG) and necessary plugins.
- Access to the application, including login credentials and test data.
- Create TestNG XML for reporting Plugin


# Installation

1. Clone this repository to your local machine:

git clone [repository URL]


2. Set up your development environment by installing Java, Selenium WebDriver, and the required test framework.

3. Configure the WebDriver executable path and other settings in the test suite's configuration files as needed.

# Running Test Cases

To run individual test cases or the entire suite, use your testNG framework.


Alternatively, run specific test classes or methods based on your needs.

# Reporting

Test results and reports will be generated in the "test-output" directory within the project folder. You can view test execution details, results, and generated reports there.

# Contact

If you have any questions, issues, or feedback, please contact me through shanmadu.silva@gmail.com.

Happy testing!







