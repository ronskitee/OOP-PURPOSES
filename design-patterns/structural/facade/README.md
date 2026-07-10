# Facade Pattern
A Structural Design Pattern used to hide complexities and provides a much simpler interface to a library.

```mermaid
flowchart LR
    Client
    Facade
    SubSystem1[Sub-System 1]
    SubSystem2[Sub-System 2]
    SubSystem3[Sub-System 3]

    Client --> Facade 
    Facade <--> SubSystem1
    Facade <--> SubSystem2
    Facade <--> SubSystem3
```

## Pros and Cons

| PROS      | CONS      |
|-----------|-----------|
| Code isolation for complex subsystem | Having a class to manage to all |

