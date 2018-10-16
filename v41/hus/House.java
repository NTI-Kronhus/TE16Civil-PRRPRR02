package hus;

import java.util.ArrayList;

import javafx.scene.Group;
import javafx.scene.input.ScrollEvent.HorizontalTextScrollUnits;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class House extends Group {

	private double HOUSE_WIDTH;
	private double FLOOR_HEIGHT;
	private int FLOORS;
	private ArrayList<Floor> floors = new ArrayList<Floor>();
	
	private Door door;
	
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
		this.HOUSE_WIDTH = 200;
		this.FLOOR_HEIGHT = 100;

		Polygon roof = new Polygon(HOUSE_WIDTH / 2, 0, 0, FLOOR_HEIGHT, HOUSE_WIDTH, FLOOR_HEIGHT);
		this.getChildren().add(roof);
		Floor f;
		f = new SingleWindowFloor(HOUSE_WIDTH,FLOOR_HEIGHT,1);

	
		this.getChildren().add(f);
		this.floors.add(f);
		for (int level = 2; level < floors; level++) {
			 
				f = new DoubleWindowFloor(HOUSE_WIDTH,FLOOR_HEIGHT,level);

			
			this.getChildren().add(f);
			this.floors.add(f);
		}
		GroundFloor gf = new GroundFloor(HOUSE_WIDTH,FLOOR_HEIGHT,floors);
		this.door = gf.getDoor();
		this.getChildren().add(gf);
		
		this.floors.add(gf);


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

		for (int level = 1; level < floors; level++) {
			Floor f = new DoubleWindowFloor(HOUSE_WIDTH,FLOOR_HEIGHT,level);
			
			this.getChildren().add(f);
			this.floors.add(f);
		}
		GroundFloor f = new GroundFloor(HOUSE_WIDTH,FLOOR_HEIGHT,floors);
		
		this.door = f.getDoor();
		this.getChildren().add(f);
		
		this.floors.add(f);

		if (basement) {
			Rectangle base = new Rectangle(0, (floors + 1) * F_HEIGHT, H_WIDTH, F_HEIGHT);
			base.setFill(Color.GRAY);
			base.setStroke(Color.BLACK);
			this.getChildren().add(base);
			this.FLOORS++;
		}

	}

	public void repaint(Color c) {
		for (Floor floor : floors) {
			floor.setFill(c);
		}
	}

	public boolean isDoorOpen() {

		return door.isOpen();

	}

}
