package View;

import Model.Circle;
import Model.Rectangle;
import Model.Shape;
import Model.Square;

public class Application {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		Square square = new Square();
		Circle circle = new Circle();

		rectangle.setType("rectangle");
		square.setType("square");
		circle.setType("circle");
		
		System.out.println(rectangle.toString());
		System.out.println(square.toString());
		System.out.println(circle.toString());
		
		Shape retangulo = rectangle.clone();
		retangulo.setType("retangulo");
		System.out.println(retangulo);
		
		Shape quadrado = square.clone();
		quadrado.setType("quadrado");
		System.out.println(quadrado);
		
		Shape circulo = circle.clone();
		circulo.setType("circulo");
		System.out.println(circulo);
	}

}
