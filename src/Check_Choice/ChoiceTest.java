package Check_Choice;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceTest {

	public static void main(String[] args) {
		Frame f = new Frame("질문");
		f.setSize(500, 250);
		f.setLocation(400, 100);
		
		//레이아웃 자동배치 off
		f.setLayout(null);
		/////////////////////////
		
		Choice day = new Choice();
		day.add("요일선택");
		day.add("Sun");
		day.add("Mon");
		day.add("Tue");
		day.add("Wed");
		day.add("Thu");
		day.add("Fri");
		day.add("Sat");
		
		//높이는 안에 있는 요소 사이즈로 결정되므로 의미가 없음
		//가로 사이즈는 설정이 필요함 다만 자동배치는 반드시 off 상태여야함
		day.setSize(150,0);
		day.setLocation(50,100);//위치(좌표)
		//방법1
		//day.addItemListener(new ChoiceHandler());
		//방법2
		day.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("요일: "+ day.getSelectedItem());
				
			}
		});
		
		f.add(day);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
	}

}
