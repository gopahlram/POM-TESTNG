# POM-TESTNG-FRAMEWORK

In this Page object framework

 page objects are written under : ⁨POM-TESTNG-FRAMEWORK⁩ ▸ ⁨TestNGFramework⁩ ▸ ⁨src⁩ ▸ ⁨main⁩ ▸ ⁨java⁩ ▸ ⁨com⁩ ▸ ⁨BetterWorks⁩
 Test are written under : POM-TESTNG-FRAMEWORK⁩ ▸ ⁨TestNGFramework⁩ ▸ ⁨src⁩ ▸ ⁨test⁩ ▸ ⁨java⁩ ▸ ⁨com⁩ ▸ ⁨betterWorks⁩ ▸ ⁨tests⁩



Features Supported by this framework :
  1. Page Object Method Pattern
  2. TestNG - Running files using testng xml.
  3. Maven - To install dependencies and run project as maven project
  4. Extend Report - Used to get beautify test report.
  5. Property Reader - To read property value such as url, environment during test run
  
  
Other Details: An simple robust framework for selenium build with java. It will generate the extent report with pass and failures.

Test methods can be run through testng xml as a suite with capability of methods to run in parallel.

Easily usable framework where user can able to run in different env using properties file in config.

How to use this framework?


Open the testng.xml under the TestNGFramework/testng.xml
Run the testng.xml file. You can even run as mvn test which will trigger the testng.xml

maven command to run : mvn clean test -DsuiteXmlFile="testng.xml"


How to run my scripts in local?

Clone the repository / Unzip the files and Go to that folder.

Run the maven command mentioned above.

Results will be stored under TestNGFramework/test-output in a html format.
  
