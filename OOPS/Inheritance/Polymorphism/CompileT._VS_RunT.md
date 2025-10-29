| Feature             | Compile-time Polymorphism                | Runtime Polymorphism                     |
| ------------------- | ---------------------------------------- | ---------------------------------------- |
| Achieved by         | **Method Overloading**                   | **Method Overriding**                    |
| Inheritance needed? | ❌ Not necessary                          | ✅ Required                               |
| Method name         | Same                                     | Same                                     |
| Parameters          | Different                                | Same                                     |
| Binding type        | **Static binding** (compile time)        | **Dynamic binding** (runtime)            |
| Who decides?        | Compiler                                 | JVM (runtime)                            |
| Return type         | Can differ                               | Must be same or covariant                |
| Access modifier     | Independent                              | Cannot be more restrictive               |
| Example             | `add(int, int)` vs `add(double, double)` | `Dog.sound()` overrides `Animal.sound()` |
