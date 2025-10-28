# 🌙 Nighty Exam Practice – The Whispering Library

**Theme:** A magical archive where books whisper secrets at night.
**Focus:** Polymorphism _(different whisper styles)_, interface implementation, and exception safety.

## Concepts Covered
* **OOP hierarchy:** Book → Novel, SpellBook, Diary
* **Interfaces:** Readable, Cursed
* **Exception Handling:** WhisperTooLoudException
* **Polymorphism:** Each book whispers differently
* **Encapsulation:** Each book tracks how many times it’s been read

## ⏱️ Estimated time: 40 min
→ 10 min design (classes & relationships)
→ 25 min coding
→ 5 min testing & reflection

## 🧩 Task
Simulate a library where each book whispers a message when read.
Some books are “cursed” and may throw an exception if opened too often.
A **Librarian** class manages reading cycles, and handles exceptions.

## 🧠 Reviewing
1. [ ] Did you correctly demonstrate polymorphism by storing different Book subclasses in one list?
2. [ ] Does your program handle exceptions without stopping the simulation?
3. [ ] Did you use interfaces meaningfully (Readable & Cursed)?
4. [ ] How could you extend it (e.g., add HistoryBook, CookBook, or a BookShelf class)?

## ✅ Grading Rubric (self-check)
| Category               | Max    | You |
| ---------------------- |--------|-----|
| Structure & OOP Design | 6      | 6   |
| Exception Handling     | 2      | 2   |
| Clarity & Testing      | 2      | 1.8 |
| **Total**              | **10** | 9.8 |

### 💡 Small improvement idea
* add a short Thread.sleep()
* or “---” separator between nights for realism, 
* or add another Book subclass 
* (e.g., CookBook or HistoryBook) 
* to expand testing coverage
* Logging feature: how many times each book has been read
* Add BookGenres (enums)
* Add a Bookshelf class that groups books by type or genre