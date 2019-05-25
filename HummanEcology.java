package proj;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class HummanEcology extends JFrame {

	JLabel imgBox, label2;   //imgBox = 건물사진, label2 : 학과 배너 
	ImageIcon img;            
	String name, content;     //name = 건물사진 이미지파일명, content = txt 파일명
	Font font1 = new Font("Dialog", Font.ITALIC, 15);   //학과명
	Font font2 = new Font("Dialog", Font.ITALIC, 19);   //학과사무실, 학과전화번호
	Font font3 = new Font("Dialog", Font.ITALIC, 25);  //학과정보   
	
	JButton jb1 = new JButton("아동학과");
	JButton jb2 = new JButton("의류학과");
	JButton jb3 = new JButton("주거환경학과");
	JButton jb4 = new JButton("식품영양학과");
  
	
	JPanel jPanel3 = new JPanel();
	Border border1 = BorderFactory.createEtchedBorder(Color.red, new Color(165, 163, 151));
	Border border2 = new TitledBorder(border1, "<  사 진  >");  
	Border border3 = BorderFactory.createEtchedBorder(Color.white, new Color(165, 163, 151));
	Border border4 = new TitledBorder(border3, "");
	
	public HummanEcology (String name, String content) {
		
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
		this.setTitle("생활과학대학");
     
		getContentPane().setLayout(null);

		imgBox = new JLabel(new ImageIcon(Engineering7.class.getResource("생활과학대 크기조정.jpg")));
		imgBox.setBorder(border2);
		imgBox.setBounds(309, 28, 700, 300 );

		jb1.addMouseListener(new jb1Listener()); 
		jb2.addMouseListener(new jb2Listener());  
		jb3.addMouseListener(new jb3Listener());  
		jb4.addMouseListener(new jb4Listener()); 
  
		this.getContentPane().add(jb1);
		this.getContentPane().add(jb2);
		this.getContentPane().add(jb3);
		this.getContentPane().add(jb4);
    
		// 버튼의 위치 설정
		jb1.setBounds(12, 194, 233, 40);  
		jb2.setBounds(12, 234, 233, 40);
		jb3.setBounds(12, 274, 233, 40);
		jb4.setBounds(12, 314, 233, 40);

		// 버튼의 테두리 선 넣지않기
		jb1.setBorderPainted(false);  
		jb2.setBorderPainted(false);
		jb3.setBorderPainted(false);
		jb4.setBorderPainted(false);

		// 버튼의 배경은 하얀색으로 설정
		jb1.setBackground(new Color(255, 255, 255));
		jb2.setBackground(new Color(255, 255, 255));
		jb3.setBackground(new Color(255, 255, 255));
		jb4.setBackground(new Color(255, 255, 255));
  
		this.getContentPane().add(imgBox);
      
		label2 = new JLabel("생활과학대학");   //개행문자
		label2.setFont(new Font("MD아트체", Font.BOLD, 23));
		label2.setForeground(new Color(255, 255, 255));
		label2.setOpaque(true);
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setBackground(new Color(0, 188, 212));
		label2.setBounds(12, 10, 233, 148);
		getContentPane().add(label2);
      
		this.setVisible(true);
      
	}  // jbInit 메소드 종료
      
	
      
	class jb1Listener implements MouseListener {  // "아동학과" 마우스 리스너
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {
			
			jb1.setBackground(new Color(255, 255, 255));
		}
		public void mousePressed(MouseEvent e) {
			jb4.setBackground(new Color(0, 188, 212));
			HummanEcology ec = new HummanEcology("생활과학대 크기조정.jpg", "아동학과.txt");
			ec.show();
			dispose();
		}
		public void mouseReleased(MouseEvent e) {}
	}  // 내부 클래스 종료
      
	class jb2Listener implements MouseListener {  // "의류학과" 마우스 리스너
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {
			
            jb2.setBackground(new Color(255, 255, 255));
		}
		public void mousePressed(MouseEvent e) {
			jb2.setBackground(new Color(0, 188, 212));
			HummanEcology ec = new HummanEcology("생활과학대 크기조정.jpg", "의류학과.txt");
			ec.show();
			dispose();
		}
		public void mouseReleased(MouseEvent e) {}
	}  // 내부 클래스 종료
    
	class jb3Listener implements MouseListener {  // "주거환경학과" 마우스 리스너
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {
			
			jb3.setBackground(new Color(255, 255, 255));
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {
			jb3.setBackground(new Color(0, 188, 212));
			HummanEcology ec = new HummanEcology("생활과학대 크기조정.jpg", "주거환경학과.txt");
			ec.show();
			dispose();
		}
	}  // 내부 클래스 종료
    
	class jb4Listener implements MouseListener {  // "식품영양학과" 마우스 리스너
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {
			
			jb4.setBackground(new Color(255, 255, 255));
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {
			jb4.setBackground(new Color(0, 188, 212));
			HummanEcology ec = new HummanEcology("생활과학대 크기조정.jpg", "식품영양학과.txt");
			ec.show();
			dispose();
		}
	} // 내부 클래스 종료
}  // 외부 클래스 종료