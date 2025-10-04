🍃 EcoFriendlyTravelPlanner – Exam Preparation
_Where journeys are planned not just for distance, but for the Earth._

---

🧭 Overview
The EcoFriendlyTravelPlanner is an exam preparation project in the Maplewick series.
Its purpose is to practice OOP design, data handling, and algorithmic thinking
— all while promoting eco-conscious decision-making in software design.

In this assignment, students will design a Java system 
that helps users plan trips with minimal carbon emissions, 
comparing transport modes and suggesting greener alternatives.

---

🎯 Learning Goals
By completing this project, you will:
- Apply **Object-Oriented Design** principles to model real-world entities.
- Use **inheritance**, **interfaces**, and **polymorphism** effectively.
- Implement **calculations** and **comparisons** across different transport modes.
- Practice **UML modeling**, **class design**, and **test-driven development**.
- Integrate **sustainability-focused logic** into software systems.

---

🌱 Scenario
In the quiet town of **Maplewick**, travelers are becoming more aware of their impact on nature.
The town council commissions a new system — the **EcoFriendlyTravelPlanner** 
— to help its citizens plan journeys in the most sustainable way.

The planner should:
- Compare available **transport options** _(bike, train, car, electric car, bus, walking)_.
- Calculate **CO₂ emissions**, **travel cost**, and **travel time** for each route.
- Recommend the **most eco-friendly** and **balanced** travel option based on these metrics.

🧩 Core Classes
| Class                                                   | Description                                                                                     |
| ------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `TravelOption` *(abstract)*                             | Base class for all travel types; stores distance, cost per km, CO₂ per km, and time per km.     |
| `Bike`, `Train`, `Car`, `ElectricCar`, `Bus`, `Walking` | Subclasses implementing transport-specific values.                                              |
| `Trip`                                                  | Represents a user’s journey — distance, start, destination, and available travel options.       |
| `EcoCalculator`                                         | Provides static methods for comparing emissions, cost, and duration.                            |
| `RecommendationEngine`                                  | Suggests the best travel mode using weighted scoring (e.g., 50% emissions, 30% cost, 20% time). |
| `TravelPlannerApp`                                      | Main program; interacts with the user, gathers trip data, and prints recommendations.           |

⚙️ Example UML Structure (simplified)
+---------------------+
|   TravelOption      |
+---------------------+
| - distance: double  |
| - costPerKm: double |
| - co2PerKm: double  |
| - timePerKm: double |
+---------------------+
| +calculateCost()    |
| +calculateCO2()     |
| +calculateTime()    |
+---------------------+
▲
   ------------------------------------
|        |         |         |      |
Bike   Train      Car     ElectricCar  Bus

🧪 Testing – Alchemy Labs
Test files should verify:
- Correct cost, CO₂, and time calculations.
- Proper subclass behavior and method overriding.
- Accurate recommendation logic from RecommendationEngine.

```java
@Test
void testEcoRecommendation() {
RecommendationEngine engine = new RecommendationEngine();
Trip trip = new Trip(100, "Maplewick", "Greendale");
assertEquals("Train", engine.getBestOption(trip));
}
```

🌍 Extensions (Optional)
- Add **weather-based** or **time-based** logic _(e.g., avoid biking during rain)_.
- Allow **user preferences** for comfort vs. eco score.
- Introduce **CO₂ offset credits** as gamified rewards.
- Store trip history using **serialization** or **file handling**.