@testzero
Feature: Retail Page

  #Note: for this feature, you have to have an existing account
  Background: 
    Given User is on Retail website
    And User click on MyAccount
    When User click on Login
    And User enter username 'abdul_1245@gmail.com' and password '12345@'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  @retail
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | company | website | taxID | paymentMethod |payName|
      | zee     | 1234@   |   123 | sarwary       |TEK User|
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message

  @retail
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on ‘Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
      | trust    |    123456 |       987 | 12345@      | 1234$         |
    And User click on Continue button
    Then User should see a success message

  @retail @Smoktes
  Scenario: Edit your account Information
    When User click on 'Edit your account information' link
    And User modify below information
      | firstname | lastName | email          | telephone  |
      | Haq       | sarwary  | sarw@gmail.com | 5092345678 |
    And User click on Continue button
    Then User should see a message 'Success: Your account has been successfully updated.'
