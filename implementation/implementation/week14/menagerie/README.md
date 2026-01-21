# 🦁 Case: The Magical Menagerie

**Context:** The "Arcane Sanctuary" preserves magical creatures from extinction.
They need a system to manage the feeding, care, and display of these legendary beasts.
**Goal:** The system must track creature energy levels, handle specific dietary needs (using Enums), 
and manage their interactions with visitors.

---

## 1. 🔮 The Creatures
### 1.1. Core Structure
#### 1.1.1. Enum Diet
**Values:** CARNIVORE, HERBIVORE, OMNIVORE, MAGIC_EATER.

#### 1.1.2. Abstract Class Creature: 
  * **Properties:** name (String), energyLevel (int, 0-100), diet (Diet Enum).
  * **Constructor:** Requires Name and Diet. Energy defaults to 50.

### 1.2. Interfaces
#### 1.2.1. Interface Visible
* **Method:** String interactWithVisitors().
* **Explanation:** Creatures in the public exhibit must implement this.

#### 1.2.2. Creature Types
| Creature Type | Diet (Enum) | Unique Properties  | Specific Behaviour                                                                                                       | Visitor Interaction (Visible)                       |
|:--------------|:------------|:-------------------|:-------------------------------------------------------------------------------------------------------------------------|:----------------------------------------------------|
| **Dragon**    | CARNIVORE   | firePower (int)    | breathFire(): Consumes 20 energy.                                                                                        | Visitor Interaction (Visible)                       |
| **Unicorn**   | HERBIVORE   | isPure (boolean)   | purifyWater(): Consumes 5 energy.                                                                                        | Returns: "The Unicorn bows politely."               |
| **Phoenix**   | MAGIC_EATER | rebirthCount (int) | ignite(): Consumes 100 energy (Must be full!). Instantly sets energy to 0, then back to 50, and increments rebirthCount. | Returns: "The Phoenix flashes with blinding light." |

---

## 2. 📝 Assignments
### 2.1. Assignment 1: Structure & Enums
1. [X] Create the Enum Diet with the specified values.
2. [X] Create the Abstract Class Creature.
3. [X] Create the Interface Visible.
4. [X] Implement the three subclasses (Dragon, Unicorn, Phoenix).
_Note: All creatures implement Visible._

### 2.2. Assignment 2: Logic & Exceptions
1. [X] Create a custom exception: CreatureExhaustedException.
2. [X] Implement a method performMagic() in the Abstract Class.
    - It is abstract.
    - Each subclass implements it by calling their specific behavior (e.g., Dragon calls breathFire, Phoenix calls ignite).
    - **Rule:** If energy < cost, throw CreatureExhaustedException.
    - **Success:** Subtract energy and print the action.

### 2.3. Assignment 3: Feeding System (Enums in Action)
1. [X] Add a method eat(Diet foodType) to the Creature class.
2. [X] **Logic:**
    - If the foodType matches the creature's diet: Energy +20 (Max 100).
    - If the foodType is wrong (e.g., Dragon eating Salad): Throw an IllegalArgumentException ("Yuck!").
    - Special Rule: OMNIVORE can eat CARNIVORE or HERBIVORE food.

### 2.4. Assignment 4: The Sanctuary Manager
1. [] Create a Sanctuary class with a List<Creature>.
2. [ ] **Report:** Create a method openToPublic():
   - Iterates through the list.
   - If the creature implements Visible, call interactWithVisitors() and print the result.
   - If the creature does not implement Visible, print "[Restricted Area]".
3. [] **Unit Test:** Create a test for the Phoenix.
   - Test the ignite() method logic.
   - Verify that it fails if energy is 99.
   - Verify that rebirthCount increases after a successful ignite.

--- 

## 3. 💡 Key Formulas Cheat Sheet
* **Dragon Energy Cost:** 20
* **Unicorn Energy Cost:** 5
* **Phoenix Energy Cost:** 100 (Must be full)
* **Feeding:** Wrong Enum = Exception. Correct Enum = +20 Energy.