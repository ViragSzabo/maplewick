# 🏥 Case: The Cybernetic Hospital

**Context:** The year is 2077. You have been hired by St. Turing's Hospital, a fully automated medical facility run by robots. 
They need a Java application to manage their fleet of medical droids.
**Goal:** The system needs to track robot status, battery usage, and revenue generation.

---

## 1. 🤖 The Robotic Fleet
### 1.1. Base Robot Structure
All robots share these common traits:
* **Properties:** serialNumber (String), batteryLevel (double, 0-100), isActive (boolean).
* **Constructor:** Requires serialNumber. 
  * batteryLevel defaults to 100. 
  * isActive defaults to true.

### 1.2. Robot Types & Logic
| Robot Type | Unique Properties | Specific Logic Method |
| :--- | :--- | :--- |
| **SurgeonBot** | precision (0-100) | operate(int difficulty) |
| **NurseBot** | patientCount (int) | doRounds() |
| **TransportBot** | maxWeight, currentLoad | deliver(int distance) |

### 1.3. Shared Behavior (Abstract)
All robots must implement the abstract method performTask().
* **SurgeonBot:** Calls operate(5) (Standard surgery).
* **NurseBot:** Calls doRounds().
* **TransportBot:** Calls deliver(10) (Standard 10km run).

---

## 2. 📝 Assignments
### 2.1. Assignment 1: Structure
1. [X] Design the Robot class (Abstract) and the three subclasses.
2. [X] Implement inheritance, constructors, and Getters/Setters.
3. [X] Validation: Ensure inputs are valid (e.g., Battery must be 0-100).

### 2.2. Assignment 2: Exceptions & Logic
1. [X] Create a custom exception: LowBatteryException.
2. [ ] Update specific methods (operate, doRounds, deliver):
   - Calculate required battery before action. 
   - If battery < required: Throw LowBatteryException.
   - If successful: Subtract battery and print "Task Complete".

### 2.3. Assignment 3: Interfaces
1. [ ] Create interface Diagnostic with method boolean selfCheck().
2. [ ] Implement logic in all robots:
   - SurgeonBot: True if precision > 90.
   - NurseBot: True if patientCount < 5.
   - TransportBot: True if currentLoad == 0.

### 2.4. Assignment 4: Testing & Management
1. [ ] Central Computer: Create a class with a List<Robot>.
- Implement printReport(): Iterates list and prints Serial Number + selfCheck() result.
2. [ ] Unit Test (TransportBot):
- Test the deliver method.
- Verify battery reduction matches the formula: (0.1 * distance) + (0.05 * load).

--- 

## 3. 💡 Key Formulas Cheat Sheet
* **Surgeon Battery:** difficulty * 2
* **Transport Battery:** (0.1 * distance) + (0.05 * load)
* **Transport Revenue:** currentLoad * 0.50