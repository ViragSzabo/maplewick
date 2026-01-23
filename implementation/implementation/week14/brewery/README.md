# 🧙‍♂️ Case: The Magical Potion Brewery

**Context:** The "Gilded Cauldron" is a high-tech potion factory. 
They need a system to manage their brewing vats.
**Goal:** The system must control temperature, handle ingredient mixing orders (Enums), 
and prevent dangerous explosions.

---

## 1. ⚗️ The Brewing System
### 1.1. Core Structure
#### 1.1.1.  Ingredient
**Values:** TOADSTOOL, DRAGON_SCALE, FAIRY_DUST, WATER

#### 1.1.2. Vat
* **Properties:** id (String), currentTemperature (double), contents (List of Ingredients)
* **Constructor:** Requires ID. Temperature starts at 20.0 (Room Temp). Contents is empty
* **Methods:** addIngredient(Ingredient i), heatUp(), brew()

### 1.2. Vat Types & Rules
| Vat Type    | Max Temp | Heating Logic          | Explosion Risk          | Brewing Rule (brew)                                        |
|:------------|:---------|:-----------------------|:------------------------|:-----------------------------------------------------------|
| **Copper**  | 100°C    | Increases temp by 10°C | If temp > 100, explode! | Must have exactly 3 ingredients. Returns "Simple Potion".  | 
| **Iron**    | 500°C    | Increases temp by 50°C | If temp > 500, explode! | Must contain DRAGON_SCALE. Returns "Strong Potion".        |
| **Crystal** | 80°C     | Increases temp by 5°C  | If temp > 80, explode!  | Cannot contain TOADSTOOL (impure!). Returns "Pure Elixir". |

---

## 2. 📝 Assignments
### 2.1. Assignment 1: Structure & Enums
1. [X] Create the Enum Ingredient.
2. [X] Create the Abstract Class Vat with the List<Ingredient>.
3. [X] Implement the three subclasses (CopperVat, IronVat, CrystalVat).

### 2.2. Assignment 2: Logic & Exceptions
1. [X] Create a custom exception: VatExplosionException.
2. [X] Implement heatUp() in each subclass:
    - [X] **Step 1:** Calculate the new temperature.
    - [X] **Step 2:** Check if it exceeds Max Temp.
    - [X] **Step 3:** If yes, throw VatExplosionException ("BOOM!").
    - [X] **Step 4:** If no, update currentTemperature.

### 2.3. Assignment 3: Brewing Logic
1. [X] Create a custom exception: BrewingFailedException.
2. [X] Implement brew() in each subclass:
    - [X] Copper Vat: If contents size != 3 -> Throw Exception.
    - [X] Iron Vat: If contents does not contain DRAGON_SCALE -> Throw Exception.
    - [X] Crystal Vat: If contents contains TOADSTOOL -> Throw Exception.
    - [X
    - ] Success: Reset contents to empty (potion bottled), keep temperature, print result.

### 2.4. Assignment 4: The Sanctuary Manager
1. [X] Create an Interface Monitorable with method double getDangerLevel().
    - [X] Copper: currentTemp / 100
    - [X] Iron: currentTemp / 500
    - [X] Crystal: currentTemp / 80
2. [X] Implement this interface in all Vats.
3. [X] Create a Factory class with a List<Vat>.
4. [x] method checkSafety(): Iterate through all vats. 
If getDangerLevel() > 0.9 (90%), print "WARNING: Vat [ID] Critical!".