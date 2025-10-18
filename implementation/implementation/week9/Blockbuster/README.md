# Maplewick Blockbuster

## Theme
You’re managing the Maplewick Blockbuster, a cozy yet vibrant movie rental store.
The goal is to simulate running a real-world Blockbuster: adding movies, 
managing members and employees, handling rentals, and creating a community hub 
for film lovers.

Think of it as a small cinematic universe — your system handles everything 
behind the scenes, like a real Blockbuster, but in code! 🎬

## Features

### 1. Movies 🎥
* Add, remove, and display movies.
* Movies have titles, genres, descriptions, and rental prices.
* Each movie can play a “trailer” in the console.

### 2. Members & Membership 🏷️
* Members can have different membership types: BASIC, PREMIUM, VIP.
* Memberships provide perks and discounts.
* Members can rent movies, view their rental history, and track returns.

### 3. Rentals 💿
* Members can rent movies, with automatic tracking of rental date and return status.
* Late fees are applied for overdue rentals.
* Rentals can display details including member info, movie info, and current price.

### 4. Employees 👩‍💼
* Employees are modeled as abstract: allows for Manager, Intern, or Volunteer roles.
* Employees have salaries, contact info, and a list of favorite movies.
* Managers like Timmy can oversee the store and motivate staff.
* Interns and volunteers can help manage the store while learning or contributing for free.

### 5. Management System 🏪
* Central Management class handles movies, members, employees, and rentals.
* Ensures that a movie cannot be rented by two members at the same time.
* Applies membership discounts automatically.

## Characters 🌟
**Timmy** – Manager, loyal to the Blockbuster, cares about the community.
**Eliza** – Former Harvard graduate, close friend of Timmy. Motivates him to keep the store running.
**Connie** – In her prime days, lives for her job and her dramas.
**Carlos** – Coming from an immigrant family, dreams of being a movie director one day.
**Hannah** – Her father went through a lot losing her mother. Lives on edge, saving carefully day by day.

## Getting Started 🚀
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/maplewick-blockbuster.git
   ```
2. Build and run:
   ```bash
   javac -d bin src/implementation/week9/Blockbuster/*.java
   java -cp bin implementation.week9.Blockbuster.Blockbuster
   ```
3. Watch the store come alive in your console! 🎬

## Future Ideas ✨
* Add a graphic interface for rental flows.
* Implement seasonal events or movie nights.
* Extend employee roles and interactions (e.g., interns learning from Timmy, volunteers helping at premieres).
* Track VIP perks and special discounts in detail.
* Add story-driven scenarios using your staff characters.