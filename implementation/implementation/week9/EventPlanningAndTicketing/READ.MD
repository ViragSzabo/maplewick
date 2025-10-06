# 🎟️ Event Planning and Ticketing System
_Where every gathering becomes a well-orchestrated celebration under the golden lights of Maplewick._

---

## 🌸 Scenario
The Maplewick Cultural Council organizes a wide variety of events — 
from cozy book readings and art exhibitions to lively concerts and food festivals. 
To keep track of all these happenings, you are asked to develop an Event Planning 
and Ticketing System that can manage events, attendees, 
and ticket sales in a clear and organized way.

Your goal is to design an object-oriented application that allows event organizers 
to create and manage events, set ticket prices, register attendees, and calculate
statistics such as revenue and attendance rates.

---

## 🏗️ Core Requirements
Your system should include the following core features:

### 🎭 Event Management
Each **event** has:
- A name
- A date
- A venue
- A maximum capacity
- A ticket price
_Events can be added, updated, or canceled._

### 🎟️ Ticketing System
Attendees can **purchase tickets** for available events. 
When an event reaches full capacity, no more tickets can be sold.
_(EXCEPTION: check if there are any available spots or send a SOLDOUT message.)_
Each ticket keeps track of:
- Attendee name
- Event name
- Ticket ID
- Price paid

### 👥 Attendee Management
**Attendees can be registered to multiple events.**
The system should ensure **no duplicate tickets** for the same attendee per event.
It should be possible to view:
- Which events an attendee is attending
- How many attendees each event has

---

### 📊 Analytics and Reporting
Implement simple reporting functions, such as:
- Total revenue from ticket sales
- The most popular event (by attendees)
- The total number of attendees across all events
- The average ticket price
- Sort events by date or popularity
- Add a discount system for early buyers

---

### ⚙️ Example Classes
- Event
- Ticket
- Attendee
- EventManager (handles creation and lookup)
- TicketManager (handles ticket purchasing and validation)