# Good-Smell

## Overview
This repository contains code that has been refactored to remove bad smells using software design principles.

## Refactoring Summary
The following bad smells were identified and addressed:

1. **Long Method**:
    - **Problem**: Methods were too long, making them hard to understand and maintain.
    - **Solution**: Applied the **Extract Method** principle to break down long methods into smaller, more manageable ones.

2. **Large Class**:
    - **Problem**: Some classes were too large and had multiple responsibilities.
    - **Solution**: Applied the **Single Responsibility Principle (SRP)** to ensure each class has only one reason to change. Split large classes into smaller, more focused ones.

3. **Duplicated Code**:
    - **Problem**: Identical code blocks were found in multiple places.
    - **Solution**: Applied the **DRY (Don't Repeat Yourself)** principle to remove duplication by creating reusable methods and classes.

4. **Feature Envy**:
    - **Problem**: Some methods were more interested in the data of other classes than their own.
    - **Solution**: Applied the **Move Method** principle to move methods to the appropriate classes where they operate on their own data.

## Detailed Changes
### Example 1: Refactoring Long Methods
**Before**:
```java
public void process() {
}

**After**:

public void process() {
    partOne();
    partTwo();
}

private void partOne() {
    // Refactored code from process method
}

private void partTwo() {
    // Refactored code from process method
}

### Example 2: Applying Single Responsibility Principle
**Before**:
public class UserManager {
    public void createUser() {
        // Code to create user
    }
    public void updateUser() {
        // Code to update user
    }
    public void sendNotification() {
        // Code to send notification
    }
}

**After**:
public class UserManager {
    public void createUser() {
        // Code to create user
    }
    public void updateUser() {
        // Code to update user
    }
}

public class NotificationService {
    public void sendNotification() {
        // Code to send notification
    }
}

### Example 3:Removing Duplicated Code
**Before**:
public class OrderService {
    public void processOrder() {
        // Duplicated code 
    }
    public void cancelOrder() {
        // Duplicated code 
    }
}
**After**:
public class OrderService {
    private void commonCode() {
        // Refactored common code block
    }
    
    public void processOrder() {
        commonCode();
        // Additional code for processing order
    }
    public void cancelOrder() {
        commonCode();
        // Additional code for canceling order
    }
}


