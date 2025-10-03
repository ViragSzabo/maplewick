[⬅️ Back to Repository](../../README.md)

# 📘 Week 3 Notes – Sequence Diagrams, Collections, Enums & Static

## 🎯 Learning Goals
- Understand what a Sequence Diagram is and why it’s useful.
- Be able to draw a Sequence Diagram for a given system.
- Know how to use different types of Collections (HashSet, HashMap).
- Understand how enums and static work in Java and apply them effectively.

---

## 📝 Sequence Diagram
### Why use them?
- Visualise interactions between objects over time.
- Show how objects communicate to execute a method.
- Can be connected to a Class Diagram to give both structural and behavioural views.

### Components
- **Lifeline** → represents an object participating in the interaction.
- **Frame** → used for conditions and loops (if, switch, foreach, etc.).

### Example
[Sequence Diagram](implementation/implementation/week3/Diagram/AppStore-SequenceDiagram.png)

A sequence diagram where object A calls doTwo() and doThree() on object B.
```java
public class A {
    private B myB = new B();
    public void doOne() {
        myB.doTwo();
        myB.doThree();
    }
}
```

---

## 📝 Collections
### HashSet
- Stores unique elements (no duplicates).
- Backed by a hash table.

```java
User user = new User("Jan");

HashSet<User> users = new HashSet<>();
users.add(user);
System.out.println(users.size()); // 1

users.add(user);
System.out.println(users.size()); // still 1
```

### HashMap
- Stores key-value pairs.
- Keys must be unique; values can be overwritten.
- Only objects allowed (primitive types like int get boxed into Integer).

```java
HashMap<String, String> phonebook = new HashMap<>();
phonebook.put("Jan", "+31612345678");
System.out.println(phonebook.get("Jan")); // +31612345678

phonebook.put("Jan", "+31687654321");
System.out.println(phonebook.get("Jan")); // +31687654321
```

---

## 📝 Enums
- Predefined set of constants.
- Useful for representing fixed states (e.g., order statuses).

```java
enum Status {
    ORDER_RECEIVED,
    WAITING_FOR_PAYMENT,
    READY_FOR_SHIPPING,
    SHIPPED
}

public class Order {
    private Status status;
    public void setStatus(Status status) {
        this.status = status;
    }
}

// Usage
Order order = new Order();
order.setStatus(Status.READY_FOR_SHIPPING);
```

---

## 📝 Static
- Belongs to the class, not an instance.
- Shared across all objects.
- Can be called without creating an object.

```java
public class MathUtils {
    public static int addNumbers(int first, int second) {
        return first + second;
    }
}

// Usage
int sum = MathUtils.addNumbers(1, 2); // 3
```

---

## 💡 Key Takeaways
- **Sequence Diagrams** = visualise interactions between objects.
- **HashSet** = unique elements.
- **HashMap** = key/value pairs with unique keys.
- **Enums** = predefined constants (fixed states).
- **Static** = class-level fields/methods, no object needed.

---

## 📂 Related Files
- [Week 3 Assignments](implementation/implementation/week3)
- [Lecture Slides (Week 3)](lectures/week3)
