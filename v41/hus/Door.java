package hus;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;

public class Door extends Group {

	private boolean open;

	public Door(double f_w, double f_h) {

		Rectangle door = new Rectangle(f_w / 5, 3 * f_h / 4);
		door.setFill(Color.BROWN);

		Circle knob = new Circle(2 * f_h / 20, 2.2 * f_h / 4, f_h / 20);
		knob.setFill(Color.YELLOW);

		Window window = new Window(f_w / 5);
		window.setTranslateX(f_w / 5 / 2 - f_w / 5 / 4 - f_w / 5 / 2 / 12);
		window.setTranslateY(2 * f_h / 4 / 5);
		window.setOnMouseClicked(event -> {

		});
		this.getChildren().addAll(door, knob, window);
		open = false;
		this.setOnMouseClicked(event -> {

			if (this.getChildren().size() == 3) {
				Rectangle white = new Rectangle(f_w / 5, 3 * f_h / 4);
				white.setFill(Color.WHITE);
				open = true;
				this.getChildren().add(white);

			} else {
				this.getChildren().remove(3);
				open = false;
			}

		});
	}

	public boolean isOpen() {
		return open;
	}

}
