package Model;

public class Square extends Shape {

	public String type;

	public Square() {
	}

	public Square(Square target) {
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
		return new Square(this);
	}

	@Override
	public String toString() {
		return "Square [type= " + type + "]";
	}

	
}
