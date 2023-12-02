package lab1;

public class Circle extends Shape {
	
	// This is the attribute for the radius of the circle
    private double radius;
    
    // Constructor to initialize the Circle with a given radius
    public Circle(double radius) {
        this.radius = radius;
    }
    
 // Getter method to retrieve the radius of the circle
    public double getRadius() {
        return radius;
    }
    
 // Setter method to set the radius of the circle
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
 // Override the getArea() method to calculate the area of the circle
    public double getArea() {
    	
    	// Area calculation using the formula π * r^2
        return Math.PI * Math.pow(radius, 2);
    }
}