package Layout;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest {

	public static void main(String[] args) {
		Frame f = new Frame("버튼 테스트");
		f.setBounds(200, 200, 400, 400);
		
		f.setLayout(null);//자동배치 사용 안함
		//Frame에 추가되는 각각의 컴포넌트를  고유 사이즈와 위치를 설정하여 배치한다
		Button btnOk = new Button("확인");
		btnOk.setBounds(70,90,100, 50);
		btnOk.setBackground(new Color(255,153,153));//버튼 색상
		
		Button btnClose = new Button("닫기");
		btnClose.setBounds(btnOk.getBounds()); //btnOK와 같은 사이즈의 Button
		
		btnClose.setLocation(btnOk.getX()+btnOk.getWidth()+60, 0);
		btnClose.setBackground(new Color(255,205,197));
		
		f.add(btnOk);
		f.add(btnClose);
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});

	}

}
