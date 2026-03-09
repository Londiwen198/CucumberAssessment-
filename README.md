CucumberAssessment Automation Framework

Project Overview

CucumberAssessment is a BDD (Behavior‑Driven Development) test automation framework built with Java, Selenium, and Cucumber.
It validates user management workflows in the Ndosi Simplified Automation Practice App.
The framework follows the Page Object Model (POM) for maintainability and integrates with JUnit/Maven for execution and reporting.

Lnguages and Tools Used


- Java
- Selenium WebDriver
- Cucumber
- JUnit
- Maven

Why GHERKIN 

Human‑readable syntax → Gherkin uses keywords like Given, When, Then, making scenarios easy to understand for both technical and non‑technical stakeholders.

BDD alignment → Ensures business requirements are directly expressed as executable specifications.

Collaboration → Bridges communication between developers, testers, and business analysts by using a common language.

Traceability → Each Gherkin step is linked to Java step definitions, ensuring clear mapping between requirements and automated tests.


Project Structure

src/test/java
│
├── Assertions/              # Custom assertion helpers
│   └── Assertions.java
│
├── Features/                # Gherkin feature files
│   └── AddNewuser.feature
│
├── Pages/                   # Page Object classes
│   ├── AddNewuser.java
│   └── adminUserManagement.java
│
├── Runners/                 # Cucumber test runner
│   └── TestRunner.java
│
├── stepdefination/          # Step Definitions
│   ├── AddnewuserDefinations.java
│   └── AssertionDefinations.java
│
└── utils/                   # Utilities
├── Base.java
├── BrowserFactory.java
└── Hooks.java
