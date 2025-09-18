# RestAssured Automation

[![Java](https://img.shields.io/badge/Java-17+-red.svg)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-Build-blue.svg)](https://maven.apache.org/)
[![RestAssured](https://img.shields.io/badge/RestAssured-API%20Testing-green.svg)](https://rest-assured.io/)
[![JUnit](https://img.shields.io/badge/Test-JUnit5-orange.svg)](https://junit.org/junit5/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

Automated API testing framework using **RestAssured** in Java. This project demonstrates how to validate RESTful web services with clean, maintainable test scripts.

---

## 📂 Repository Structure

```
/
├── .gitignore
├── pom.xml               # Maven dependencies & build config
└── src
    └── test
        └── java
            └── ReqResAPI # Test classes for ReqRes API endpoints
```

---

## 🛠️ Tech Stack & Tools

* **Java 17+**
* **Maven** (dependency & build management)
* **RestAssured** (API testing)
* **JUnit 5** (test execution)
* **JSON / HTTP** validation

---

## 🚀 Features

* Covers CRUD operations on **ReqRes API** endpoints
* Verifies status codes, headers, and response payloads
* Handles positive and negative test cases
* Simple, extendable structure for adding new endpoints

---

## ⚙️ Setup & How to Run

1. **Clone the repo**

   ```bash
   git clone https://github.com/SnakeEye15/RestAssuredAutomation.git
   ```

2. **Open in IDE** (IntelliJ IDEA / Eclipse)

3. **Install dependencies**

   ```bash
   mvn clean install
   ```

4. **Run Tests**

   * From IDE: run test classes under `ReqResAPI`
   * From CLI:

     ```bash
     mvn test
     ```

---

## 📈 Enhancements to Add

* ✅ Data-driven testing (parameterization from JSON/Excel)
* ✅ Reporting (Extent Reports, Allure)
* ✅ CI/CD integration (GitHub Actions, Jenkins)
* ✅ Configurable environments (via `config.properties`)

---

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature-xyz`)
3. Commit changes (`git commit -m 'Add new feature'`)
4. Push to branch (`git push origin feature-xyz`)
5. Open a Pull Request

---

## 👤 Author

* **Dheeraj Saini** ([@SnakeEye15](https://github.com/SnakeEye15))

---

## 📜 License

This project is licensed under the [MIT License](LICENSE).
