# 🏨 The Grand Hotel Management System

## Project Overview
Due to a tourism boom, The Grand Hotel requires a new, high-performance management system. The system handles room bookings, automated billing based on room types, maintenance tracking, and revenue reporting.

## 🏠 Domain Model

### Room Types
All rooms have a **Room Number**, **Base Price**, and **Cleanliness Score** (starts at 100).

#### 1. Standard Room
* **Logic:** Basic efficiency.
* **Price:** Base Price (+10% if `hasView` is true).
* **Cleanliness Drop:** -20 points per use.

#### 2. Suite
* **Logic:** Luxury living.
* **Price:** Base Price + (Size in m² * 2).
* **Surcharge:** If guests > 2, add €50 per extra person.
* **Cleanliness Drop:** -10 points per use.

#### 3. Penthouse
* **Logic:** The ultimate experience. Includes `jacuzziTemperature`.
* **Price:** Base Price * 3.
* **Cleanliness Drop:** -50 points per use.

---

## 🚀 Tasks & Milestones

### Assignment 1: Object-Oriented Design
* Build the class hierarchy using inheritance.
* Implement `calculateBill(int nights)` for all room types using Polymorphism.

### Assignment 2: Robustness
* **Exception:** Create `RoomDirtyException`.
* **Business Rule:** Implement a `checkIn()` method. If the room's cleanliness score is **below 50**, throw the exception to prevent the booking.

### Assignment 3: Reception Dashboard
Create a `Reception` class that manages the list of rooms.
1.  **Availability:** Implement `getAvailableRooms()`.
    * *Criteria:* Room must not be occupied AND Cleanliness must be >= 50.
2.  **Reporting:** Implement `generateRevenueReport()`.
    * Calculates total potential income if every room in the hotel was booked for 1 night.

### Assignment 4: Quality Assurance (Testing)
* **Suite Test:** Verify that the price calculation correctly handles the guest surcharge logic.
* **Maintenance Test:** Verify that `cleanRoom()` correctly resets the cleanliness score to 100.