package Layout;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class BorderLayoutTEst02 {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		String[] msg = {"아래버튼","위버튼","오른쪽버튼","왼쪽버튼","가운데버튼"};
		//버튼색상표
		Color[] color = {new Color(80,188,223),new Color(255,153,153),new Color(255,205,197),new Color(204,255,255),new Color(255,22,89) };
		String [] location = {"South","North","East","West","Center"};
		Button[] btn =  new Button[msg.length];
		
		for(int i=0;i<btn.length;i++) {
			btn[i]=new Button(msg[i]); //버튼
			btn[i].setBackground(color[i]); //색
			f.add(btn[i], location[i]);//frame에 붙이기
		}
	}

}
