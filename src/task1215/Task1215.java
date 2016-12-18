package task1215;

public class Task1215 {
	public static void main(String[] args) throws Exception {
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		Square square = new Square();

		circle.setRadius(2.0);
		triangle.setBase(2.0);
		triangle.setHeight(3.0);
		square.setLength(1.2);

		Double areaCircle = circle.getArea();
		Double areaTriangle = triangle.getArea();
		Double areaSquare = square.getArea();
		
		System.out.println("円の面積:" + areaCircle);
		System.out.println("三角形の面積:" + areaTriangle);
		System.out.println("四角形の面積:" + areaSquare);
	}
}

// 抽象クラス
abstract class Figure {
	// 面積を求める
	abstract double getArea();
}

// 円
class Circle extends Figure {
	private double radius;
	// コンストラクタ
	Circle() {
		super();
	}
	// 円の面積を求める
	double getArea() {
		double area = Math.PI * (radius * radius);
		return area;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) throws Exception {
		if (radius < 0) {
			Exception e = new Exception("半径が無効な値");
			throw e;
		}
		this.radius = radius;
	}
}

// 三角形
class Triangle extends Figure {
	private double height;
	private double base;
	// コンストラクタ
	public Triangle() {
		super();
	}
	// 三角形の面積を求める
	double getArea() {
		double area = (height * base) / 2;
		return area;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) throws Exception {
		if (height < 0) {
			Exception e = new Exception("高さが無効な値");
			throw e;
		}
		this.height = height;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) throws Exception {
		if (base < 0) {
			Exception e = new Exception("底辺が無効な値");
			throw e;
		}
		this.base = base;
	}
}

// 正方形
class Square extends Figure {
	private double length;
	// コンストラクタ
	public Square() {
		super();
	}
	// 正方形の面積を求める
	double getArea() {
		double area = (length * length);
		return area;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) throws Exception {
		if (length < 0) {
			Exception e = new Exception("辺の長さが無効な値");
			throw e;
		}
		this.length = length;
	}
}