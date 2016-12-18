package task1215;

import java.util.ArrayList;

public class Task1215_2 {
	public static void main(String[] args) throws Exception {
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		Square square = new Square();
		
		circle.setRadius(4.0);
		triangle.setBase(2.0);
		triangle.setHeight(7.0);
		square.setLength(30.0);

		ArrayList<Figure> arrayList = new ArrayList<Figure>();
		arrayList.add(circle);
		arrayList.add(triangle);
		arrayList.add(square);
		
		for (Figure figure : arrayList) {
			System.out.println(figure.getArea());
		}
	}
}