package hus;

public class GroundFloor extends Floor {

	private Door door;
	
	public GroundFloor(double w, double h, int level) {
		super(w, h, level);

		Window window = new Window(h);
		Door door = new Door(w, h);
		window.setTranslateX(w/6);
		window.setTranslateY(h/4);
		
		door.setTranslateX(4 * w / 6);
		door.setTranslateY(h / 4);
		this.door = door;
		this.getChildren().addAll(window, door);

	}

	public Door getDoor() {
		return this.door;
	}

}
