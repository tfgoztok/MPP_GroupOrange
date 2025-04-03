## Does Inheritance Make Sense?

### 1. **Violates the "Is-A" Rule**
Inheritance implies an "is-a" relationship, meaning a `Circle` should be a specialized form of a `Cylinder`. But in this design the relationship is incorrect because  `Circle` is a **2D shape**, whereas a `Cylinder` is a **3D object**. Again, A `Circle` **does not have a height** amd `Cylinder` does. Moreover, a `Circle` computes **area** and  a `Cylinder` computes **volume**. So, `Circle` **should not inherit** from `Cylinder` because this inheritance do not follow the "IS-A" relationship.

### 2. **Violates Liskov Substitution Principle (LSP)**
As per Liskov Substitution Principle "If class B is a subclass of class A, then objects of type A should be replaceable with objects of type B without affecting the correctness of the program.". So, If `Circle` extends `Cylinder`, then wherever a `Cylinder` is expected, a `Circle` should be usable. However, this substitution fails because `Cylinder` has a **height**, but `Circle` does not. So, `Circle` cannot properly represent a `Cylinder`. `Cylinder` has a method `computeVolume()`, but `Circle` has no meaningful way to implement it as showed in the code and gives an incorrect value.

