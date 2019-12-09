## Vehicles

### Description
There are multiple types of *vehicles*.
In this example we will be working with cars and motorcycles and electric cars as special cars.
Every vehicle has a set number of wheels and has a brand (Marke).
For vehicles you have to pay taxes by default.
Cars can have a autopilot.
Electric cars have a capacity of their battery and as a speciality they do not have to pay taxes.

### Tasks
1. Model the classes `Vehicle`, `Car`, `ElectricCar` and `Motorcycle`
2. Give the classes the behaviour as in the description
3. The constructors take the brand (Marke) and additionally the electric car takes the capacity
4. The toString method should return the brand and additionally the capacity for the electric car
5. Create a `Garage` with a main-method, that contains a car, electric car and motorcycle
6. Create a sensible output for those vehicles (brand, capacity, tax)

### Hints
* the amount of wheels shouldn't be changeable from outside of the class

### Solution
You can find the solution [here](https://github.com/pibebtol/java-lessons/tree/master/exercises/solutions/07Vehicles).

Since the amount of wheels should not be changeable from outside of the class, we need to set it private.
However we don't want to create a variable `private int wheels` for every vehicle (car/motorcycle...) so we do that in the **superclass** `Vehicle`.

That means that only the `Vehicle` class can access the variable so we either need a function `setWheels()` in `Vehicle` that is public/protected and control there, who sets the variable *wheels*.
Alternatively (and this would probably be the better way) we can set the *wheels* in the constructor of `Vehicle` and call the constructor when creating a *car* or *motorcycle*.
