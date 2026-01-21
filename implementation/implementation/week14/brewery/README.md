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
1. [ ] Create the Enum Ingredient.
2. [ ] Create the Abstract Class Vat with the List<Ingredient>.
3. [ ] Implement the three subclasses (CopperVat, IronVat, CrystalVat).

### 2.2. Assignment 2: Logic & Exceptions
1. [ ] Create a custom exception: VatExplosionException.
2. [ ] Implement heatUp() in each subclass:
    - [ ] **Step 1:** Calculate the new temperature.
    - [ ] **Step 2:** Check if it exceeds Max Temp.
    - [ ] **Step 3:** If yes, throw VatExplosionException ("BOOM!").
    - [ ] **Step 4:** If no, update currentTemperature.

### 2.3. Assignment 3: Brewing Logic
1. [ ] Create a custom exception: BrewingFailedException.
2. [ ] Implement brew() in each subclass:
    - [ ] Copper Vat: If contents size != 3 -> Throw Exception.
    - [ ] Iron Vat: If contents does not contain DRAGON_SCALE -> Throw Exception.
    - [ ] Crystal Vat: If contents contains TOADSTOOL -> Throw Exception.
    - [ ] Success: Reset contents to empty (potion bottled), keep temperature, print result.

### 2.4. Assignment 4: The Sanctuary Manager
1. [ ] Create an Interface Monitorable with method double getDangerLevel().
    - [ ] Copper: currentTemp / 100
    - [ ] Iron: currentTemp / 500
    - [ ] Crystal: currentTemp / 80
2. [ ] Implement this interface in all Vats.
3. [ ] Create a Factory class with a List<Vat>.
4. [ ] method checkSafety(): Iterate through all vats. 
If getDangerLevel() > 0.9 (90%), print "WARNING: Vat [ID] Critical!".

--- 

## 3. 💡 Key Formulas Cheat Sheet
* **Dragon Energy Cost:** 20
* **Unicorn Energy Cost:** 5
* **Phoenix Energy Cost:** 100 (Must be full)
* **Feeding:** Wrong Enum = Exception. Correct Enum = +20 Energy.