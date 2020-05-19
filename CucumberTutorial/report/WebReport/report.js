$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TaggedHooks.feature");
formatter.feature({
  "line": 2,
  "name": "Test Tagged Hooks",
  "description": "",
  "id": "test-tagged-hooks",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TaggedHooks"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "This is the First Scenario",
  "description": "",
  "id": "test-tagged-hooks;this-is-the-first-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@First"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "this is the first step",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "this is the second step",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "this is the third step",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefForTaggedHooks.this_is_the_first_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefForTaggedHooks.this_is_the_second_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefForTaggedHooks.this_is_the_third_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 11,
  "name": "This is the Seccond Scenario",
  "description": "",
  "id": "test-tagged-hooks;this-is-the-seccond-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Second"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "this is the first step",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "this is the second step",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "this is the third step",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefForTaggedHooks.this_is_the_first_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefForTaggedHooks.this_is_the_second_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefForTaggedHooks.this_is_the_third_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 17,
  "name": "This is the Third Scenario",
  "description": "",
  "id": "test-tagged-hooks;this-is-the-third-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@Third"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "this is the first step",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "this is the second step",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "this is the third step",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefForTaggedHooks.this_is_the_first_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefForTaggedHooks.this_is_the_second_step()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefForTaggedHooks.this_is_the_third_step()"
});
formatter.result({
  "status": "skipped"
});
});