package proj;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.*;
import javax.swing.border.*;

public class Liberal2 extends JFrame {

	JLabel imgBox, label2;   //imgBox = 건물사진, label2 : 학과 배너 
	ImageIcon img;            //
	String name, content;     //name = 건물사진 이미지파일명, content = txt 파일명
	Font font1 = new Font("Dialog", Font.ITALIC, 15);   //학과명
	Font font2 = new Font("Dialog", Font.ITALIC, 19);   //학과사무실, 학과전화번호
	Font font3 = new Font("Dialog", Font.ITALIC, 25);  //학과정보
	
	JLabel jlabel22[] = new JLabel[20] ; //학과정보 배열크기
	
	JButton jb1 = new JButton("고고문화인류학과");
	JButton jb2 = new JButton("독일학과");
	JButton jb3 = new JButton("사학과");

	Border border1 = BorderFactory.createEtchedBorder(Color.red, new Color(165, 163, 151));
	Border border2 = new TitledBorder(border1, "<  사 진  >");  
	Border border3 = BorderFactory.createEtchedBorder(Color.white, new Color(165, 163, 151));
	Border border4 = new TitledBorder(border3, "");
	
    
	public Liberal2 (String name, String content) {
		
		getContentPane().setBackground(Color.WHITE);    
		this.name = name;     	  							 //사진 파일명(건물사진)
		this.content = content; 							 //txt 파일명(학과정보)

		try {
			jbInit();
		} catch (Exception exception) {
            exception.printStackTrace();
        }
    }

	private void jbInit() throws Exception {
     
		this.setSize(1100, 946);  
		this.setTitle("인문대 2호관");
     
		getContentPane().setLayout(null);

		imgBox = new JLabel(new ImageIcon(Liberal2.class.getResource("인문대학1호관.jpg")));
		imgBox.setBorder(border2);
		imgBox.setBounds(309, 28, 700, 300 );

		jb1.addMouseListener(new jb1Listener());  // "고고문화인류학과"버튼에 마우스 리스너 달기
		jb2.addMouseListener(new jb2Listener());  // "독일학과"버튼에 마우스 리스너 달기
		jb3.addMouseListener(new jb3Listener());  // "사학부"버튼에 마우스 리스너 달기
		
		this.getContentPane().add(jb1);
		this.getContentPane().add(jb2);
		this.getContentPane().add(jb3);
	
    
		// 버튼의 위치 설정
		jb1.setBounds(12, 194, 233, 40);  
		jb2.setBounds(12, 234, 233, 40);
		jb3.setBounds(12, 274, 233, 40);
		
		// 버튼의 테두리 선 넣지않기
		jb1.setBorderPainted(false);  
		jb2.setBorderPainted(false);
		jb3.setBorderPainted(false);
		
		// 버튼의 배경은 하얀색으로 설정
		jb1.setBackground(new Color(255, 255, 255));
		jb2.setBackground(new Color(255, 255, 255));
		jb3.setBackground(new Color(255, 255, 255));
		
		this.getContentPane().add(imgBox);
      
		String str = "", line = null;            
        int temp = 0, num, i = 0, num_line = 0;
        try {
        	
        	BufferedReader br = new BufferedReader(new FileReader(new File(content)));
        	while((line = br.readLine())!= null) {
        		System.out.println(line);
        		
        		jlabel22[i] = new  JLabel();                     //라벨을 배열로 지정
        		jlabel22[i].setForeground(Color.BLUE);           //학과정보 출력 되는 부분
        		
        		jlabel22[i].setText(line);
        		if(i == 0)   //학과명 부분 출력
        		{
        			jlabel22[i].setFont(font3);
        			jlabel22[i].setBounds(300, 350, 720, 25); 
        		}
        		else if(i == 1 || i == 2)  //학과사무실, 전화번호 출력
        		{
        			jlabel22[i].setFont(font2);
        			jlabel22[i].setBounds(300, 350+i*30, 720, 19); 
        		}
        		else   //학과설명 쓰기
        		{
        			jlabel22[i].setFont(font1);
        			jlabel22[i].setBounds(300, 400+i*20, 720, 15); 
        		}
        		this.getContentPane().add(jlabel22[i]);  
        		i++;
        		if(i >10) break;
        	}
        	
        } catch (Exception e) {
        	e.printStackTrace();
        } 
        
		label2 = new JLabel("<html><br>인문대");   //개행문자
		label2.setFont(new Font("MD아트체", Font.BOLD, 23));
		label2.setForeground(new Color(255, 255, 255));
		label2.setOpaque(true);
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setBackground(new Color(0, 188, 212));
		label2.setBounds(12, 10, 233, 148);
		getContentPane().add(label2);
      
		this.setVisible(true);
      
	}  // jbInit 메소드 종료
      
      
	class jb1Listener implements MouseListener {  // "고고문화인류학과" 마우스 리스너
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {
			
			jb1.setBackground(new Color(255, 255, 255));
		}
		public void mousePressed(MouseEvent e) {
			jb1.setBackground(new Color(0, 188, 212));
			Liberal2 lb2 = new Liberal2("인문대학1호관.jpg", "고고문화인류학과.txt");
			lb2.show();
			dispose();
		}
		public void mouseReleased(MouseEvent e) {}
	}  // 내부 클래스 종료
      
	class jb2Listener implements MouseListener {  // "독일학과" 마우스 리스너
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {
			
            jb2.setBackground(new Color(255, 255, 255));
		}
		public void mousePressed(MouseEvent e) {
			jb2.setBackground(new Color(0, 188, 212));
			Liberal2 lb2 = new Liberal2("인문대학1호관.jpg", "독일학과.txt");
			lb2.show();
			dispose();
		}
		public void mouseReleased(MouseEvent e) {}
	}  // 내부 클래스 종료
    
	class jb3Listener implements MouseListener {  // "사학과" 마우스 리스너
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {
			
			jb3.setBackground(new Color(255, 255, 255));
		}
		public void mousePressed(MouseEvent e) {

			jb3.setBackground(new Color(0, 188, 212));
			Liberal2 lb2 = new Liberal2("인문대학1호관.jpg", "사학과.txt");
			lb2.show();
			dispose();
		}
		public void mouseReleased(MouseEvent e) {
		
		}
	}  // 내부 클래스 종료
    

}  // 외부 클래스 종료