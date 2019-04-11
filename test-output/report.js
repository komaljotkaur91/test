$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Komal/workspace/BDDFramework/src/main/java/Features/dealsMap.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM new deal feature",
  "description": "",
  "id": "free-crm-new-deal-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Create a new Deal Test Scenario",
  "description": "",
  "id": "free-crm-new-deal-feature;free-crm-create-a-new-deal-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "komaljotkaur91",
        "Godblessme@123"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User clicks on Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User is on Home Page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User moves to new deal page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User enters deals details",
  "rows": [
    {
      "cells": [
        "Title",
        "Company",
        "Probability"
      ],
      "line": 13
    },
    {
      "cells": [
        "komal",
        "TD",
        "100"
      ],
      "line": 14
    },
    {
      "cells": [
        "car",
        "honda",
        "99"
      ],
      "line": 15
    },
    {
      "cells": [
        "home",
        "remax",
        "98"
      ],
      "line": 16
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Close the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefination.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 4926801800,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 13413600,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 221964300,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.user_clicks_on_Login_Button()"
});
formatter.result({
  "duration": 1809127600,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 11433500,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.user_moves_to_new_deal_page()"
});
formatter.result({
  "duration": 75794700,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.user_enters_deals_details(DataTable)"
});
formatter.result({
  "duration": 5359133000,
  "status": "passed"
});
formatter.match({
  "location": "loginStepDefination.close_the_Browser()"
});
formatter.result({
  "duration": 618799900,
  "status": "passed"
});
});