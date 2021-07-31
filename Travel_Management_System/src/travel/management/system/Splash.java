package travel.management.system;

import java.awt.Frame;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Splash {

	public static void main(String[] args) {
		SplashFrame frame = new SplashFrame();
		frame.setVisible(true);
		int x=1;
		for (int i = 0; i < 400; i+=6,x+=7) {
			frame.setLocation(683-((x+i)/2),383-(i/2));
			frame.setSize(x+i, i);
			try {
				Thread.sleep(10);
			} catch (Exception e) {

			}
		}
		frame.setVisible(true);
	}
}

class SplashFrame extends JFrame implements Runnable {
	Thread t1;

	SplashFrame() {
		ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("travel/management/system/splash.jpg"));
		Image image = icon.getImage().getScaledInstance(1000, 500, Image.SCALE_DEFAULT);
		ImageIcon icon2 = new ImageIcon(image);

		JLabel label = new JLabel(icon2);
		add(label);
		// setBounds(300, 200, 1000, 500);
		t1 = new Thread();
		t1.start();
	}

	public void run() {
		try {
			// Thread.sleep(7000);
			// this.setVisible(false);
		} catch (Exception e) {

		}
	}
}