$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("End2End_Test.feature");
formatter.feature({
  "line": 1,
  "name": "End to End Functional Test",
  "description": "Product search and purchase from amazon.com\r\nUser wants to search for Product and purchase from amazon.com\r\nValidation criteria : User should be logged in to check out the product",
  "id": "end-to-end-functional-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Product Search and add to shopping cart",
  "description": "",
  "id": "end-to-end-functional-test;product-search-and-add-to-shopping-cart",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "he search for \"\u003cproduct\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Add product to shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User clicks on shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Cliks on proceed to check out",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User should be asked to login before checkout",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "end-to-end-functional-test;product-search-and-add-to-shopping-cart;",
  "rows": [
    {
      "cells": [
        "product"
      ],
      "line": 15,
      "id": "end-to-end-functional-test;product-search-and-add-to-shopping-cart;;1"
    },
    {
      "cells": [
        "Head first java"
      ],
      "line": 16,
      "id": "end-to-end-functional-test;product-search-and-add-to-shopping-cart;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Product Search and add to shopping cart",
  "description": "",
  "id": "end-to-end-functional-test;product-search-and-add-to-shopping-cart;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "he search for \"Head first java\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Add product to shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User clicks on shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Cliks on proceed to check out",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User should be asked to login before checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.userIsOnHomePage()"
});
formatter.result({
  "duration": 7268786576,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Head first java",
      "offset": 15
    }
  ],
  "location": "Steps.heSearchFor(String)"
});
formatter.result({
  "duration": 5289985527,
  "status": "passed"
});
formatter.match({
  "location": "Steps.chooseToBuyTheFirstItem()"
});
formatter.result({
  "duration": 3334660552,
  "status": "passed"
});
formatter.match({
  "location": "Steps.addsProductToShoppingCart()"
});
formatter.result({
  "duration": 1198559317,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userClicksOnShoppingCart()"
});
formatter.result({
  "duration": 950093610,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userClicksOnProceedCheckOut()"
});
formatter.result({
  "duration": 1046979880,
  "status": "passed"
});
formatter.match({
  "location": "Steps.enterPersonalDetailsOnLoginPage()"
});
formatter.result({
  "duration": 8415411555,
  "status": "passed"
});
});