# Human Resource Management UI Automation Framework

[![Type](https://img.shields.io/badge/type-UI%20Automation-orange.svg)](https://github.com/Shardul13102001/Human-Resource-Management)
[![Open Issues](https://img.shields.io/github/issues/Shardul13102001/Human-Resource-Management.svg)](https://github.com/Shardul13102001/Human-Resource-Management/issues)
[![Last Commit](https://img.shields.io/github/last-commit/Shardul13102001/Human-Resource-Management.svg)](https://github.com/Shardul13102001/Human-Resource-Management/commits/master)

---

> **A robust, modern, and extensible UI automation suite for the OHRM (OrangeHRM) application. Built from scratch for quality, speed, and continuous delivery.**

---

## Table of Contents

- [Features](#-features)
- [Tech Stack](#-tech-stack)
- [Project Structure](#️-project-structure)
- [Getting Started](#-getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Configuration](#configuration)
  - [Running the Suite](#running-the-suite)
- [Usage](#-usage)
- [Contributing](#-contributing)
- [License](#-license)
- [Contact](#-contact)
- [Show Your Support](#-show-your-support)
- [References](#-references)

---

## ✨ Features

- **🔒 End-to-End HRM Workflows:**  
  Automate critical HR processes in the OHRM app, including login, employee management, and more.

- **🧩 Modular & Extensible:**  
  Clean framework structure for easy addition of new tests and utilities.

- **📊 Reporting Support:**  
  Generate interactive and detailed test reports (e.g., Allure, ExtentReports).

- **✅ Built-in Assertions:**  
  Automatic validation for UI components, workflows, and error handling.

- **CI/CD Ready:**  
  Easily integrable with continuous integration pipelines.

- **Customizable Config:**  
  Environment and test parameters adjustable via properties files.

---

## 🛠 Tech Stack

- **Java** (version as per your setup)
- **Selenium WebDriver**
- **TestNG** or **JUnit**
- **Maven/Gradle**
- **Allure/ExtentReports** (for reporting)

---

## 🗂️ Project Structure

```
Human_Resource_Management/
│
├── src/
│   └── test/
│       ├── java/
│       │   ├── pageObjects/
│       │   │   ├── AdminPage.java
│       │   │   ├── BasePage.java
│       │   │   ├── HomePage.java
│       │   │   └── LoginPage.java
│       │   ├── testBase/
│       │   │   └── BaseClass.java
│       │   ├── testCases/
│       │   │   ├── LoginDDT.java
│       │   │   ├── TC01_GetAllOptions.java
│       │   │   ├── TC02_SearchByUsername.java
│       │   │   ├── TC03_SearchByUserRole.java
│       │   │   └── TC04_SearchByStatus.java
│       │   └── utilities/
│       │       ├── DataProviders.java
│       │       ├── ExcelUtility.java
│       │       └── ExtentReportManager.java
│       └── resources/
│
├── reports/
│   └── Test-Report-2025.07.04.23.16.08.html
│
├── screenshots/
│   ├── verifyLogin_20250704113814.png
│   ├── verifyLogin_20250704113817.png
│   ├── verifyLogin_20250704113833.png
│   └── verifyLogin_20250704113847.png
│
├── src/
├── target/
├── testData/
├── test-output/
├── pom.xml
├── testng.xml
```

## 🏁 Getting Started

### Prerequisites

- Java (recommended: 11 or newer)
- Maven or Gradle
- Compatible web browser (e.g., Chrome, Firefox)

### Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Shardul13102001/Human-Resource-Management.git
   cd Human-Resource-Management
   ```

2. **Install dependencies:**
   ```bash
   mvn clean install
   ```

### Configuration

- Adjust environment settings in the `src/test/resources/config.properties` file.
- Update test data and parameters as needed.

### Running the Suite

- **Build the project:**
  ```bash
  mvn clean package
  ```
- **Execute tests:**
  ```bash
  mvn test
  ```
- **View reports:**
  - Generated reports are available in the `reports/` directory.
  - Extend report
---

## 🔬 Usage

- **Automate OHRM UI:** Integrate and test major HRM user flows and UI components.
- **Add new tests:** Create new test classes or methods in the `src/test/java/` directory.
- **CI/CD integration:** Add test commands to your pipeline for automated builds and testing.

---

## 🤝 Contributing

Contributions are welcome! To contribute:

1. Fork the repository.
2. Create a new branch for your feature or bugfix.
3. Commit your changes with clear messages.
4. Open a Pull Request describing your changes.

---

## 📄 License

This project is open source. See the [LICENSE](LICENSE) file for details.

---

## 📬 Contact

For any questions, suggestions, or issues, please open an issue in the repository or contact the maintainer:

- **GitHub:** [Shardul13102001](https://github.com/Shardul13102001)
- **X Profile:** [Shardul Badare](https://x.com/Shardul40031995)
- **Email:** shardulbadare0011@gmail.com

---

## ⭐️ Show Your Support

If you like this project, please ⭐️ the repo and share it with your friends!

---
