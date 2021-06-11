# Regression Suite One Existing Account
## Copyright Easy Breathe 2020
#### Author: Andrew Rath

<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->
## Table of Contents 

- [Introduction](#introduction)
  - [Defintion of a Successful Test Pass](#defintion-of-a-successful-test-pass)
- [Features and Design Considerations](#features-and-design-considerations)
- [Technologies Used](#technologies-used)
- [Class Structure](#class-structure)
- [Log Files Created](#log-files-created)
  - [Contents of the Log Files](#contents-of-the-log-files)
  - [Log File Naming Convention](#log-file-naming-convention)
- [How to Setup and Execute the "Regression Suite One Existing Account" Test Suite](#how-to-setup-and-execute-the-regression-suite-one-existing-account-test-suite)
  - [Customer Account Setup](#customer-account-setup)
    - [Create A Customer Account](#create-a-customer-account)
  - [Payment Method Setup](#payment-method-setup)
- [Pointing Regression Suite One Existing Account to a different Customer Account and/or a Different Website](#pointing-regression-suite-one-existing-account-to-a-different-customer-account-andor-a-different-website)
  - [Pointing to a Different Customer Account](#pointing-to-a-different-customer-account)
    - [Web Orders](#web-orders)
    - [Phone Orders](#phone-orders)
  - [Pointing to a different Website](#pointing-to-a-different-website)
- [Executing the "Regression Suite One Existing Account" Regression Suite](#executing-the-regression-suite-one-existing-account-regression-suite)
  - [Clone the Repository Locally](#clone-the-repository-locally)
  - [Install IntelliJ IDEA](#install-intellij-idea)
  - [Point the RegressionSuiteOneExistAcct project to the correct modules](#point-the-regressionsuiteoneexistacct-project-to-the-correct-modules)
  - [Point the Log4j2 Logging tool to the correct log file location](#point-the-log4j2-logging-tool-to-the-correct-log-file-location)
- [Execute the Regression Suite](#execute-the-regression-suite)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

## Introduction 
This Regression Suite is designed to verify that no regression in the creation of orders is introdiced by new code.  This is accomplished by creating a single order of each type of Web Order and Phone Order that is determined to be required by Marketing, Dev and QA.
### Defintion of a Successful Test Pass
 - A Test Pass is considered successful if all orders are correctly created 


## Features and Design Considerations
The tests included in the *Easy Breathe Regression Suite One Existing Account* are designed to provide:
 - A quick, easy to execute suite of tests to be execued against a release candidate prior to deployment which tests major functionality of the Easy Breathe website
 - Verification that a code change in the software does not affect the existing functionality of the Easy Breathe website
 - A living, breathing test suite that is added to and deducted from as new features are added or removed
 - Accurate, acitionable reports on test results 
 
 The tests included are _not_ designed to:
 - Rely on previously created Customer, DigiShip Pro or other accounts
   - All required accounts are created manually prior to execution of the test suite


## Technologies Used
The following technologies were used to create this Regression Suite:
 - java version "14" 2020-03-17
   - Java(TM) SE Runtime Environment (build 14+36-1461)
   - Java HotSpot(TM) 64-Bit Server VM (build 14+36-1461, mixed mode, sharing)
 - Selenium Version 3.150.1
 - IntelliJ IDEA Community 2020.1
 - IntelliJ IDEA 2020.1.2 (Community Edition)
   - Build #IC-201.7846.76, built on May 31, 2020
   - Runtime version: 11.0.7+10-b765.53 amd64
 - -VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
 - Log4J2 version 1.13.3
   - log4j-1.2-api-2.13.3.jar
   - log4j-api-2.13.3.jar
 - Windows 10 10.0
   - GC: ParNew, ConcurrentMarkSweep
   - Memory: 1973M
   - Cores: 8
   - Non-Bundled Plugins: org.jetbrains.kotlin

## Class Structure
 - There is a main calling class for this project which calls all subsequent classes and methods
   - [RegressionSuiteOneExistAcct.java](src/RegressionSuiteOneExistAcct.java)
 - The different subsections of test cases include 
   - Web Orders, which are created via a customer account login to the EasyBreathe QA website rentacpap.co
     - All Web Order test cases begin with ***WebOrder***
       - Example: [WebOrderGiftCard.java](src/WebOrderGiftCard.java)
   - Phone Orders, which are created via a Limited User or Super User logging in to the DigiShop Pro account on rentacpap.co
     - [DigiShop Pro Login](https://rentacpap.co/secure/admin/index.php)
     - All Phone Order test cases begin with ***PhoneOrder***
       - Example: [PhoneOrderGiftCard.java](src/PhoneOrderGiftCard.java)
   - Log Creation, which are classes dedicated to the logging the regression suite execution, found in the Utilities Package
     - [Log.java](src/Utilities/Log.java) 
     - [GetFileName.java](src/utilities/GetFileName.java)

## Log Files Created 

### Contents of the Log Files
Each test pass will create a detailed log file utilizing the Log4j2 logging tool created by the Apache team, including but not limited to:
- A date-time stamp and message type at the start of each line of the log file
- - Example:2020-07-30-13:40:21 INFO  ----- Starting WebOrderCC ----- 
- The start of the Regression Suite
- The Start of each order
- The End of each order
- The Type of each order, i.e. Web, Phone, etc.
- Pertinent data for actions occuring during each order
- The End of the Regression Suite
### Log File Naming Convention
The log file name will be construcetd in the following manner:
- YYYY-MM-DD-HHMM_RegressionSuiteOneExAcct.log
- Example: 
  - [2020-08-03-1057_RegressionSuiteOneExAcct.log](logs/Example/2020-08-03-1107_RegressionSuiteOneExAcct.log)
  
## How to Setup and Execute the "Regression Suite One Existing Account" Test Suite

### Customer Account Setup
Prior to executing Regression Suite One Existing Account, you will need to create a customer account and save a Credit Card Payment method.  This account and payment method will be used for all orders created during execution of the Regression Suite.
#### Create A Customer Account
1. Launch hhttps://rentacpap.co from your browser
2. Click on the "Login" link in the upper right
3. Click on "Create an Account" under the "New Customer" heading
4. Enter the desired Email Adddress and Password in the correct fields under the "New Customer" heading
5. Click the "Create an Account" button
6. Enter all values under the "Billing Address" field and click the "Save Billing Info" button
   - The info can be made up, unique to this customer account
7. Enter all values under the "Shipping Address" field, even if the values are the same as the Billing Address, and click the "Save Shipping Info" button
   - The info can be made up, unique to this customer account
8. To verify the account was created successfully, log out of the newly created customer account by clicking the "Log Out" link in the upper right and log back in

### Payment Method Setup
To create a Payment Method, you will want to order a simple item such as a filter, pay for this item with a credit card, and make sure to click the "Save this Payment Method" checkbox: 
![PaymentMethod](https://user-images.githubusercontent.com/24703709/91206110-db458900-e6c3-11ea-826b-56c5c90202f1.jpg)

1. Login to the account created above
2. Search for "filter" in the search field
3. Click "BUY NOW"
4. Click "ADD TO CART"
5. Once the filter is added to yourr cart, click the "Secure Checkout" button
6. Scroll to the bottom of the Secure Checkout page and enter the Credit Card information you should have received from Marketing or Dev
7. Once the Credit Card innfo has been entered, and you have verified the "Save Payment Method" checkbox is selected, click the "Submit My Order" button
8. Your order should complete successfully, and you have now saved the Customer Account and Payment Method required for executing Regression Suite One Existing Account

**At this point, you will want to point Regression Suite One Existing Account to the Customer Account you just created**

## Pointing Regression Suite One Existing Account to a different Customer Account and/or a Different Website
### Pointing to a Different Customer Account
To change the customer account you want to run the tests against, you will need to make the following changes:
#### Web Orders
- In the file [Login.java](src/Login.java), look for the following lines:
- - // Customer Account to login as (Change account to login as different customer)
- - String custAcct = "EB2@fromthemind.net";
- - String custPwd = "E4syBr34th3";
- Change the customer account and the assiociated password to the new account desired
#### Phone Orders
- In the file [PhoneOrderbase](src/PhoneOrderBase.java), look for the following lines:
- -  // Search for Customer - will need to dynamically get the customer name from CreateAccount
- -  driver.findElement(By.name("fName")).sendKeys("EB2");
- Change the sendKeys value to the first name of thhe customer account you want to use, noting that this expects the first name of the account to be unique, so care must be taken when creating the test customer account to ensure a unique first name
- - In the example above, the customer account first name was "EB2"

### Pointing to a different Website
The "Regression Suite One Existing Account" regression suite points to the rentacpap.co website by default.
To point to a different website:
- In the file [RegressionSuiteOneExistAcct.java](src/RegressionSuiteOneExistAcct.java), look for the following lines:
- - // Launch rentacpap.co (Change url for other websites)
- - driver.get("https://rentacpap.co/");
- Change the url in the second line to the new website you want to execute the suite against
- - For example, to point to www.easybreathe.com. you would change:
- - - driver.get("https://rentacpap.co/");
- - - - to
- - - driver.get("https://www.easybreathe.com/");


## Executing the "Regression Suite One Existing Account" Regression Suite

### Clone the Repository Locally
First, you will need to clone the RegressionSuiteOneExistAcct repository to your local machine.
Instructions for cloning a GitHub repository can be found on the web, or bt asking your dev contact

The repository can be found at the easybreathe/tests/RegressionSuiteOneExistAcct/ location.  Ask your developer contact for permissions to this repository and instructions on how to get there.

### Install IntelliJ IDEA 
You will want to install the IntelliJ IDEA Java-based IDE to your machine, which will help you execute and modify the Regression Suite One Existing Account regresion suite

Instructions can be found for installing IntelliJ IDEA on the jetbrains.com website here:
[Installing InetilliJ IDEA](https://www.jetbrains.com/help/idea/installation-guide.html)

Once IDEA has been installed, you will need to open the RegressionSuiteOneExistAcct project from IDEA.  Select the "File - Open" menu option and select the location to which you cloned the repository in the steps outlined above

### Point the RegressionSuiteOneExistAcct project to the correct modules
You will now want to make sure that you point to the correct Java modules in the Regression Suite One Existing Account project.
Here is an example of the correct settings:
![IntelliJIDEAModules](https://user-images.githubusercontent.com/24703709/91220660-b78d3d80-e6d9-11ea-8380-52941a2387b3.jpg) 

For the version of the regression suite current as of 08/25/2020, the following modules need to be added to the project:
- 14(java version "14.0.1")
- selenium-server-standalone-3.141.59.jar
- log4j-api-2.13.3.jar
- log4j-core-2.13.3.jar

These jar files can be found in the \tools directory that were part of the repository that you cloned in the above steps.  _Note that it is important that the exct version s listed here are added to the project!_

To add the .jar "modules" to the project, follow thhese steps:
1. From within IntelliJ IDEA, click on the "File - Project Structure" menu option
2. Select  the "Modules" option under "Project Settings" 
3. CLick on the "Dependencies" tab
4. Click the "+" on the right side of the "Dependencies" page and select the "JARs or directories" option
5. Browse to the desired jar (as listed above) and click "OK"
6. Repeat steps 4 and 5 for all remaining jar files
7. Once all jar files (modules) have been added, click "OK" a couple times to return to the IDEA main window

### Point the Log4j2 Logging tool to the correct log file location
The Log4J2 logging tool uses the [log4j2.xml](src/Utilities/log4j2.xml) file to set logging parameters, including logfile location among other settings.

Open the file, and look for the following lines:
        
  fileName="e:\\\GitHub\\\EasyBreathe\\\logs\\\RegressionSuiteOneExistingAccount\\\RegressionSuiteOneExistAcct.log"
  filePattern="e:\\\GitHub\\\EasyBreathe\\\logs\\\RegressionSuiteOneExistingAccount\\\%d{yyyy-MM-dd-HHmmss}-RegressionSuiteOneExistAcct.log"
  ignoreExceptions="false"
  
Change both the fileName and filePattern linles to point to the location you want your log files to live locally.  Note that the current settings place the log files in the generic GutHub\\EasyBreathe\\logs location, which follows good programming pracitces.  You can place the log files anywhere you like, so long as that location is reflected in these lines.

For more information and examples on the Log4J2 logging tool, checkout the [Apache Log4j 2](http://logging.apache.org/log4j/2.x/) site or simply search for "log4j2".

## Execute the Regression Suite
After following the above steps, you should be ready to execute the Regression Suite One Existing Account set of tests!

To Execute the Regression Suite One Existing Account set of tests:
1. Open IntelliJ IDEA 
2. Open the RegressionSuiteOneExistAcct project
3. From within the project, open the RegressionSuiteOneExistAcct.java file
4. Select the "Run "RegressionSuiteOneExistAcct"" menu option or hit Shift+F10
5. The regression suite should now beging execution
6. Click here to watch a video of executing the regression suite: [Executing RSOEA](/src/Videos/ExecutingRGOEA.mp4 "Click to watch")




