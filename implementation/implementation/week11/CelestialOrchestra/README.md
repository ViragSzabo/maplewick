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
| Criterion                                 | Max    | You |
| ----------------------------------------- | ------ | --- |
| OOP Structure (abstraction, polymorphism) | 4      |     |
| Interfaces & Enums usage                  | 2      |     |
| Encapsulation & data handling             | 2      |     |
| Exception logic & flow control            | 2      |     |
| **Total**                                 | **10** |     |
