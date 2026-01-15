# ✈️ International Airport Management System

## Project Overview
The local airport is upgrading its baggage handling and flight control software. This application manages various types of aircraft (passenger and cargo), calculates fuel efficiency, handles revenue generation, and enforces safety checks via a Control Tower.

## 🏗 System Architecture

### 1. Aircraft (Base Class)
All aircraft share the following properties:
- `callSign` (String)
- `fuelCapacity` (int)
- `currentFuel` (double)

### 2. Aircraft Types
| Type | Unique Properties | Revenue Formula | Fuel Consumption Logic |
| :--- | :--- | :--- | :--- |
| **PassengerPlane** | `maxPassengers`, `bookedSeats`, `ticketPrice` | `bookedSeats * ticketPrice` | 0.5L per km per passenger |
| **CargoPlane** | `maxCargoWeight`, `currentCargoLoad` | `currentCargoLoad * 1.5` | 2.0L per km + 0.1L per kg of cargo |

### 3. Control Tower
A centralized manager (Singleton recommended) that oversees all planes and ensures safe takeoffs.

---

## 📋 Implementation Requirements

### Assignment 1: Core Structure
* Design and implement the classes and inheritance relationships.
* Implement the fields and constructor logic.

### Assignment 2: Safety & Logic
* **Exception Handling:** Create a custom `InsufficientFuelException`.
* **Fly Method:** Implement `fly(int distance)`.
    * Calculate required fuel based on the specific plane's consumption logic.
    * **If fuel is low:** Throw `InsufficientFuelException`.
    * **If fuel is sufficient:** Subtract fuel and print "Flight successful".

### Assignment 3: Maintenance Checks
* **Interface:** Create a `Maintenance` interface with the method `performCheck()`.
* **Implementation:**
    * *PassengerPlane:* Returns true if `bookedSeats <= maxPassengers`.
    * *CargoPlane:* Returns true if `currentCargoLoad <= maxCargoWeight`.

### Assignment 4: Scheduling & Testing
* **FlightSchedule Class:** Holds a list of Aircrafts.
* **Reporting:** Create `printFlightStatus()` to iterate through the list and print the Call Sign + the result of `performCheck()`.
* **Testing:** Create a Unit Test for `CargoPlane` to verify fuel calculation logic under different weight loads.