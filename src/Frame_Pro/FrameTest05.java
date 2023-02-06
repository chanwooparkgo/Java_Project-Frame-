package Frame_Pro;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTest05 {

	public static void main(String[] args) {
		
		MyFrame04 fr = new MyFrame04();
		fr.setBackground(Color.yellow);
		fr.setTitle("다섯번째사용자프레임");
		//#1
		//WindowListener를 구현하고 있는 MyEventListener참조
		//fr.addWindowListener(new myEventListener05());
		//#2
		//fr.addWindowListener(new myEventListener05());
		
		//#3
		
		fr.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("어댑터를 생성하여 close 감지");
				System.exit(0);
			}
			
		});
	}

}
