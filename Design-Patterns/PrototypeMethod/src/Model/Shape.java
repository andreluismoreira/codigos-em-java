package Model;

public abstract class Shape {

	public String id;
	public String type;

	public Shape() {
	}

	public Shape(Shape target) {
		this.id = target.id;
		this.type = target.type;
	}

	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public abstract Shape clone();

	@Override
	public String toString() {
		return "Shape [id=" + id + ", type=" + type + "]";
	}

	
}
