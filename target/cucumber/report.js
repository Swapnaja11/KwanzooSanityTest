$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Impression.feature");
formatter.feature({
  "line": 1,
  "name": "Lead form impression",
  "description": "",
  "id": "lead-form-impression",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7276641339,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Lead form impression",
  "description": "",
  "id": "lead-form-impression;lead-form-impression",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@impression"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I observe impresssion before test",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I load kwanzoo widget",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I observe impression after test",
  "keyword": "Then "
});
formatter.match({
  "location": "Impression.i_observe_impresssion_before_test()"
});
formatter.result({
  "duration": 38017922008,
  "status": "passed"
});
formatter.match({
  "location": "Impression.i_load_kwanzoo_widget()"
});
formatter.result({
  "duration": 199832314309,
  "status": "passed"
});
formatter.match({
  "location": "Impression.i_observe_impression_after_test()"
});
formatter.result({
  "duration": 20410950293,
  "status": "passed"
});
});