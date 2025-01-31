Here is a template for the `README.md` file for your project based on the provided Maven `pom.xml` configuration:

```markdown
# OpenBrowser Project

This project demonstrates how to set up a Selenium-based automation framework integrated with TestNG, Cucumber, and ExtentReports for running automated tests with detailed reporting.

## Project Setup

### Prerequisites

Before running this project, ensure you have the following:

- Java 23 or later
- Maven 3.x
- Selenium WebDriver
- TestNG for unit testing
- Cucumber for BDD (Behavior-Driven Development)
- ExtentReports for reporting

### Clone the Repository

To get started with the project, clone the repository:

```bash
git clone <your-repository-url>
cd openbrowser
```

### Build and Run the Project

To build the project, navigate to the project directory and use Maven to compile and run:

```bash
mvn clean install
```

### Dependencies

The project includes the following dependencies:

- **Selenium Java (v4.27.0)**: To automate web browsers.
- **TestNG (v7.10.2)**: For running test cases.
- **Cucumber Java (v7.20.1)**: To write and run Cucumber feature files for BDD testing.
- **Cucumber TestNG (v7.20.1)**: Integration of Cucumber with TestNG.
- **ExtentReports Cucumber Adapter (v1.14.0)**: For generating rich and interactive test reports.

### Project Structure

```
openbrowser
├── src
│   └── test
│       └── java
│           ├── steps
│           ├── tests
│           └── runner
├── pom.xml
```

- `src/test/java/steps`: Contains step definitions for Cucumber.
- `src/test/java/tests`: Contains the test cases and logic for the automated tests.
- `src/test/java/runner`: Contains the Cucumber test runner files.

## Running Tests

To execute the tests, run the following command using Maven:

```bash
mvn test
```

This will trigger the execution of the Cucumber tests using TestNG.

## Reporting

This project uses **ExtentReports** to generate detailed reports of test execution. Reports will be saved in the `target/extent-report/` folder.

## Customization

You can modify the project to fit your specific needs by adding more test steps, modifying Cucumber feature files, or customizing the reporting format.

## License

This project is licensed under the MIT License.
```

This `README.md` provides a quick overview of the project setup, dependencies, and running instructions. You can replace `<your-repository-url>` with the actual URL for your project if you're hosting it on GitHub or another version control platform.