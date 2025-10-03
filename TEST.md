[⬅️ Back to README](README.md)

# 🧪 Alchemy Labs – Testing in Maplewick
*Where code potions are brewed and tested under the autumn leaves.*

This document explains how to run the unit tests included in the Maplewick repository.  
Every spell (class/function) is carefully verified in the **Alchemy Labs** to ensure it behaves as intended.

---

## 🗺️ Lab Map
- 📁 [Week 1](https://github.com/ViragSzabo/maplewick/tree/main/implementation/test/implementation/week1/) — *Hospital I* and *King's Quests*
- 📁 [Week 2](https://github.com/ViragSzabo/maplewick/tree/main/implementation/test/implementation/week2/Implementation/UserValidation/User) — *User Validation*
- 📁 [Week 3](https://github.com/ViragSzabo/maplewick/tree/main/implementation/test/implementation/week3/Implementation) — *App Store*
- 📁 [Week 4](https://github.com/ViragSzabo/maplewick/tree/main/implementation/test/implementation/week4/Implementation) — *Flight Booking*

---

## ⚙️ Requirements
- IntelliJ IDEA (latest version recommended)
- Java 17 or higher
- JUnit 5

---

## 🔮 Running Tests in IntelliJ
1. Open the Maplewick project in IntelliJ IDEA.
2. Navigate to `implementation/test/implementation` in the Project Explorer.
3. Right-click the folder (or a specific test class) and select **Run 'All Tests'**.
4. The Run window will show the results:
    - 🍃 Green = passed
    - 🍂 Red = failed

## 🏰 Running Tests from Command Line (Optional)
If your project uses **Gradle** or **Maven**:


### Gradle
```bash 
./gradlew test
```

### Maven
```bash 
mvn test
```

## Notes from the Sage
- All tests are written using JUnit 5.
- They cover all major classes and functionalities for your assignments.
- Think of each test as a magical incantation verifying the correctness of your spells.