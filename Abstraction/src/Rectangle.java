import com.abstraction.Shape1;

public class Rectangle implements Shape1 {

	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		
		return length * width;
	}

}