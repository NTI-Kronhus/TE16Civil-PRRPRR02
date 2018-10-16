package hus;

import java.util.ArrayList;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class house_simulator extends Application {

	ArrayList<House> houses = new ArrayList<House>();

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();

		Scene scene = new Scene(root, 1500, 700);
		primaryStage.setScene(scene);
		primaryStage.show();

		AnimationTimer at = new AnimationTimer() {

			long house_spawn_timer = 0;

			@Override
			public void handle(long now) {

				for (House house : houses) {
					house.setTranslateX(house.getTranslateX() + -5);
					//house.repaint(Color.color(Math.random(), Math.random(), Math.random()));

				}

				if (houses.size() > 0) {
					if (houses.get(0).getTranslateX() < -200) {
						if(!houses.get(0).isDoorOpen()){
							this.stop();
						}
						houses.remove(0);
					}
				}

				if (now - house_spawn_timer >= 1_000_000_000) {
					int floors = (int) (Math.random() * 4 + 1);
					House h = new House(floors, true);
					h.setTranslateY((5 - floors) * 100);
					root.getChildren().add(h);
					houses.add(h);
					h.setTranslateX(1700);
					house_spawn_timer = now;
				}

			}
		};
		at.start();
		scene.setOnKeyPressed(event -> {

			for (House house : houses) {
				house.repaint(Color.color(Math.random(), Math.random(), Math.random()));
			}
			
			if(event.getCode() == KeyCode.R){
				root.getChildren().clear();
				houses.clear();
				at.stop();
				at.start();
				
			}

		});
	}

	public static void main(String[] args) {
		launch();
	}

}
