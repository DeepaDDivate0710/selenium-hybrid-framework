📌 Selenium Hybrid Framework (Java | TestNG | Maven)

A robust, modular, and scalable Hybrid Automation Framework built using Selenium WebDriver, Java, TestNG, and Maven.

This framework supports:

✔ Data-Driven Testing

✔ Hybrid (Keyword + Data)

✔ Page Object Model (POM)

✔ Reusable utilities

✔ Test reporting

✔ Easy configuration & test management



🚀 Features

🔹 Hybrid Framework Structure:
      Combines POM + Data-Driven structure.
      Modular design for reusability and maintenance.

🔹 TestNG Integration :Parallel execution support, Test grouping,Prioritization

🔹 Data Handling: CSV / Excel-based test data, Utility class for reading/writing data

🔹 Cross-Browser Support: Chrome, Edge, Firefox (optional extension)

🔹 Maven Support: Clean dependency management,Easy CI/CD integration

🔹 Reporting: TestNG HTML reports,Screenshot support (can be added)

📁 Project Structure
selenium-hybrid-framework/

│

├── pom.xml

├── testng.xml

├── README.md

│

├── /resources

│     └── testdata.csv

│

└── /src

      ├── /main/java/utils
      
      │        └── ExcelUtils.java
      
      │
      
      └── /test/java/tests
      
               ├── BaseTest.java
               
               └── DataDrivenTest.java
               

⚙️ Technology Stack

Automation Tool:	       Selenium WebDriver

Language	    :        Java

Test Runner	   :        TestNG

Build Tool	    :        Maven

Data Source	     :       CSV / Excel

IDE	            :      IntelliJ / Eclipse / VS Code


🏁 How to Run the Tests

1️⃣ Clone the Repository
git clone https://github.com/DeepaDDivate0710/selenium-hybrid-framework.git

2️⃣ Navigate into the project
cd selenium-hybrid-framework

3️⃣ Install Dependencies
mvn clean install

4️⃣ Run Test Suite
mvn test

5️⃣ Run via TestNG file
Right-click testng.xml → Run

📚 Test Data (CSV)


Example structure of testdata.csv:


username,password

testuser1,pass123

testuser2,pass456


🧩 Key Classes

BaseTest.java


Initializes WebDriver


Loads configuration


Sets up before/after test methods


DataDrivenTest.java


Reads test data from CSV


Executes automated test logic


ExcelUtils.java


Utility class (read/write CSV or Excel)



🛠 How to Extend the Framework


✔ Add new page classes under:

src/main/java/pages


✔ Add new tests under:

src/test/java/tests


✔ Add more data sets in:

resources/testdata.csv


✔ Add screenshot capture + logs (optional upgrade)


🧪 Sample Test Execution Flow


Test starts → BaseTest initializes WebDriver


TestNG reads test data


Test script executes using input rows


Browser actions performed via Selenium


TestNG generates HTML reports


🧾 Reports


You will find TestNG reports after execution:


/test-output/index.html



Open in browser to view pass/fail charts.

🤝 Contributing

Pull requests are welcome!
For major changes, please open an issue first to discuss your idea.

⭐ If you like this project, give it a Star on GitHub!
