# Sports club Class diagram

Exact same as university departments, except that a player can only be assigned to one team at a time

```mermaid
classDiagram
    class Club
    
    class Team
    
    class Player

Club "1" *--  "3" Team
Team "1" o-- "1..*" Player
```

