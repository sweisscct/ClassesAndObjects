/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author Lecturer
 */
public class Rectangle extends Shape {
    private double height = 5.0;
    private double width = 6.2;
    
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    
    public double getArea() {
        return width * height;
    }
}
