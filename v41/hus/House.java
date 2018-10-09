package hus;

import java.util.ArrayList;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class House extends Group {

	private double HOUSE_WIDTH;
	private double FLOOR_HEIGHT;
	private int FLOORS;
	private ArrayList<Rectangle> floors = new ArrayList<Rectangle>();
	
	public House() {
		this(1,false);
	}
	
	public House(int floors, boolean basement,Color c) {
		this(floors,basement);
		repaint(c);
	}
	
	public House(int floors, boolean basement,double H_WIDTH,double F_HEIGHT,Color c) {
		this(floors,basement,H_WIDTH,F_HEIGHT);
		repaint(c);	
	}
	
	public House(int floors, boolean basement) {

		if (floors <= 0) {
			floors = 1;
		}
		
		this.FLOORS = floors + 1;
		this.HOUSE_WIDTH = 100;
		this.FLOOR_HEIGHT = 50;

		Polygon roof = new Polygon(HOUSE_WIDTH / 2, 0, 0, FLOOR_HEIGHT, HOUSE_WIDTH, FLOOR_HEIGHT);
		this.getChildren().add(roof);

		for (int i = 1; i <= floors; i++) {
			Rectangle floor = new Rectangle(0, i * FLOOR_HEIGHT, HOUSE_WIDTH, FLOOR_HEIGHT);
			floor.setFill(Color.SANDYBROWN);
			floor.setStroke(Color.BLACK);
			this.getChildren().add(floor);
			this.floors.add(floor);
		}

		if (basement) {
			Rectangle base = new Rectangle(0, (floors + 1) * FLOOR_HEIGHT, HOUSE_WIDTH, FLOOR_HEIGHT);
			base.setFill(Color.GRAY);
			base.setStroke(Color.BLACK);
			this.getChildren().add(base);
			this.FLOORS++;
		}

	}

	public int getFLOORS() {
		return FLOORS;
	}

	public double getHOUSE_WIDTH() {
		return this.HOUSE_WIDTH;
	}

	public double getFLOOR_HEIGHT() {
		return this.FLOOR_HEIGHT;
	}

	public House(int floors, boolean basement, double H_WIDTH, double F_HEIGHT) {
		if (floors <= 0) {
			floors = 1;
		}

		this.FLOORS = floors + 1;
		this.HOUSE_WIDTH = H_WIDTH;
		this.FLOOR_HEIGHT = F_HEIGHT;
		Polygon roof = new Polygon(H_WIDTH / 2, 0, 0, F_HEIGHT, H_WIDTH, F_HEIGHT);
		this.getChildren().add(roof);

		for (int i = 1; i <= floors; i++) {
			Rectangle floor = new Rectangle(0, i * F_HEIGHT, H_WIDTH, F_HEIGHT);
			floor.setFill(Color.SANDYBROWN);
			floor.setStroke(Color.BLACK);
			this.getChildren().add(floor);
			this.floors.add(floor);
		}

		if (basement) {
			Rectangle base = new Rectangle(0, (floors + 1) * F_HEIGHT, H_WIDTH, F_HEIGHT);
			base.setFill(Color.GRAY);
			base.setStroke(Color.BLACK);
			this.getChildren().add(base);
			this.FLOORS++;
		}

	}

	public void repaint(Color c) {
		for (Rectangle floor : floors) {
			floor.setFill(c);
		}
	}

}
