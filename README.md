# Fuel Calculator

A console-based Java application that calculates estimated trip fuel costs based on distance, vehicle consumption rates, and real-time fuel types (petrol or diesel).

## 📋 Project Overview
This project transitions a procedural script into a clean, Object-Oriented Programming (OOP) architecture. It simulates a modular system where trip logic, price fetching, and user interaction are handled by dedicated classes.

---

## 🏗️ OOP Architecture & Classes
The application is structured around a 3-tier modular design:

- **`Main`**: 
  - Acts as the entry point and coordinator.
  - Initialises instances of other classes.
  - Displays greetings, handles user input collection, and outputs the final calculations.
- **`Trip`**: 
  - Encapsulates individual trip data (distance, consumption rate, fuel type).
  - Manages its own cost calculation based on provided fuel rates.
- **`FuelService`**: 
  - Acts as a mock API to fetch current baseline prices for petrol and diesel.

---

## ✨ Features
- **Dynamic Fuel Selection**: Supports calculations for both petrol and diesel.
- **Consumption-Based Math**: Computes total fuel required based on litres per 100km and total distance.
- **Object-Oriented Design**: Clean separation of concerns between user interface data, trip math, and price services.
- **Input Validation**: Gracefully handles unknown fuel types and invalid inputs using exception handling.

---

## 🛠️ Technologies Used
- Java Programming Language
- Object-Oriented Programming (OOP) Principles
- Exception Handling (`try-catch`)
- Command Line / Terminal Interface

---

## 💡 Developer Idea: Reusable Dynamic Greeting Class
*An exploration into reusable code modules across projects:*

Is there a way to create a reusable bit of code for greetings as a class that can be called in any project? 


---

# 👩🏾‍💻 Developer
**Student Developer**  
**Academic Project**  
**Course:** BSc IT - Software Engineering  
**Module:** Just for vibes

---
