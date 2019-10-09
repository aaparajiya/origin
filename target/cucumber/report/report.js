$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FeatureFiles/Tc1.feature");
formatter.feature({
  "line": 1,
  "name": "Google Account",
  "description": "",
  "id": "google-account",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9417968100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Create Google Account",
  "description": "",
  "id": "google-account;create-google-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I should navigate google web page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I should create google account",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iShouldNavigateGoogleWebPage()"
});
formatter.result({
  "duration": 6754621300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldCreateGoogleAccount()"
});
formatter.result({
  "duration": 8565031000,
  "status": "passed"
});
formatter.after({
  "duration": 11122440500,
  "status": "passed"
});
});