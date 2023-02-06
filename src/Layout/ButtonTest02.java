package Layout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonTest02 extends JFrame {
	
	JPanel main_panel;
	JButton bt_img;
	ImageIcon img1 = new ImageIcon("btn1.jpg");
	ImageIcon img2 = new ImageIcon("btn1_1.jpg");

	public ButtonTest02() {
		setTitle("JButton 이미지넣기"); // 프레임 타이틀바 텍스트 지정
		setSize(500,200); // 프레임 크기 조정(픽셀)
		// 프레임바 우측상단에 X버튼에 대한 강제종료 기능 지정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		main_panel = new JPanel(); // 패널 객체화 / 기본배치관리자 FlowLayout
		main_panel.setBackground(Color.WHITE); // 패널 배경색 하얀색으로 설정
		
		bt_img = new JButton(img1);
		bt_img.setRolloverIcon(img2); // 버튼에 마우스가 올라갈떄 이미지 변환
		bt_img.setBorderPainted(true); // 버튼 테두리 설정해제
		bt_img.setPreferredSize(new Dimension(150, 50)); // 버튼 크기 지정
		
		main_panel.add(bt_img);
		add(main_panel);
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
	
	public static void main(String[] args) {
		new ButtonTest02();

	}

}
