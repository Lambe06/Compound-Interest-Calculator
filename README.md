💰 Compound Interest Calculator (JavaFX)

A small desktop application built with JavaFX to calculate compound interest based on initial capital, annual interest rate, and number of years. The graphical interface was designed with SceneBuilder (FXML), with logic kept separate from the controller following the MVC pattern.

✨ Features
Compound interest calculation using the formula M = C × (1 + r/n)^(n×t)
Graphical interface built with SceneBuilder (FXML)
Input validation with error handling
Separated architecture: GUI (FXML) → Controller → Calculation logic
🛠️ Tech Stack
Java 17
JavaFX 21
Maven (dependency management and build)
SceneBuilder (interface design)

📂 Project Structure
src/
 └── main/
     ├── java/
     │   └── org/example/
     │       ├── Main.java              # Application entry point
     │       ├── MainController.java    # Connects GUI to logic
     │       └── CompoundInterest.java  # Calculation formula
     └── resources/
         └── org/example/
             └── main-view.fxml         # Graphical interface
             
▶️ How to Run the Project
Requirements
Java JDK 17 or higher installed
Maven installed (or use the included Maven Wrapper, if present)
Git (only needed if cloning instead of downloading a ZIP)
Steps
Get the code
Clone the repository:
bash
     git clone https://github.com/Lambe_06/compound-interest-javafx.git
     cd compound-interest-javafx
Or click Code → Download ZIP on the GitHub page and extract it.
Run the application From the project's root folder (where pom.xml is located), run:
bash
   mvn clean javafx:run

Maven will automatically download all required dependencies (including JavaFX) the first time, then launch the application window.

Alternative: run from an IDE (IntelliJ IDEA)
Open the project folder in IntelliJ (it will detect the pom.xml and set up automatically)
Open the Maven panel on the right side
Expand Plugins → javafx → javafx:run and double-click it
⚠️ Running Main.java directly with the ▶️ button usually fails with Error: JavaFX runtime components are missing, because JavaFX is not bundled with the JDK. Using the Maven plugin (javafx:run) avoids this issue entirely.

📐 Formula Used
M = C × (1 + r/n)^(n×t)

Where:

C = initial capital
r = annual interest rate (decimal)
n = number of times interest is compounded per year
t = number of years
M = final amount

🚀 Possible Future Improvements
Fade-in animation for the result
Compounding frequency selection (monthly, quarterly, annual) via a ComboBox
Display the interest earned separately (M − C)
Chart showing capital growth over time

👤 Author: Lambe_06
Project built as a learning exercise on JavaFX, FXML, and the MVC pattern.
