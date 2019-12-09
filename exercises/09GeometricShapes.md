## Geometric Shapes

### Description
There are different geometric shapes.
All geometric shapes have a perimeter and an area.
Some geometric shapes need the constant pi to calculate these values.

### Tasks
1. Implement an interface `GeometricShape` that contains the functions to get the perimeter and the area.
2. Implement the classes `Square`, `Circle` and `Rectangle` that `implements` the Interface `GeometricShape`.
3. Implement constructors that contain the parameters needed to calculate the functions (like radius, length of sides...).
4. Implement the functions for the different shapes.
5. Write a "Main"-class `ShapeTester` that tests your implementation

### Hints
```java
public interface GeometricShape {
	public static double pi = 3.14159f;
	public double getPerimeter();
	public double getArea();
}
```
