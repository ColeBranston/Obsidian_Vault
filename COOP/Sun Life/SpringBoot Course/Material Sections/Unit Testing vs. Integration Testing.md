
The main difference is that with unit tests, only a specified section of the app is started up and every other module or class associated with it is "mocked" (instantiated and told exactly how to behave). → This tests how the specified section should function alone

Alternatively, Integration testing starts up the entire app and looks at how everything works together and if it functions properly

This explains why DEVs use unit testing and QA's use integration testing, because one wants to confirm the functionality of a single developed tool, while the other wants to confirm that the functionality of the entire app entirely

**Additionally...**
### **Unit Testing**

- **Scope**: Tests individual components or functions in isolation.
- **Performed By**: Typically done by developers.
- **Focus**: Ensures that each unit of the software performs as expected.
- **Type**: White-box testing.
- **Cost**: Generally less costly and faster to execute.
- **Defect Detection**: Easier to detect defects within a specific unit.
- **Dependencies**: Does not ensure the proper working of code with external dependencies

### **Integration Testing**

- **Scope**: Tests the interaction between integrated units or modules.
- **Performed By**: Usually done by testers.
- **Focus**: Ensures that combined units work together correctly.
- **Type**: Black-box testing.
- **Cost**: More costly and slower due to the complexity of integration.
- **Defect Detection**: More challenging to detect defects as they may arise from interactions between units.
- **Dependencies**: Ensures the proper working of code with external dependencies