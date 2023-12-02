package lab1;


public class Rectangle extends Shape  {
	
	private double width;
    private double height;
    
 // Create a constructor for the Rectangle class that takes width and height as parameters.
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
 // Getter method to retrieve the width of the rectangle
    public double getWidth() {
        return width;
    }
    
 // Setter method to set the width of the rectangle
    public void setWidth(double width) {
        this.width = width;
    }
    
 // Getter method to retrieve the height of the rectangle
    public double getHeight() {
        return height;
    }
    
 // Setter method to set the height of the rectangle
    public void setHeight(double height) {
        this.height = height;
    }
    
 // Override the abstract method getArea() to calculate the area of the rectangle
    @Override
    public double getArea() {
        return width * height;
    }
}
