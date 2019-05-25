package proj;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class HummanEcology extends JFrame {

	JLabel imgBox, label2;   //imgBox = �ǹ�����, label2 : �а� ��� 
	ImageIcon img;            
	String name, content;     //name = �ǹ����� �̹������ϸ�, content = txt ���ϸ�
	Font font1 = new Font("Dialog", Font.ITALIC, 15);   //�а���
	Font font2 = new Font("Dialog", Font.ITALIC, 19);   //�а��繫��, �а���ȭ��ȣ
	Font font3 = new Font("Dialog", Font.ITALIC, 25);  //�а�����   
	
	JButton jb1 = new JButton("�Ƶ��а�");
	JButton jb2 = new JButton("�Ƿ��а�");
	JButton jb3 = new JButton("�ְ�ȯ���а�");
	JButton jb4 = new JButton("��ǰ�����а�");
  
	
	JPanel jPanel3 = new JPanel();
	Border border1 = BorderFactory.createEtchedBorder(Color.red, new Color(165, 163, 151));
	Border border2 = new TitledBorder(border1, "<  �� ��  >");  
	Border border3 = BorderFactory.createEtchedBorder(Color.white, new Color(165, 163, 151));
	Border border4 = new TitledBorder(border3, "");
	
	public HummanEcology (String name, String content) {
		
		getContentPane().setBackground(Color.WHITE);    
		this.name = name;     	  							 //���� ���ϸ�(�ǹ�����)
		this.content = content; 							 //txt ���ϸ�(�а�����)

		try {
			jbInit();
		} catch (Exception exception) {
            exception.printStackTrace();
        }
    }

	private void jbInit() throws Exception {
     
		this.setSize(1100, 946);  
		this.setTitle("��Ȱ���д���");
     
		getContentPane().setLayout(null);

		imgBox = new JLabel(new ImageIcon(Engineering7.class.getResource("��Ȱ���д� ũ������.jpg")));
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
    
		// ��ư�� ��ġ ����
		jb1.setBounds(12, 194, 233, 40);  
		jb2.setBounds(12, 234, 233, 40);
		jb3.setBounds(12, 274, 233, 40);
		jb4.setBounds(12, 314, 233, 40);

		// ��ư�� �׵θ� �� �����ʱ�
		jb1.setBorderPainted(false);  
		jb2.setBorderPainted(false);
		jb3.setBorderPainted(false);
		jb4.setBorderPainted(false);

		// ��ư�� ����� �Ͼ������ ����
		jb1.setBackground(new Color(255, 255, 255));
		jb2.setBackground(new Color(255, 255, 255));
		jb3.setBackground(new Color(255, 255, 255));
		jb4.setBackground(new Color(255, 255, 255));
  
		this.getContentPane().add(imgBox);
      
		label2 = new JLabel("��Ȱ���д���");   //���๮��
		label2.setFont(new Font("MD��Ʈü", Font.BOLD, 23));
		label2.setForeground(new Color(255, 255, 255));
		label2.setOpaque(true);
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setBackground(new Color(0, 188, 212));
		label2.setBounds(12, 10, 233, 148);
		getContentPane().add(label2);
      
		this.setVisible(true);
      
	}  // jbInit �޼ҵ� ����
      
	
      
	class jb1Listener implements MouseListener {  // "�Ƶ��а�" ���콺 ������
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {
			
			jb1.setBackground(new Color(255, 255, 255));
		}
		public void mousePressed(MouseEvent e) {
			jb4.setBackground(new Color(0, 188, 212));
			HummanEcology ec = new HummanEcology("��Ȱ���д� ũ������.jpg", "�Ƶ��а�.txt");
			ec.show();
			dispose();
		}
		public void mouseReleased(MouseEvent e) {}
	}  // ���� Ŭ���� ����
      
	class jb2Listener implements MouseListener {  // "�Ƿ��а�" ���콺 ������
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {
			
            jb2.setBackground(new Color(255, 255, 255));
		}
		public void mousePressed(MouseEvent e) {
			jb2.setBackground(new Color(0, 188, 212));
			HummanEcology ec = new HummanEcology("��Ȱ���д� ũ������.jpg", "�Ƿ��а�.txt");
			ec.show();
			dispose();
		}
		public void mouseReleased(MouseEvent e) {}
	}  // ���� Ŭ���� ����
    
	class jb3Listener implements MouseListener {  // "�ְ�ȯ���а�" ���콺 ������
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {
			
			jb3.setBackground(new Color(255, 255, 255));
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {
			jb3.setBackground(new Color(0, 188, 212));
			HummanEcology ec = new HummanEcology("��Ȱ���д� ũ������.jpg", "�ְ�ȯ���а�.txt");
			ec.show();
			dispose();
		}
	}  // ���� Ŭ���� ����
    
	class jb4Listener implements MouseListener {  // "��ǰ�����а�" ���콺 ������
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {
			
			jb4.setBackground(new Color(255, 255, 255));
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {
			jb4.setBackground(new Color(0, 188, 212));
			HummanEcology ec = new HummanEcology("��Ȱ���д� ũ������.jpg", "��ǰ�����а�.txt");
			ec.show();
			dispose();
		}
	} // ���� Ŭ���� ����
}  // �ܺ� Ŭ���� ����