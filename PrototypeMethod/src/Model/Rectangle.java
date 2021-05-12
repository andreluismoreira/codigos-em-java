package Model;

public class Rectangle extends Shape {

	public String type;

	public Rectangle() {
	}

	public Rectangle(Rectangle target) {
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
		return new Rectangle(this);
	}

	@Override
	public String toString() {
		return "Rectangle [type= " + type + "]";
	}
	

}
