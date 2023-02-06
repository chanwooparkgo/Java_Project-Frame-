package Check_Choice;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckBoxTest {

	public static void main(String[] args) {
		// 프레임 객체 f
		Frame f = new Frame();
		//500,100좌표에 크기가 800,250
		f.setBounds(500, 100, 800, 250);
		//Layout은 FlowLayout으로 설정
		f.setLayout(new FlowLayout());
		//Font 설정
		Font font = new Font("맑은고딕", Font.BOLD, 30);
		
		Label q1 = new Label("1. 관심 분야는 무엇입니까?");
		Checkbox news = new Checkbox("news",true);
		Checkbox sports = new Checkbox("sports");
		Checkbox movie = new Checkbox("movie");
		Checkbox drone = new Checkbox("drone");
		
		//체크박스 선택 여부 판단
		news.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str =  e.getStateChange()==1? "뉴스 선택될":"뉴스 선택해제";
				System.out.println(str);
			}
		});
		q1.setFont(font);
		f.add(q1);
		f.add(news);
		f.add(sports);
		f.add(movie);
		f.add(drone);
		
		//배타적 선택: 여러개중 하나만 선택 가능
		Label q2 = new Label("2. 영화는 한달에 얼마나 자주 봅니까?");
		CheckboxGroup group = new CheckboxGroup();
		Checkbox one = new Checkbox("한번",group, true);
		Checkbox two = new Checkbox("두번",group, true);
		Checkbox three = new Checkbox("세번",group, true);
		
		//라디오버튼선택여부
		one.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("한번봅니다");
				
			}
		});
		two.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("두번봅니다");
				
			}
		});
		three.addItemListener(new ItemListener() {
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println("세번봅니다");
		
	}
});
		q2.setFont(font);
		f.add(q2);
		f.add(one);
		f.add(two);
		f.add(three);
		
		
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}

}
