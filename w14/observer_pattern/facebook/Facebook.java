package observer_pattern.facebook;

import javax.swing.JOptionPane;

import observer_pattern.facebook.model.FacebookUser;
import observer_pattern.facebook.view.FollowerView;
import observer_pattern.facebook.view.FollowerViewV2;

public class Facebook {

	public static void main(String[] args) {

		FacebookUser user = new FacebookUser("JaoK");

		FollowerView stalker = new FollowerView(user);
		FollowerViewV2 stalkerv2 = new FollowerViewV2(user);

		for (int i = 0; i < 10; i++) {
			user.newPost(JOptionPane.showInputDialog("Gör ett nytt inlägg:"));
		}

	}

}
