# 📦 "Sky-High" Delivery Service Control System

> **Project:** Autonomous Drone Fleet Control Software  
> **Client:** Sky-High Logistics  
> **Deadline:** 3 Hours (Holiday Rush!)

## 📖 Overview
This project implements the control logic for an autonomous drone delivery fleet. The system manages drone dispatching, maintenance tracking, and fleet statistics. It includes specific physics simulations for different drone models, robust safety checks to prevent crashes, and a central dashboard for system health monitoring.

## 🏗 System Architecture

The software simulates a complete logistics hub using Object-Oriented Programming (OOP). The core components are:

### 1. Drone Port (`DronePort`)
Manages the fleet of **Delivery Drones**.
* **Function:** Dispatches drones using the `performDelivery` method.
* **Mechanism:** Tracks battery levels (starts at 100%) and selects drones for missions.

### 2. Maintenance Depot (`MaintenanceDepot`)
Services drone motors after every flight based on reported wear and tear.
* **Cost Calculation:** `Wear and Tear (%) × 15.0` = Service Cost (€).
* **Tracking:** Maintains the **Total Service Cost** accumulated over time.

### 3. Statistics Server (`StatisticsServer`)
Logs the flight data for the entire fleet.
* **Tracking:** Maintains the **Total Fleet Distance** (km).
* **Update:** Increases by the distance flown in every delivery.

---

## 🚁 Drone Specifications & Physics

The system supports two specialized drone types with unique physics and battery consumption logic.

| Drone Type    | Battery Consumption                                                                                                                       | Flight Physics (Distance & Wear)                                                                                                                                   |
|:--------------|:------------------------------------------------------------------------------------------------------------------------------------------|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| **SPEEDSTER** | **Standard:**<br>Decreases by **1.5%** per minute.                                                                                        | **Light Load (< 5kg):**<br>• Distance: `Time × 1.2`<br>• Wear: `Weight × 0.5`<br><br>**Heavy Load (≥ 5kg):**<br>• Distance: `Time × 0.8`<br>• Wear: `Weight × 2.0` |
| **HEAVYLIFT** | **Short Flight (< 10 mins):**<br>Flat **1.0%** total consumption.<br><br>**Long Flight (≥ 10 mins):**<br>`(0.05 × Weight × Time) + 0.2` % | **Standard Physics:**<br>• Distance: `Time × 0.5`<br>• Wear: `(Weight × Time) / 100`                                                                               |

> **Note:** $x^2$ operations should use `Math.pow(x, 2)` or `x * x`.

---

## ⚠️ Safety Protocols (`CrashException`)

To prevent accidents, the system must throw a `CrashException` if the following critical limits are exceeded during a delivery:

| Drone Type    | Crash Trigger Conditions                                                 |
|:--------------|:-------------------------------------------------------------------------|
| **Speedster** | • Package Weight > **10 kg** (Overload)<br>• Battery drops below **10%** |
| **HeavyLift** | • Flight Time > **60 min** **AND** Package Weight > **20 kg**            |

---

## 📊 Dashboard & Monitoring

The system includes a **Dashboard** that monitors all components via a `checkStatus()` method. Components return a status color (`GREEN`, `ORANGE`, `RED`).

| Component             | 🟠 ORANGE Condition                   | 🔴 RED Condition                      |
|:----------------------|:--------------------------------------|:--------------------------------------|
| **Drone Port**        | If **any** drone has < 20% battery.   | —                                     |
| **Maintenance Depot** | Total Cost between **€1000 - €2000**. | Total Cost > **€2000**.               |
| **Statistics Server** | —                                     | Total Fleet Distance > **10,000 km**. |

> **System Health:** The Dashboard's `isSystemHealthy()` method returns `false` if **any** component is not `GREEN`.

---

## ✅ Implementation Guide

### Assignment 1: Core Logic
* Implement the class structure using **Inheritance** (Abstract Drone class) and **Composition** (Delivery Service containing Port, Depot, Server).
* Implement the math formulas from the table above.

### Assignment 2: Exception Handling
* Create the custom `CrashException`.
* Implement the guard checks inside the `deliverPackage` methods.

### Assignment 3: The Dashboard Interface
* Create a `Status` enum (`GREEN`, `ORANGE`, `RED`).
* Create a `Monitorable` interface with the `checkStatus()` method.
* Implement the monitoring logic in all components.

### Assignment 4: Unit Testing
* Create a JUnit test for **HeavyLift**.
* **Test Case 1:** Verify battery decreases by exactly **1.0%** when flying for 9 minutes.
* **Test Case 2:** Verify Wear & Tear calculation is accurate based on the formula.