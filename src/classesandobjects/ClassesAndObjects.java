/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesandobjects;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Shape2D;
import shapes.Square;
import shapes.Triangle;



/**
 *
 * @author Lecturer
 */
public class ClassesAndObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Triangle tri1 = new Triangle();
        System.out.println(tri1);
        Triangle tri2 = new Triangle();
        Triangle tri3 = new Triangle();
        Triangle tri4 = new Triangle();
        Triangle tri5 = new Triangle();
        Triangle tri6 = new Triangle();

        int[] sideLengths = new int[18];
        // The lengths of tri1's sides will be first, then the lengths of tri2's sides etc
        sideLengths[0] = 5;
        sideLengths[1] = 8;
        sideLengths[2] = 9;
        
        // tri5 (4, 7, 2)
        sideLengths[12] = 4;
        sideLengths[13] = 7;
        sideLengths[14] = 2;
        
        // We want to set the middle side of each triangle to be 3
        sideLengths[1] = 3;
        sideLengths[4] = 3;
        sideLengths[7] = 3;
        sideLengths[10] = 3;
        sideLengths[13] = 3;
        sideLengths[16] = 3;
        
        Person sam = new Person();
//        sam.favTriangle = tri5;
        System.out.println("--- Rectangles ---");
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(true, "Blue", 5, 6);
        System.out.println(rect1.getArea());
//        Shape shape1 = new Shape();
System.out.println(rect1.getColour());
        System.out.println(tri5.getColour());
        
        Person p4 = new Person("Sam", 100);
        Person p3 = new Person(42, "Ken");
        Person p1 = new Person();
        Person p2 = new Person(5);
        
//        Shape s1 = new Shape();

        Square sq1 = new Square(true, "Green", 10);
        Rectangle sq2 = new Square(false, "Purple", 5);
        Shape sq3 = new Square(true, "Maroon", 7);
        Shape tri10 = new Triangle();
        sq1.getArea();
        
        Shape2D sq4 = new Square(true, "Blue", 2);
        sq4.calculateAngles();
        // Can;t make a Circle as an example of a Shape2D, since it does not implement the interface.
//        Shape2D circle5 = new Circle();
    }
    
}
