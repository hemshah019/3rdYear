package lab1;

//import lab1.Circle;
//import lab1.Rectangle;

public class Driver {
    public static void main(String[] args) {
    	Rectangle rectangle1 = new Rectangle(4.0,5.0);
    	Rectangle rectangle2 = new Rectangle(7.0,8.0);
    	
//        Rectangle rectangle1 = new Rectangle();
//        rectangle1.setHeight(4.0);
//        rectangle1.setWidth(7.0);
//        
//        Rectangle rectangle2 = new Rectangle();
//        rectangle2.setHeight(10.0);
//        rectangle2.setWidth(8.0);
        

        Circle circle1 = new Circle(3.0);
        Circle circle2 = new Circle(5.0);
        
        Ellipse ellipse1 = new Ellipse(4.0, 2.0);
        Ellipse ellipse2 = new Ellipse(6.0, 3.0);

        System.out.println("Area of rectangle1: " + rectangle1.getArea());
        System.out.println("Area of rectangle2: " + rectangle2.getArea());
        System.out.println("Area of circle1: " + circle1.getArea());
        System.out.println("Area of circle2: " + circle2.getArea());
        System.out.println("Ellipse 1: " + ellipse1);
        System.out.println("Ellipse 2: " + ellipse2);
    }
}
