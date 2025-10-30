# 🌒 The Clockmaker’s Paradox
**Theme:** A mysterious Clockmaker’s Workshop 
where every clock measures a different kind of time 
— lunar, dream, human, or mechanical.
But the clocks begin desynchronizing, 
and only the master algorithm can recalibrate them.

---

## 🧩 Focus Areas
* **Abstract classes** & inheritance
* **Polymorphism** (different tick behaviors)
* **Interfaces** (Repairable, Synchronizable)
* **Enums** (ClockType, Status)
* **Encapsulation** & exception handling

---

## 🏗️ Task
Design a small system where each clock ticks differently and may break over time.
A ClockManager will try to keep all clocks synchronized.

### Classes & Interfaces
1. Abstract class _Clock_
    - Fields: String name, ClockType type, int health
    - Methods: abstract void tick(), boolean isBroken(), void repair()
    - Implements Repairable
2. Enum _ClockType_
    - Values: LUNAR, DREAM, HUMAN, MECHANICAL
3. Interface _Repairable_
    - Method: void repair()
4. Interface _Synchronizable_
    - Method: void synchronize(Clock other) throws SyncException 
5. Custom Exception _SyncException_
    - Thrown when two clocks cannot synchronize due to large “time drift”.
6. Concrete Classes _LunarClock_, _DreamCLock_, _HumanClock_, _MechanicalClock_
    - Each implements tick() differently — e.g. random drift or unique messages.
    - Optionally override toString() for pretty output.
7. Manager _ClockManager_
    - Holds a List<Clock>
    - Method simulateDay():
      - Each clock ticks.
      - Randomly tries to synchronize some pairs.
      - If synchronization fails → catches SyncException and repairs the weaker clock.

## ✅ Grading Rubric
| Category                     | Max    | You     |                                               |
| ---------------------------- | ------ |---------|-----------------------------------------------|
| OOP Design & Relationships   | 5      | 5       | Clear abstraction hierarchy. Scalable design. |
| Polymorphism & Interface Use | 3      | 3       | Invoking methods through the base class type. |
| Exception Handling & Clarity | 2      | 2       | Acceptable and no deduction needed.           |
| **Total**                    | **10** | **10**  | Structure is clean, indentation consistent, method names meaningful. |

### 🏅 Final Grade: 10 / 10
#### 🌙 Summary
You’re absolutely ready for the OOP2 exam.
You understand inheritance, polymorphism, interfaces, abstraction, enums, and exception handling — and you can express them both clearly and creatively.
The design quality is at a level that can easily earn you a distinction or top 5% score.