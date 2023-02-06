package Frame_Pro;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FrameTest03 {

	public static void main(String[] args) {
		/*
		 * 화면 중앙에 프레임위치 시키기
		 * 1. 실행중인 모니터의 해상도를 알아내기
		 * 2. 모니터의 중앙좌표를 알아내기
		 * 3. 프레임 좌우 크기를 중앙 좌표에서 빼줘야한다
		 * 
		 * x: 모니터 x중앙좌표값 - 내가 만드려는 프레임 width/2
		 * y: 모니터 y중앙좌표값 - 내가 만드려는 프레임  height/2
		 */
		Frame fr = new Frame("세번째");
		fr.setSize(400, 400);
		//1. Toolkit을 통해 모니터의 해상도를 얻어오기
		Toolkit tk=  Toolkit.getDefaultToolkit();
		
		/*
		for(int i=0; i<3; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			tk.beep();
		}//for
		*/
		
		//2. Dimemsion을 통해 중앙 좌표값 설정하기
		Dimension di = tk.getScreenSize();
		int monitorW =  di.width;
		int monitorH =  di.height;
		
		//3. 프레임 좌우크기 빼주기
		int x = monitorW/2- fr.getWidth()/2;
		int y = monitorH/2- fr.getHeight()/2;
		
		fr.setLocation(x,y);
		fr.setVisible(true);
		
	}
}
