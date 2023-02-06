package Layout;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayoutTest01 {

	public static void main(String[] args) {
		//왼쪽 -> 오른쪽 자동배치
		//공간이 없을시 아래로 자동배치
		
		Frame f = new Frame();
		f.setBounds(800,100,1000,500);
		f.setLayout(new FlowLayout());
		//f.setLayout(new FlowLayout()FlowLayout.RIGHT);// FlowLayout 오른쪽 정렬
		
		Button btn1 = new Button("1");
		Button btn2 = new Button("2");
		Button btn3 = new Button("3");
		Button btn4 = new Button("4");
		//FlowLayout을 사용하면 일반적인 Frame에서 주는 btn1.setSize(200,100);
		//사이즈변경 불가능
		btn1.setPreferredSize(new Dimension(200,100));
		btn1.setPreferredSize(new Dimension(200,100));
		btn1.setPreferredSize(new Dimension(200,100));
		btn1.setPreferredSize(new Dimension(200,100));
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		
		f.setVisible(true);
		
		btn1.addActionListener(al);
		btn2.addActionListener(al);
		btn3.addActionListener(al);
		btn4.addActionListener(al);
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}//main
	
	static ActionListener al = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand());
			/*System.out.println(e);
			System.out.println(e.getID());
			System.out.println(((Button)e.getSource()).getWidth());
			*/
			//버튼별 이벤트
			if(e.getActionCommand().equals("1")){
				System.out.println("1번눌렀음");				
			}else if(e.getActionCommand().equals("2")) {
				System.out.println("2번눌렀음");
			}else if(e.getActionCommand().equals("3")) {
				System.out.println("3번눌렀음");
			}else if(e.getActionCommand().equals("4")) {
				System.out.println("4번눌렀음");
			}
			System.out.println("------------------");
		}
	};
}
