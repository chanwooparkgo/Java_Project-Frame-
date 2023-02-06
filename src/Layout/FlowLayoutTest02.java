package Layout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayoutTest02 {

	Frame f = new Frame();
	Button jb1 = new Button("버튼1");
	Button jb2 = new Button("버튼2");
	Button jb3 = new Button("버튼3");
	Button jb4 = new Button("버튼4");
	Button jb5 = new Button("버튼5");
	Button jb6 = new Button("버튼6");
	public FlowLayoutTest02() {
		f.setLayout(new FlowLayout()); //Frame을 FlowLayout으로 세팅
		f.add(jb1);
		f.add(jb2);
		f.add(jb3);
		f.add(jb4);
		f.add(jb5);
		f.add(jb6);
		f.setSize(400,300);//윈도우의크기
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}//생성자
	
	public static void main(String[] args) {
		new FlowLayoutTest02();

	}
	
	

}
