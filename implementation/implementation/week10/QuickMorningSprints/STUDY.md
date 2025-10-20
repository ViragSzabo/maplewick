# 🌅💻 Maplewick Study & Practice 💻🌅

## 🪴 Monday – VegetableGarden
**Topics:** 🧠 OOP Basics • Encapsulation • Classes • Collections (Lists)

### 🧩 Key Concepts
* **OOP (Object-Oriented Programming):** 
Programming model that organizes code into objects (data + behavior).
* **Encapsulation:** 
Hiding internal data; using properties and methods to control access.
* **Collections (List<T>):** 
Dynamic array-like structures that store multiple objects.
* **Iteration:** 
Looping through elements in a collection(e.g. foreach).

### 💻 Practice
* Create a Plant class with properties (Name, GrowthRate, DaysSincePlanted).
* A Garden manages a List<Plant> → add, water, and harvest plants.
* Test by calling WaterAll() several times and printing harvest results.

// Create a list
    List<Plant> plants = new ArrayList<>();

// Iterate
    for (Plant p : plants) {
        p.setDaysSincePlanted(p.getDaysSincePlanted() + 1);
    }

## 🔥 Tuesday – SmartBBQ
**Topics:** ⚡ Events • Delegates • Encapsulation • Observer Pattern

### 🧩 Key Concepts
* **Delegate:** 
Type-safe reference to a method 
(used to define events).
* **Event:**
Mechanism to notify subscribers 
when something happens 
(e.g., temperature too high).
* **Publisher/Subscriber Model:**
One class publishes an event, 
others subscribe to react.

### 💻 Practice
* Grill publishes an event TemperatureTooHigh.
* BBQApp subscribes and prints a warning message when temp > 250°C.
* This simulates real-time monitoring — essential in smart systems.


## 🌾 Thursday – Cross-System Integration
**Topics:** 🔗 Composition • Error Handling • Custom Exceptions

### 🧩 Key Concepts
* **Composition:** Building complex systems by combining simpler objects.
* **Error Handling:** Managing unexpected conditions using try-catch.
* **Custom Exceptions:** Your own exception types (e.g., FuelException) for clearer debugging.

### 💻 Practice
Create an EcoSystemManager that connects:
* VegetableGarden → biofuel provider
* SmartBBQ → fuel consumer
* NuclearPowerPlant → safety monitor
* Implement SimulateDay() to manage interactions and throw a FuelException when needed.

## 🌍 Friday – Final Exam Simulation
**Topics:** 🏁 System Integration • Events • Interfaces • File I/O • Exception Handling

### 🧩 Key Concepts
* **Integration:** Combining multiple systems to work together.
* **File I/O (Input/Output):** Reading/writing to files (e.g., saving logs).
* **Exception Handling:** Protecting your program from crashing when errors occur.

### 💻 Practice
As the Maplewick Facility Manager, run SimulateDay():
* Water plants
* Harvest if ready
* Generate biofuel
* Power BBQ
* Monitor reactor
* Log actions to a file
* Catch and handle exceptions gracefully.