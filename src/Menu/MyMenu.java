package Menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenu implements ActionListener {

	//클릭한 메뉴에 쓰여져 있는 텍스트를 구별하여 이벤트 처리
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("프린트 셋업")){
					System.out.println("프린트 셋업");
					
				}else if(e.getActionCommand().equalsIgnoreCase("Close")){
					System.out.println("종료");
					System.exit(0);
				}
				
			}
			

	
}
