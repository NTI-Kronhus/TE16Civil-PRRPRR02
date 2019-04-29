package observer_pattern.facebook.view;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import observer_pattern.facebook.model.FacebookUser;

public class FollowerViewV2 extends JFrame implements Observer {

	private FacebookUser obj;
	private JTextArea textArea = new JTextArea();

	public FollowerViewV2(FacebookUser user) {
		obj = user;
		user.addObserver(this);
		prepareTextArea();
		this.setBounds(0, 0, 500, 500);
		this.setVisible(true);
	}

	private void prepareTextArea() {
		textArea.setFont(new Font("Courier New", Font.PLAIN, 40));
		textArea.setEditable(false);
		this.add(textArea);
	}

	@Override
	public void update() {
		updateView();
	}

	public void updateView() {
		textArea.setText("");
		for (String post : obj.getPosts()) {
			textArea.setText(textArea.getText() + post + "\n");
		}
	}

}
