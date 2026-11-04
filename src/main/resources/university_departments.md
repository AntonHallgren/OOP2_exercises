# University departments Class diagram

University owns departments, departments cannot exist independently of the university

Departments has lecturers, they can exist independently

Is there any (direct) relationship between University and Lecturer? Seems like no

Seems like each University has exactly 3 Departments. I make the assumption that each Department has at least one Lecturer. 

```mermaid
classDiagram
    class University
    
    class Department
    
    class Lecturer

University "1" *--  "3" Department
Department "1" o-- "1..*" Lecturer
```

