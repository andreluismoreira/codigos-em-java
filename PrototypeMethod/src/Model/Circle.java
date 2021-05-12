package Model;

public class Circle extends Shape {

	public String type;

	public Circle() {
	}

	public Circle(Circle target) {
		super(target);
		if (target != null) {
			this.type = target.getType();
		}
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public Shape clone() {
		return new Circle(this);
	}

	@Override
	public String toString() {
		return "Circle [type= " + type + "]";
	}

	
}
