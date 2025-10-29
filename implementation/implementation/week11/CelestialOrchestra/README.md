# 🌌 The Celestial Orchestra

**Theme:** A cosmic ensemble where stars, moons, 
and comets each play their own melody 
in the grand orchestra of the universe.
Every celestial body follows the rhythm of the cosmos 
— but some shine too bright, and others may go silent.

## 🪐 Concepts Practiced
| Concept                | How it’s Tested                                                                                    |
| ---------------------- | -------------------------------------------------------------------------------------------------- |
| **Abstraction**        | `CelestialBody` is abstract, defines `perform()`.                                                  |
| **Polymorphism**       | Different celestial bodies (`Star`, `Moon`, `Comet`) stored and called uniformly.                  |
| **Encapsulation**      | Private fields with getters/setters for cosmic energy, tone, etc.                                  |
| **Interfaces**         | `Harmonic` (anything that can tune its sound), `Rebellious` (objects that resist synchronization). |
| **Enums**              | `Tone` (SOFT, BRIGHT, CHAOTIC) defines their musical quality.                                      |
| **Exception Handling** | `OverchargeException` for bodies that burn too bright.                                             |

## 🌠 Task
Simulate a cosmic concert managed by a Conductor class.
Each celestial body performs, and the Conductor ensures harmony.
If a body’s energy exceeds a limit, it throws an OverchargeException.

# 📊 Grading Rubric
| Criterion                     | Max    | You | Comments |
|-------------------------------|--------|-----|-----|
| OOP Structure & Design        | 6      | 6   | Excellent use of abstraction, polymorphism, and encapsulation.|
| Clarity, Testing & Cohesion   | 2      | 2   | Just refine how you handle and report exceptions inside Conductor. |
| Exception Handling            | 2      | 1.5 | Beautiful cohesion, well-tested, poetic touch. |
| **Total**                     | **10** | 9.5 | “A stellar performance — harmonious, elegant, and exam-ready.” |

## 🧩 1. OOP Structure & Design
✅ Abstract class: CelestialBody is perfectly structured — clear attributes, encapsulated energy field, and an abstract perform() method.
✅ Inheritance hierarchy: Concrete classes (Moon, Star, Comet) all override perform() and provide unique implementations — this shows true polymorphism.
✅ Interfaces: You correctly used two (Harmonic, Rebellious) with distinct responsibilities.
✅ Enum usage: Tone adds clarity and aesthetic value to the design, a strong architectural choice.
✅ Encapsulation: energy is private with controlled access via methods.
✅ Relationships: Composition is applied naturally — Conductor manages a List<CelestialBody>.
💡 Bonus touch: You named your methods (tuning, resisting) semantically — fits the poetic “orchestra” world.

## ⚡ 2. Exception Handling
✅ You implemented OverchargeException with a custom message — clear and readable.
✅ Each subclass correctly throws it under a condition.
⚠️ In your Conductor.orchestrate() method, 
you’re rethrowing a new exception rather 
than printing or logging the one from the source 
— this makes it impossible to know which body failed 
or why (and stops the loop early).
System.err.println(b.getName() + " issue: " + e.getMessage());

## 🧪 3. Clarity, Testing, & Cohesion
✅ You created proper JUnit tests — not just checking the logic, but verifying collection handling and orchestration.
✅ Tests are concise and valid.
✅ Your naming is consistent and elegant (fits both academic and professional tone).
✅ The system is easily extendable (add “Nebula” or “Asteroid” tomorrow with minimal refactoring).