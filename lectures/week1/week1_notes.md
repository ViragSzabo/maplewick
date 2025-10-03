[⬅️ Back to Repository](../../README.md)

# 📘 Week 1 Notes – Use Case Diagrams & Inheritance

## 🎯 Learning Goals
- Understand what a Use Case Diagram is and why it’s useful.
- Be able to draw a Use Case Diagram for a given system.
- Understand and apply Inheritance and Abstract Classes in Java.

---

## 📝 Use Case Diagrams
### Why use them?
- Show different users (actors) in the system.
- Identify use cases = actions the system supports.
- Define system boundaries (what belongs to the system, what doesn’t).

### Components
- **Actor** → external entity interacting with the system (user, admin, external system).
- **Use Case** → functionality/process of the application.
- **Include** → one use case always uses another.
- **Extend** → one use case optionally uses another.

### Example
- [Hospital I Use Case Diagram](implementation/implementation/week1/Hospital/Diagram/UseCaseDiagram.png)

---

## 📝 Inheritance
### What is it?
Mechanism where a subclass inherits fields and methods from a superclass.

### Benefits
- **Code reuse** (no need to duplicate logic).
- **Hierarchy** → organise classes logically.
- **Polymorphism** → treat subclass objects as superclass references.

### Example
```java
class Vehicle {
    String make;
    String model;
    public void drive() {}
}

class Car extends Vehicle {
    int doors;
    public void honk() {}
}
```

---

## 📝 Abstract Classes
- Cannot be instantiated directly.
- Can contain abstract methods (without a body).
- Subclasses must implement abstract methods.

```java
abstract class Vehicle {
    String make;
    String model;
    public abstract void drive();
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Car drives...");
    }
}
```

---

## 💡 Key Takeaways
- **Use Case Diagrams** = what the system should do + who interacts with it.
- **Inheritance** = is-a relationship (Car is a Vehicle).
- **Abstract classes** = blueprint classes with mandatory methods for subclasses.

---

## 📂 Related Files
- [Week 1 Assignments](implementation/implementation/week1)
- [Lecture Slides (Week 1)](lectures/week1)  
