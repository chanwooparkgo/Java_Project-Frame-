package Check_Choice;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageTest {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(null);
		
		f.setBounds(100, 100, 400, 200);//윈도우사이즈

		//이미지
		
		ImageIcon img = new ImageIcon("daum.png");
		JLabel j1 = new JLabel(); //JLabel에 ImageIcon사용가능
		j1.setBounds(30,30,360,188);//원본이미지사이즈
		f.add(j1);
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
	}

}
