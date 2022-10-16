(The Triangle class) Design a class named Triangle that extends
GeometricObject. The class contains:

■ Three double data fields named side1, side2, and side3 with default values
1.0 to denote three sides of the triangle.

■ A no-arg constructor that creates a default triangle.

■ A constructor that creates a triangle with the specified side1, side2, and
side3.

■ The accessor methods for all three data fields.

■ A method named getArea() that returns the area of this triangle.

■ A method named getPerimeter() that returns the perimeter of this triangle.

■ A method named toString() that returns a string description for the triangle.
For the formula to compute the area of a triangle, see Exercise 2.21. The toString()
method is implemented as follows:
return "Triangle: side1 = " + side1 + " side2 = " + side2 +
" side3 = " + side3;

Draw the UML diagram for the classes Triangle and GeometricObject.
Implement the class. Write a test program that creates a Triangle object with
sides 1, 1.5, 1, color yellow and filled true, and displays the area,
perimeter, color, and whether filled or not.

![EX11_01](https://user-images.githubusercontent.com/110781912/196046276-4ab4591c-9d81-424b-b1a9-071ae4e59404.png)
