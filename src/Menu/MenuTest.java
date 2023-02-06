package Menu;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuTest {

	public static void main(String[] args) {
		// 프레임에 메뉴 붙이기
		Frame f = new Frame("메뉴");
		f.setSize(300,200);
		//1단계
		MenuBar mb = new MenuBar();
		//메인메뉴
		Menu mFile = new Menu("파일");
		//메인메뉴의 속성
		MenuItem miNew = new MenuItem("New");
		MenuItem miOpen = new MenuItem("Open");
		MenuItem miSave = new MenuItem("Save");
		//4
		//하위메뉴을 가지고 있는 메뉴
		Menu print = new Menu("Print");
		MenuItem printSetup = new MenuItem("print set up");
		MenuItem printPre = new MenuItem("미리보기");
		
		print.add(printSetup);
		print.add(printPre);
		
		//5
		MenuItem miClose = new MenuItem("close");//5
		
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(print);
		mFile.add(miClose);
		
		//메뉴바에 추가
		mb.add(mFile);
		
		f.setMenuBar(mb);
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		printSetup.addActionListener(new MyMenu());
		miClose.addActionListener(new MyMenu());
	}

}
