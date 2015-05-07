import java.awt.Rectangle; 
public class AreaTester {

	public static void main(String[] args) {
		
		Rectangle box = new Rectangle(0, 0,25,25);
		double width = box.getWidth(); 
		double height = box.getHeight();
		
		double area = width * height;
		
		System.out.println("Actual: " + area);
		System.out.println("Expected: " + 625.0);
	}

}
