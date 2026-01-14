# Selenium Certification Project

Automated test suite for LambdaTest Selenium Playground using TestNG and Selenium WebDriver.

## Project Structure

```
SeleniumCertification/
├── src/main/java/SeleniumCertification/
│   ├── baseFile.java          # Base test configuration with LambdaTest setup
│   ├── TestScenario1.java     # Simple Form Demo test
│   ├── TestScenario2.java     # Drag & Drop Sliders test
│   └── TestScenario3.java     # Input Form Submit test
├── test-output/               # TestNG execution reports
├── snaps/                     # Screenshot evidences
├── seleniumCertification.xml  # TestNG suite configuration
└── pom.xml                    # Maven dependencies
```

## Test Scenarios

### Test Scenario 1: Simple Form Demo

**File:** `TestScenario1.java`

**Objective:** Validate the Simple Form Demo functionality on LambdaTest Selenium Playground.

**Test Steps:**
1. Navigate to LambdaTest Selenium Playground
2. Click on "Simple Form Demo" link
3. Verify URL contains "simple-form-demo"
4. Enter message "Welcome to LambdaTest" in the input field
5. Click "Get Checked Value" button
6. Verify the displayed message matches the entered text

**Assertions:**
- URL validation: Contains "simple-form-demo"
- Message validation: Output matches input "Welcome to LambdaTest"

---

### Test Scenario 2: Drag & Drop Sliders

**File:** `TestScenario2.java`

**Objective:** Test the slider functionality by adjusting the value to a specific target.

**Test Steps:**
1. Navigate to LambdaTest Selenium Playground
2. Click on "Drag & Drop Sliders" link
3. Locate the third slider element
4. Adjust slider value using arrow keys until it reaches 95
5. Verify the range display shows "95"

**Assertions:**
- Slider value equals "95"

---

### Test Scenario 3: Input Form Submit

**File:** `TestScenario3.java`

**Objective:** Validate form submission with field validation and success message.

**Test Steps:**
1. Navigate to LambdaTest Selenium Playground
2. Click on "Input Form Submit" link
3. Click Submit button without filling fields
4. Verify validation message "Please fill out this field" appears
5. Fill in all form fields:
   - Name: Luis
   - Email: test03@test.com
   - Password: temporal03
   - Company: LambdaTest_testmu
   - Website: www.lambdatest.com
   - Country: United States (dropdown selection)
   - City: Chicago
   - Address 1: 101 Main Street
   - Address 2: Michigan Lake
   - State: Illinois
   - Zip: 60131
6. Click Submit button
7. Verify success message: "Thanks for contacting us, we will get back to you shortly."

**Assertions:**
- Validation message appears when submitting empty form
- Success message displayed after valid submission

---

## Test Configuration

### Base Configuration (`baseFile.java`)

- **Platform:** LambdaTest Cloud Grid
- **Browsers:** Chrome, Firefox (configurable via TestNG parameters)
- **Resolution:** 1024x768
- **Features enabled:** Video recording, Console logs, Network logs, Visual logs

### TestNG Suite (`seleniumCertification.xml`)

Runs `TestScenario3` in parallel on:
- Chrome (Windows 10)
- Firefox (MacOS Tahoe)

## How to Run

### Prerequisites
- Java JDK 8+
- Maven 3.6+

### Execute Tests

```bash
# Run the TestNG suite
mvn test

# Run with specific suite file
mvn test -DsuiteXmlFile=seleniumCertification.xml
```

## Test Execution Evidence

### Test Reports
- **HTML Report:** `test-output/emailable-report.html`
- **XML Results:** `test-output/testng-results.xml`
- **Browser-specific reports:** `test-output/Suite/`

### Screenshots
Evidence screenshots are stored in the `snaps/` directory.

### Latest Execution Results

| Test | Browser | Status | Duration |
|------|---------|--------|----------|
| TestScenario3 - submitForm | Firefox | PASS | ~24s |

## Dependencies

- Selenium WebDriver 3.141.59
- TestNG 6.14.2
- Maven Surefire Plugin 3.0.0

## Author

Luis E.
