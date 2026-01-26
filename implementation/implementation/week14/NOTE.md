# Notes before the exam
## Calculate Years - libraries! (Time), Random, LocalDate
LocalDate.now; LocalDate.Year(), LocalDate.Month(), LocalDate.Day()
new Random()

## Interfaces and Abstract classes differences
They cannot be instantiated.

### Abstract Class
- A class that cannot be instantiated directly.
- It acts as a base class for other **related** classes.
- It contains both abstract and concrete methods.
- With constructor and any type of variables, access modifier and concrete, abstract methods.

### Interface
- It defines a set of methods that a class **must** implement.
- It focuses on **what** a class can do, not how it does it.
- Variables and methods are public by default.
- Abstract methods without a constructor.
- A class can implement multiple interfaces.

## ArrayList VS LinkedList
- **ArrayList:** using a dynamic array, offering fast access to elements based on index.
    - Insert and remove elements in the middle requires shifting elements, impacting performance.
- **LinkedList:** using nodes with references to the next and previous elements
    - Efficient for frequent insertions and deletions in the middle, but slower for random access due to traversal.

## HashMap VS HashSet
- **HashMap:** storing key-value pairs and offers constant-time complexity for basic operations (put, get, remove)
  - using hashing to map keys to indices in an array, providing efficient retrieval.
- **HashSet:** a set implementation that stores unique elements without duplicates.