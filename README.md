# S1.Inheritance and Polymorphism
These exercises aim to practice key object-oriented programming concepts such as inheritance, abstract classes, object initialization, encapsulation, constructors, and method implementation.
---

# 🎵 S1.01 Level 1 Excercise 1

## 📄 Description

This exercise consists of creating **three types of instruments**:  
**Wind**, **Strings**, and **Percussion** — each with its own `play()` function.

This project simulates a small music group composed of different types of musical instruments.  
There are **wind instruments**, **string instruments**, and **percussion instruments**.

All instruments share the following attributes:

- ```name```
- ```price```

Additionally, each instrument has a method called **`play()`**.  
This method is **abstract** in the base class `Instrument` and must be implemented in the child classes:

- 🪈 **Wind instruments** → display `"A wind instrument is playing"`
- 🎸 **String instruments** → display `"A string instrument is playing"`
- 🥁 **Percussion instruments** → display `"A percussion instrument is playing"`

The **class loading process** occurs only once.  
It can be triggered by either:

1. Creating the **first instance** of the class, or  
2. Accessing a **static member** of the class.
   
---

# 🚗 S1.01 Level 1 - Exercise 2

## 📄 Description
This exercise focuses on creating a **Car class** to understand the difference between **static** and **non-static** attributes and methods in Java, as well as the use of `final`.

You will create a class `Car` with the following attributes:
- `brand` → **static final**  
- `model` → **static**  
- `power` → **final**

Demonstrate the difference between these three types of attributes. Can any of them be initialized through the class constructor?

The class should also have two methods:
- `accelerate()` → a **non-static** method that prints `"The vehicle is accelerating"`  
- `brake()` → a **static** method that prints `"The vehicle is braking"`

Finally, demonstrate how to invoke the static and non-static methods from the `main()` method of the main class.

---

# 📱 S1.01 Level 2

## 📄 Description
This exercise consists of creating a **smartphone** with functionalities such as **taking photos** or **making calls**.

- Create a class named **`Phone`** with the attributes `brand` and `model`, and a method `call()`.  
  This method must receive a `String` with a phone number and display a message on the console saying that the phone is calling the received number.

- Create an interface named **`Camera`** with the method `photograph()`, and another interface named **`Clock`** with the method `alarm()`.

- Create a class named **`Smartphone`** that extends `Phone` and also implements the `Camera` and `Clock` interfaces.

  - The `photograph()` method must display:  
    ```
    A photo is being taken.
    ```

  - The `alarm()` method must display:  
    ```
    The alarm is ringing.
    ```

- From the application's **`main()`**, create a `Smartphone` object and call the above methods.

---

## 💻 Technologies Used
- **IntelliJ IDEA**  
- **Java**

---

## 📋 Requirements
- **JDK 25.0.1**

---

## 🛠️ Installation
Clone this repository:
git clone https://github.com/cristhianchulca49/S1.Inheritance-and-Polymorphism.git


🤝 Contributions are welcome! 
Please follow these steps to contribute: 
Fork the repository Create a new branch: git checkout -b feature/NewFeature 
Make your changes and commit them: git commit -m 'Add New Feature' 
Push the changes to your branch: git push origin feature/NewFeature 
Open a Pull Request
