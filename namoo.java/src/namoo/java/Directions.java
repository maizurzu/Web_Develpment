package namoo.java;

public enum Directions {
	
	
	NORTH("λΆ"), EAST("λ"), WEST("μ"), SOUTH("λ¨");

	String name;
	
	Directions(String name) {
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	
}


