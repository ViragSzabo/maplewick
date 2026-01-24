# 🏠 Case: The "Domus Aurea" Smart Home
**Context:** You are building the operating system for a luxury smart home.
. The system needs to manage energy consumption, device maintenance, and automated tasks.
**Goal:** Manage different types of smart devices, handle inventory (in the fridge), and prevent system failures.

---

## 1. 🔌 The Device Ecosystem
### 1.1. Core Structure
#### 1.1.1. PowerMode
* **Values:** ECO, NORMAL, PERFORMANCE.

#### 1.1.2. SmartDevice
* **Properties:** name (String), isOn (boolean), powerCost (double).
* **Constructor:** Requires Name and PowerCost. (isOn defaults to false)
* **Methods:** performTask()
* **Setter Rules:** name cannot be null. powerCost cannot be negative.

### 1.1.2.1. Device Types
| Device Class    | Unique Properties         | Implements | Special Behavior (performTask)                                                                                                                                            |
|:----------------|:--------------------------|:-----------|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **SmartLight**  | brightness (int, 0-100)   | ❌ No       | Logic: If !isOn, throw DeviceOffException. Action: Print "Lighting up room at [brightness]%".                                                                             | 
| **RobotVacuum** | batteryLevel (int, 0-100) | ✅ Yes      | Logic: Requires 15% battery. Check: If battery < 15 -> Throw LowBatteryException. Action: Reduce battery by 15. Print "Cleaning floors...".                               | 
| **SmartFridge** | contents (List<String>)   | ❌ No       | Logic: Tries to make a "Snack". Check: If list does not contain "Sandwich" -> Throw ItemNotFoundException.  Action: Remove "Sandwich" from list. Print "Snack prepared!". |

#### 1.1.3. Interfaces
##### 1.1.3.1. Rechargeable
* **Methods:** void charge(int percentage) & int getBatteryLevel()

---

## 2. 📝 Assignments
### 2.1. Assignment 1: Structure & Interfaces
1. [] Create the Enum PowerMode.
2. [] Create the Custom Exceptions: DeviceOffException, LowBatteryException, ItemNotFoundException.
3. [] Create the Interface Rechargeable.
4. [] Implement the Abstract Class SmartDevice.

### 2.2. Assignment 2: The Logic Implementation
1. [] Implement SmartLight: Simple check for isOn.
2. [] Implement RobotVacuum:
   - Trap Alert: Remember the "Check -> Act" flow for the battery!
   - Implement the Rechargeable interface methods.
3. [] Implement SmartFridge:
   - Trap Alert: Remember the "Upside Down" logic bug.
   - Check if the item exists first & remove it second.

### 2.3. Assignment 3: The Central Hub (The Loop)
1. [] Create a class HomeHub with a List<SmartDevice>.
2. [] Implement activateRoutine():
    - Loop through all devices.
    - Turn them on (isOn = true - you might need a setter or method for this).
    - Try to call performTask().
    - Exception Handling: Catch ALL device exceptions (DeviceOff, LowBattery, ItemNotFound) inside the loop.
    - Print the error ("Device [Name] failed: [Message]") and continue to the next device.

### 2.4. Assignment 4: Unit Testing (Quality Control)
1. [] Create SmartFridgeTest.
2. [] Test 1: performTask_WithSandwich_Success
    - Add "Sandwich" to the list.
    - Call performTask.
    - Assert list is empty (or size is 0).
3. [] Test 2: performTask_NoSandwich_ThrowsException
   - Empty list.
   - Assert ItemNotFoundException is thrown.