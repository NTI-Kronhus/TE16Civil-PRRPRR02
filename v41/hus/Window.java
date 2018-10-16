package hus;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Window extends Group {

	public Window(double f_h) {

		double size = f_h / 2;
		Rectangle r = new Rectangle(size + size / 12, size + size / 12);

		Rectangle r1 = new Rectangle(size / 12, size / 12, size / 2 - size / 12, size / 2 - size / 12);
		Rectangle r2 = new Rectangle(size / 12 + size / 2, size / 12, size / 2 - size / 12, size / 2 - size / 12);
		Rectangle r3 = new Rectangle(size / 12, size / 12 + size / 2, size / 2 - size / 12, size / 2 - size / 12);
		Rectangle r4 = new Rectangle(size / 12 + size / 2, size / 12 + size / 2, size / 2 - size / 12,
				size / 2 - size / 12);

		r1.setFill(Color.WHITE);
		r2.setFill(Color.WHITE);
		r3.setFill(Color.WHITE);
		r4.setFill(Color.WHITE);

		this.getChildren().addAll(r, r1, r2, r3, r4);

		this.setOnMouseClicked(event -> {
			if (r1.getFill() == Color.WHITE) {
				r1.setFill(Color.YELLOW);
				r2.setFill(Color.YELLOW);
				r3.setFill(Color.YELLOW);
				r4.setFill(Color.YELLOW);
			} else {
				r1.setFill(Color.WHITE);
				r2.setFill(Color.WHITE);
				r3.setFill(Color.WHITE);
				r4.setFill(Color.WHITE);

			}

		});
	}

}
