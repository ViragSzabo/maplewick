# 🧙🌌 Case: The Galactic Fleet Command

**Context:** You are the lead engineer for the "Terran Defence Force".
You need to build a system to manage the diverse fleet of starships protecting the sector.
**Goal:** The system must manage ship status, fuel consumption, weapon systems, and cargo manifests.

---

## 1. 🚀 The Fleet
### 1.1. Core Structure
**Enum MissionType:** PATROL, BATTLE, TRANSPORT, EXPLORATION.
**Enum Cargo:** FOOD, MEDICAL_SUPPLIES, WEAPONS, ALIEN_ARTIFACTS (Illegal!)

### 1.2. Starship
* **Properties:** callSign (String), fuelLevel (double, 0-100), shieldStrength (int, 0-100)
* **Constructor:** Requires Call Sign. Fuel starts at 100. Shields start at 100
* **Methods:** performMission(MissionType mission)

### 1.3. Interfaces
#### 1.3.1. WarpCapable
* **Methods:** void warpJump(int lightYears)
* **Rule:** Consumes 5% fuel per light year. If not enough fuel, throw InsufficientFuelException.

### 1.4. Ship Types
| Ship Class    | Unique Properties      | Warp Capable? | Special Behavior (performMission)                                                                         |
|:--------------|:-----------------------|:--------------|:----------------------------------------------------------------------------------------------------------|
| **Fighter**   | torpedoCount (int)     | ❌ No          | Mission: Must be BATTLE. Logic: Fires 1 torpedo. If torpedoCount == 0, throw Exception. Consumes 20 Fuel. | 
| **Explorer**  | scanRange (int)        | ✅ Yes         | Mission: Must be EXPLORATION or PATROL. Logic: Consumes 10 Fuel. Prints "Sector Scanned".                 | 
| **Freighter** | cargoBay (List<Cargo>) | ✅ Yes         | Mission: Must be TRANSPORT. Logic: Delivers goods (See Assignment 3).                                     |

---

## 2. 📝 Assignments
### 2.1. Assignment 1: Structure & Interfaces
1. [X] Create the Enums MissionType and Cargo.
2. [X] Create the Custom Exceptions: InsufficientFuelException and IllegalCargoException.
3. [X] Create the Interface WarpCapable.
4. [X] Implement the Abstract Class Starship and the three subclasses.
_Tip: Only Explorer and Freighter should implement WarpCapable._

### 2.2. Assignment 2: The Fighter Logic (State & Exceptions)
1. [X] Implement performMission for the Fighter.
2. [X] Logic Flow:
   - Check if mission is BATTLE. If not -> Throw IllegalArgumentException.
   - Check if torpedoCount > 0. If not -> Throw IllegalStateException ("Out of ammo!").
   - Check Fuel (Cost: 20). If low -> Throw InsufficientFuelException.
   - Action: Decrease Torpedoes by 1. Decrease Fuel by 20. Print "Fox One deployed!".

### 2.3. Assignment 3: The Freighter Logic (Lists & Enums)
1. [X] Add methods loadCargo(Cargo c) and getCargoBay() to Freighter.
2. [X] Implement performMission for the Freighter.
   - Mission Check: Must be TRANSPORT.
   - The Inspection: If the cargoBay contains ALIEN_ARTIFACTS -> Throw IllegalCargoException ("Contraband detected!").
   - Fuel Check: Consumes 30 Fuel.
   - Success: clear() the cargo bay (delivery complete) and update fuel.

### 2.4. Assignment 4: Fleet Management
1. [X] Create a Fleet class with a List<Starship>.
2. [X] Method deployFleet(MissionType mission):
   - Loops through all ships.
   - Tries to call performMission(mission).
   - Exception Handling: Wrap the call in a try-catch block inside the loop.

### 2.5. Assignment 5: Quality Assurance (Unit Testing)
1. [X] Create a Test Class FighterTest.
2. [X] Use @BeforeEach to initialize a Fighter (e.g., "Red Leader") before every test.
3. [X] Test 1: Success Scenario:
   - Call performMission(MissionType.BATTLE).
   - Assert that fuelLevel decreased by 20.
   - Assert that torpedoCount decreased by 1.
4. [X] Test 2: Wrong Mission Failure:
   - Call performMission(MissionType.EXPLORATION).
   - Assert that it throws IllegalArgumentException.
5. [X] Test 3: Ammo Failure:
   - Setup: Create a loop to fire all torpedoes (or use a setter if you made one) until count is 0.
   - Act: Call performMission(MissionType.BATTLE) one more time.
   - Assert: Verify it throws IllegalStateException.