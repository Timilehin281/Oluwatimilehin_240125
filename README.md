**QA Automation Solution**

 **Table of Contents**

- **[Overview]**
- **Main** 
- **[API Tests]**
  - [1st API]
  - [2nd API]
  - [3rd API]
- **[Mobile Automation]**
- **Branch**
- **QA APP**
-**[CI/CD Pipeline]**
- **[Setup and Usage]**
- **[Performance Analysis]**
- **[Bug Report]**
- **[Acknowledgments]**


**Overview**

This solution automates functional and performance testing for:
1. API endpoints provided in the challenge.
2. Mobile app functionalities.

The repository contains automated scripts using industry-standard tools and frameworks to ensure comprehensive test coverage.


**API Tests**

Automated tests for the APIs are implemented using Javascript with Postman

1st API

- Endpoint: `https://dummy.restapiexample.com/api/v1/create`
- **Verb**: POST
- **Tests**:
  - **Positive**: Valid payload creates an employer successfully.
  - **Negative**: Handle invalid data, missing fields, and rate limiting (`429 | Too Many Requests`).
- **Performance**: Response time under load.

### 2nd API

- **Endpoint**: `http://dummy.restapiexample.com/api/v1/employees`
- **Verb**: GET
- **Tests**:
  - **Positive**: Fetch all employees successfully.
  - **Negative**: Simulate server errors (e.g., 500).
- **Performance**: High throughput testing using `Locust`.

### 3rd API

- **Endpoint**: `http://dummy.restapiexample.com/api/v1/employees/5`
- **Verb**: GET
- **Tests**:
  - **Positive**: Fetch details of a valid employee ID.
  - **Negative**: Invalid or non-existent employee ID.
- **Performance**: Consistent response times under load.

---

## Mobile Automation

Automated tests for the mobile app use `Appium` integrated with intellej.

- **Login Tests**:
  - Valid credentials (`test@user1.com`, `Password1.`).
  - Invalid credentials.
- **Navigation Tests**:
  - Validate transitions across home, settings, and profile screens.
- **Functional Tests**:
  - Buttons, forms, and interactions.
- **Negative Tests**:
  - Form submissions with invalid data.
- **Non-Functional Tests**:
  - App behavior under different network conditions.

---

## CI/CD Pipeline

A CI/CD pipeline is set up using GitHub Actions.

- **Pipeline Features**:
  - Execute API and mobile automation scripts on code commits.
  - Generate test execution reports.
  - Notifications for test results.
- **Documentation**:
  - Steps to set up the pipeline are provided in the repository.



## Setup and Usage

### Prerequisites

- Postman 
- Appium server
- Required maven packages 
- Android device/emulator
- Java and javascript

### Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/YourName/QA_Automation_Solution.git
   cd QA_Automation_Solution
   ```
2. Install dependencies:
   ```bash
   pip install -r requirements.txt
   ```
3. Run API tests:
  
4. Run mobile tests:
  
5. View reports:
  

---

## Performance Analysis

Performance testing was conducted using `Locust` for the APIs. Metrics include:

- **Latency**: Average response time.
- **Throughput**: Requests per second.
- **Error Rate**: Percentage of failed requests.

Results and recommendations are included in the performance report.

---

## Bug Report

Bugs identified during testing are documented in REPORT

---

## Acknowledgments

- `postman for API automation.
- `Appium` for mobile automation.
- Inspiration and guidelines from the provided QA challenge.

---
### limitations
-Invalid login credentials thus limiting the test scenerions 

