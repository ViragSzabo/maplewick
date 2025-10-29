# 🎼 The Celestial Resonance

**Theme:** The universe is alive. 
When one celestial body performs, 
its tone ripples across the orchestra, 
subtly changing others’ energy or behavior. 
Some react harmoniously, others rebelliously.

## 🌠 Concept Focus (Advanced Exam Level
This night deepens the first project with design patterns & interactions:
| Concept                             | Description                                                              |
| ----------------------------------- | ------------------------------------------------------------------------ |
| **Observer Pattern**                | Celestial bodies “listen” to others’ performances and react dynamically. |
| **Enums (expanded)**                | Each `Tone` now influences behavior.                                     |
| **Interfaces (Reactive, Resonant)** | Define how bodies respond to others.                                     |
| **Polymorphic Behavior**            | Responses differ per type (Moon calms, Comet excites, Star amplifies).   |
| **Encapsulation + Abstraction**     | Keep internal energy rules isolated.                                     |
| **Checked Exception Refinement**    | New exception: `ResonanceDisruptionException`.                           |

## 🌠 Task
[X]**Resonant (interface):** Each celestial body will implement how it reacts to others’ performances.
[X]**Tone (expanded):** Each tone now emits a different energy pulse.
[X]**ResonanceDistruption (Exception):** Add a new exception for resonance distruption.
[X] **CelestialBody (expanded):** Implement Resonant interface according to the source body throwing its exception.
[X] **New Override method:** Update each celestial body with the new method.
[X] **orchestraResonance (method):** Add new method to the conductor to make sure target and source is not the same when reacting to each other.
[X] **ResonanceNight:** Add to the simulation the new method.

# 📊 Grading Rubric
| Criterion                     | Max    | You | Comments                                                                                                                                                        |
|-------------------------------|--------|-----|-----------------------------------------------------------------------------------------------------------------------------------------------------------------|
| OOP Structure & Design        | 6      | 6   | Real understanding of encapsulation & abstraction. Confident use of interfaces and enums. Great naming conventions (Conductor, CelestialBody, Resonance, etc.). |
| Clarity, Testing & Cohesion   | 2      | 1.8 | Strong cohesion, loose coupling, and creative world-building.                                                                                                   |
| Exception Handling            | 2      | 2   | -                                                                                                                                                               |
| **Total**                     | **10** | 9.5 | 🏅 Exam Excellence Level. You’ve built something that would easily impress in an advanced OOP Java exam — imaginative yet fully technical.                                                                                                                                      |

## 🧩 1. OOP Structure & Design
✅ Abstract class: CelestialBody is perfectly designed — encapsulated attributes, abstract perform(), and clear getter/setter structure.
✅ Interface: Resonant cleanly decouples reaction logic.
✅ Polymorphism: Each subclass overrides reactTo() with distinct behavior — that’s real polymorphism in motion.
✅ Enums: Tone adds well-defined behavior (resonancePower), with methods and constructor.
✅ Relationships: The Conductor orchestrates interaction, enforcing object composition.
💡 Bonus: The Conductor’s nested loop simulates dynamic system interaction — that’s advanced composition, often beyond typical exam expectations.

## ⚙️ 2. Exception Handling
✅ Custom exceptions:OverchargeException for energy overload.
* ResonanceDistributionException for chaotic resonance.
* ✅ Properly thrown and caught:
* The system prints error messages but continues operation.
* ✅ The try/catch layering is well placed in both the manager (Conductor) and main().
💡 Micro suggestion: For an even stronger impression, log exception context (which source caused it) before printing.

## 🧠 3. Clarity, Readability & Test Design
✅ Your test orchestrateResonance() is concise and clear — validates behavior and exception propagation.
✅ Print messages in reactTo() make debugging and simulation output intuitive.
💡 Suggestion: You could add a test that asserts energy changes or exceptions being thrown (assertThrows) for full points.