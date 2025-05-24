# 🛒 Amazon Regression Automation

This project automates an end-to-end user flow on [Amazon](https://www.amazon.com) using **Selenium WebDriver**, **TestNG**, and **Java**, with **Maven** for build management and **GitHub Actions** for continuous integration.

---

## ✅ Test Scenario Covered

> **Test Case:**
1. Open Amazon homepage
2. Search for "wireless mouse"
3. Click on the first search result
4. Add product to cart
5. Open cart and verify product is added

---

## 📁 Project Structure

```
amazon-regression/
├── pom.xml                   # Maven build file
├── testng.xml                # TestNG suite config
├── src/
│   └── test/
│       └── java/
│           ├── tests/        # Contains AmazonTest.java
│           └── pages/        # Page Object Model classes
└── .github/workflows/        # CI pipeline for GitHub Actions
```

---

## 🧪 Technologies Used

- **Java**
- **Selenium WebDriver**
- **TestNG**
- **Maven**
- **Page Object Model (POM)**
- **GitHub Actions CI**

---

## 🚀 How to Run the Tests Locally

### 1. Prerequisites

- Java JDK 11 or later
- Maven
- Chrome browser and ChromeDriver (in system PATH)

### 2. Clone the Repository

```bash
git clone https://github.com/yourusername/amazon-regression.git
cd amazon-regression
```

### 3. Run the Tests

```bash
mvn clean test
```

---

## ⚙️ CI/CD: GitHub Actions

This project includes a pre-configured GitHub Actions workflow that:

- Installs Java and Maven
- Builds the project
- Executes all TestNG tests on every push/pull request to `main` branch

Location: `.github/workflows/maven-test.yml`

---

## 🎬 Demo

A simulated demo video of the test execution is available:  
📽️ [amazon-regression-demo.mp4](sandbox:/mnt/data/amazon-regression-demo.mp4)

---

## 📌 Author

**Your Name**  
Test Automation Engineer | Java + Selenium + CI/CD
