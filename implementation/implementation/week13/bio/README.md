# 🏭 Bio-Refinery Control System

> **Project:** Experimental Bio-Refinery Control Software  
> **Location:** Eemshaven, Groningen  
> **Client:** Province of Groningen  
> **Status:** Production Ready (3-hour Deadline Met)

## 📖 Overview
This project implements the control software for a new experimental Bio-Refinery. 
The system simulates and manages the biological and chemical processes of fermentation, distillation, and waste filtration. 
It includes strict safety monitoring protocols and robust error handling for contamination events.

## 🏗 System Architecture

The software models the physical refinery using Object-Oriented Programming (OOP) principles. The main components are:

### 1. Fermentation Tank (`FermentationTank`)
The heart of the refinery. It contains one or more **Bacterial Cultures** that process sugar into raw materials.
* **Input:** Sugar (g), Time (s)
* **Output:** Toxic Waste (mg), Raw Ethanol (ml)
* **Mechanism:** Vitality tracking (starts at 100%).

### 2. Distiller (`Distiller`)
Converts the raw output from the tank into usable fuel.
* **Conversion Rate:** `Raw Ethanol × 0.0009` = Pure Fuel (Liters)
* **Tracking:** Maintains a cumulative total of fuel produced.

### 3. Waste Filter (`WasteFilter`)
Manages the hazardous byproducts.
* **Mechanism:** Absorbs Toxic Waste.
* **Clogging:** Clogging level increases by `Toxic Waste × 0.02`. Starts at 0%.

---

## 🧪 Bacterial Cultures & Logic

The system supports polymorphic bacterial cultures with distinct behaviors.

| Culture Type | Vitality Decay Logic | Production Logic (Ethanol & Waste) |
| :--- | :--- | :--- |
| **TurboYeast** | **-0.05%** per second. | **High Input (>100g Sugar):**<br>• Ethanol: `Sugar × Time × 0.5`<br>• Waste: `Time × 4`<br><br>**Low Input (≤100g Sugar):**<br>• Ethanol: `Sugar × √Time`<br>• Waste: `Time / 2` |
| **SuperBacteria** | **Formula:**<br>`0.0002 × Sugar × Time + 0.001`%<br><br>*(Does not decrease if Sugar < 50g)* | **Standard Production:**<br>• Ethanol: `25 × Sugar`<br>• Waste: `(Sugar × Time) / 5` |

---

## ⚠️ Safety Protocols

Due to the volatile nature of bio-chemistry, the system implements strict safety checks
using `ContaminationException` and a central monitoring system.

### 1. Contamination Events (`ContaminationException`)
The process halts immediately if critical limits are breached:

* **TurboYeast:**
    * Time > 80s **AND** Sugar > 500g.
    * Vitality drops below **5%**.
* **SuperBacteria:**
    * Sugar input exceeds **1000g**.

### 2. Central Monitor (`Monitorable`)
All components implement the `checkSystem()` method returning one of three statuses: `OK`, `CHECK`, or `DANGER`.

| Component | 🟡 CHECK Condition | 🔴 DANGER Condition |
| :--- | :--- | :--- |
| **Fermentation Tank** | Vitality ≤ 15% in *any* culture. | — |
| **Waste Filter** | Clogging between 60% - 80%. | Clogging > 80%. |
| **Distiller** | — | Total Production > 5000 Liters. |

> **System Safety:** The `CentralMonitor` reports the entire refinery as unsafe if **any** single component is not `OK`.

---

## ✅ Implemented Assignments

1.  **Core Implementation:** Built the `BioRefinery`, `FermentationTank`, `Distiller`, and `WasteFilter` classes using Composition and Inheritance.
2.  **Exception Handling:** Implemented `ContaminationException` with specific trigger logic for each bacteria type.
3.  **Monitoring System:** Created the `Monitorable` interface, `Status` enum, and the `CentralMonitor` to aggregate system health.
4.  **Quality Assurance:** Comprehensive Unit Tests for **SuperBacteria** using JUnit 5, verifying vitality logic and production calculations.