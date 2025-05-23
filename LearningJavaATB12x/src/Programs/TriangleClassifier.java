package Programs;

public class TriangleClassifier {

	public static void main(String[] args) {
		int sideA = 10;
		int sideB = 5;
		int sideC = 5;
		
		if(sideA == sideB && sideB == sideC) {
			System.out.println("The triangle is an equilateral triangle");
		} else if (sideA == sideB || sideA == sideC || sideB == sideC) {
			System.out.println("The triangle is an Isosceles triangle");
		} else {
			System.out.println("The triangle is a Scalene triangle");
		}

	}

}
