$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/featureFile/forgetpass.feature");
formatter.feature({
  "name": "To validate forget password fuctionality of the facebbok application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Forgetpass"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.scenario({
  "name": "To validate forget password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Forgetpass"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have to enters login page through chromebrowser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enters_login_page_through_chromebrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click the forget password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_the_forget_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter email or mobile number",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_email_or_mobile_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click the search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/featureFile/login.feature");
formatter.feature({
  "name": "To validate Login functionality of the Facebook Application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in Facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_Facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate Login page using invalid username and valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User have to enter invalid username and valid password",
  "rows": [
    {
      "cells": [
        "email",
        "Selenium123@gamil.com"
      ]
    },
    {
      "cells": [
        "username",
        "Aarif"
      ]
    },
    {
      "cells": [
        "password",
        "Aarif7500"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_invalid_username_and_valid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be in invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_be_in_invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in Facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_Facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate Login page using invalid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User have to enter invalid username and invalid password",
  "rows": [
    {
      "cells": [
        "username",
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "Aarif",
        "hard.aarif14@gmail.com",
        "Lovely"
      ]
    },
    {
      "cells": [
        "Noori",
        "nooori@gmail.com",
        "Noori"
      ]
    },
    {
      "cells": [
        "Afrred",
        "Afreed@gamil.com",
        "Afreed"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_invalid_username_and_invalid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be in invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_be_in_invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});