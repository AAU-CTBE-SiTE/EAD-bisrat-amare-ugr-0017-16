# Spring Framework / Spring Core Lab — IoC and Bean Management (pages 1–19)

## Requirements
- JDK installed and available in the terminal
- Apache Maven installed and available as `mvn`

## Project structure
- `Student.java`: Student bean with setters and a parameterized constructor
- `Address.java`: Address bean injected into Student
- `beansConfig-literal.xml`: setter-based injection of literal values
- `beansConfig-object-setter.xml`: setter-based injection of an Address bean
- `beansConfig.xml`: constructor-based injection of an Address bean (main example)
- `App.java`: runs the final constructor-injection example
- `SetterLiteralDemo.java`: runs the literal-injection example
- `SetterObjectDemo.java`: runs the object setter-injection example

Lombok is intentionally not required: getters, setters, and `toString()` are written explicitly so the project builds without an IDE plugin.

## Run the final example
Open a terminal in this project folder and run:
```powershell
mvn clean compile
mvn exec:java
```

Expected output includes:
```text
Student Details: Student{id=101, name='John Doe', age=20, address=Address{city='Addis', country='Ethiopia'}}
```

## Run the earlier examples
Literal setter injection:
```powershell
mvn exec:java -Dexec.mainClass=com.craft.SetterLiteralDemo
```

Object setter injection:
```powershell
mvn exec:java -Dexec.mainClass=com.craft.SetterObjectDemo
```

## Concepts demonstrated
1. Spring IoC container creates and manages beans.
2. `ApplicationContext` loads XML configuration from `src/main/resources`.
3. `context.getBean("student", Student.class)` retrieves a managed bean.
4. Setter-based literal injection uses `<property name="..." value="..."/>`.
5. Setter-based object injection uses `<property name="address" ref="address"/>`.
6. Constructor-based injection uses `<constructor-arg .../>`, including `ref` for the Address bean.
7. The `new` keyword is not used in `App` to create the Student or Address; Spring creates and wires them from the XML.

## Author
Bisrat Amare