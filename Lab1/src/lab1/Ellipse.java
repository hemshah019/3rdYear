package lab1;

public class Ellipse extends Rectangle {
	 public Ellipse(double Width, double Height) {
	        super(Width, Height);
	    }

	    @Override
	    public double getArea() {
	        return Math.PI * getWidth() * getHeight() / 4;
	    }

	    @Override
	    public String toString() {
	        return "Ellipse - Width: " + getWidth() + ", Height: " + getHeight() +
	               ", Ellipse - Area: " + getArea();
	    }
	}

