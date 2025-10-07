# 🧭 EcoAdventure Planner
**Theme:** sustainable travel with an event management twist.

## 🪴 Description
An application that gives eco-friendly adventures possibilities 
for users - like hiking trips, cycling tours, or local festivals.
Based on sustainability, cost and time.

## 🧩 Classes & Interfaces
* **Adventure (abstract)** → has distance, cost per km, CO₂ emission, duration
* **Subclasses:** Hiking, Kayaking, Cycling, TrainTrip
* **User** → can book adventures, cancel them, and compare options
* **Planner** → manages adventures and gives recommendations
* **Interface:** Bookable or Schedulable
* **Enum:** AdventureType (LOCAL, NATIONAL, INTERNATIONAL)

### 🧠 Key exam features
* Inheritance, abstraction
* Exception handling (e.g. FullyBookedException)
* Polymorphism via interface
* Enum integration