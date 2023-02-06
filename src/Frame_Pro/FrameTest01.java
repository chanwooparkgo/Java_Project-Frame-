package Frame_Pro;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.BorderLayout;

import javax.swing.border.Border;

public class FrameTest01 {

	public static void main(String[] args) {
		/*
		Frame frame = new  Frame("첫 프레임");//프레임제목
		frame.setBounds(800, 100, 400, 300);//(x좌표,y좌표,너비,높이)
		
		frame.setBackground(Color.BLUE);
		frame.setVisible(true);
		*/
		Frame frame =new Frame("제목");
		Button[] arrbtn= new Button[5];//0 1 2 3 4 
		String[]btnTitle = {"닫기","열기","취소","확인","안녕"};
		
		for(int i=0; i<arrbtn.length; i++) {
			arrbtn[i]= new Button(btnTitle[i]);
		}//for
		frame.add(arrbtn[0], BorderLayout.EAST);
		frame.add(arrbtn[1], BorderLayout.WEST);
		frame.add(arrbtn[2], BorderLayout.NORTH);
		frame.add(arrbtn[3], BorderLayout.SOUTH);
		frame.add(arrbtn[4], BorderLayout.CENTER);
		//프레임에 내용물이 있을때 그 내용물의 내용 만큼 영역을 확보
		frame.pack();//출력
		frame.setVisible(true);
		//동쪽에 위치한 닫기버튼클릭
		 arrbtn[0].addActionListener(new ActionListener() {
	         //ActionLister : FunctionalinterFace
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            System.exit(0);
	         }
	      });
	      
	      //X버튼을 누를때
	      frame.addWindowListener(new WindowAdapter() {
	         @Override
	         public void windowClosing(WindowEvent e) {
	            System.exit(0);
	         }
	      });
	
	}//main

}
