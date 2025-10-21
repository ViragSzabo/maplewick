# 🌅💻 Quick Morning Sprints 🌅💻

Each day:
🧩 Self-contained
⏱️ ≤30 minutes 
    _(20-25 min for coding & 5-10 min for testing, polishing, javadoc)_
✅ Runnable and testable
💪 Builds toward Friday’s full integration challenge

## 🪴 Monday – VegetableGarden (OOP Basics & Collections)
**Goal:** Review OOP + List iteration + encapsulation.
⏱️ **Estimated time:** 25 minutes

### **Tasks:**
* ✅ Create a class _Plant_ with properties _Name_, _GrowthRate_, and _DaysSincePlanted_.
* ✅ Create a class _Garden_ that holds a _List<Plant>_.

### **Methods:**
* ✅ _AddPlant(Plant plant)_
* ✅ _WaterAll()_ → increases each plant’s _DaysSincePlanted by 1_.
* ✅ _HarvestReady()_ → returns a list of plants with _DaysSincePlanted >= 7_.

### **Test:**
* ✅ Add 3 plants.
* ✅ Call WaterAll() 7 times.
* ✅ Print harvested plants' names.

### **Conclusion:**
#### 🌿 Code Quality (4.5 / 5)
Great naming, consistent style, and sses single-purpose.
Very readable and easy to extend for later days.
Polishing: could make the harvest() method return the harvested list instead of just printing (for later integration).
*Printing “Harvesting ready” even when there’s none could be conditional — but that’s minor.

#### 🧩 Concept Coverage (3.5 / 3.5)
OOP basics: class structure, properties, methods
Collections: List usage and iteration
Encapsulation: clear and consistent
Constructor usage: check!
toString() override: nice touch

#### 🧪 Testing & Output (1.5 / 1.5)
Main properly simulates a garden cycle
Output is clear and easy to read
Tested the loop logic thoroughly (7x watering)

#### ✨ Bonus for Clarity (+0.5)
Perfectly commented and clean formatting
Could easily serve as a study reference example for OOP + collections

**Final grade:** 🏅 9.5 / 10
It sets up perfectly for next challenge (SmartBBQ)

## 🔥 Tuesday – SmartBBQ (Events & Delegates)
**Goal:** Review delegates, events, and encapsulation.
⏱️ **Estimated time:** 25 minutes

### **Tasks:**
* Simulate a **smart grill** that sends a notification when the temp. is too high.

### **Methods:**
* _Grill_ class with _Temperature_ property.
* An event _TemperatureTooHigh_.
* Method _IncreaseTemperature(int amount)_ that raises the event if _Temperature > 250_.
* A _BBQApp_ class subscribing to this event and printing a warning.

### **Test:**
* Create a grill.
* Subscribe with the app.
* Increase temp. several times.

### **Conclusion:**
#### 🌿 OOP fundamentals (4/4)
* **Classes:** Grill, BBQApp, WARNING (clear roles)
* Constructor initialization and getters/setters ✅
* Encapsulation and method calls between classes ✅

#### 🧩 Error Handling (Exceptions) (2/2)
* Custom exception (WARNING) for grill overheating
* try–catch structure demonstrates checked exception handling perfectly

#### 🧪 Flow Control (2/2)
* Logical temperature checks, consistent method calls. 

#### ✨ Event-like concept (1/2)
* It uses try/catch instead of actual event-delegate pattern.
* Added!

**Final grade:** 🏅 9 / 10
Solid implementation, very readable and well-structured.
Prepared for the next challenge (NuclearPowerPlant).

## ⚛️ Wednesday – NuclearPowerPlant (Interfaces & Polymorphism)
**Goal:** Practice interfaces, polymorphism, and abstraction.
⏱️ **Estimated time:** 25 minutes

**Tasks:**
* Define interface _IReactor_ with _Start()_, _Shutdown()_, and _GetStatus()_.

**Methods:**
* Implement two reactors, _FusionReactor_ and _FissionReactor_.
  Each reactors should implement the interface with unique console messages.
  FusionReactor: _“Fusion reactor humming steadily.”_
  FissionReactor: _“Fission reactor stable under control rods.”_

**Test:**
* Store both in a List<IReactor>.
* Iterate through them.
* Call their methods.

## 🌾 Thursday – Cross-System Integration (Composition & Error Handling)
**Goal:** Combine systems and test composition + exception handling.
⏱️ **Estimated time:** 30 minutes

**Tasks:**
Simulate a connection between systems:
* _VegetableGarden_ provides biofuel. 
* _SmartBBQ_ consumes it for cooking. 
* _NuclearPowerPlant_ monitors safety.

**Methods:**
Create a small manager class _EcoSystemManager_ that:
* Holds references to each subsystem.
* Runs a method _SimulateDay()_ that tries to transfer resources.
* If resources are insufficient, throws a custom _FuelException_.

**Test:**
* Simulate the day.

## 🌍 Friday – Final Exam Simulation (All-in-One Integration)
**Goal:** Full OOP system integration — event handling, interfaces, error catching, and simple file I/O.
⏱️ **Estimated time:** 30 minutes

**Tasks:** You’re the Maplewick Facility Manager.

**Methods:**
A single run sequence _SimulateDay()_ that:
* Water plants,
* Harvests if ready,
* Generates fuel,
* Powers BBQ,
* Monitors reactor.

**Test:**
* Run one SimulateDay().