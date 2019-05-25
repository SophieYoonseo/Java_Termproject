package proj;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.*;
import javax.swing.border.*;

public class Science3 extends JFrame {

	JLabel imgBox, label2;   //imgBox = �ǹ�����, label2 : �а� ��� 
	String name, content;     //name = �ǹ����� �̹������ϸ�, content = txt ���ϸ�
	Font font1 = new Font("Dialog", Font.ITALIC, 15);   //�а���
	Font font2 = new Font("Dialog", Font.ITALIC, 19);   //�а��繫��, �а���ȭ��ȣ
	Font font3 = new Font("Dialog", Font.ITALIC, 25);  //�а�����
	
	JLabel jlabel22[] = new JLabel[20] ; //�а����� �迭ũ��
	
	JButton jb1 = new JButton("�����а�");
	JButton jb2 = new JButton("�ݵ�ü���б���а�");
	JButton jb3 = new JButton("���������а�");
     
	JPanel jPanel3 = new JPanel();
	Border border1 = BorderFactory.createEtchedBorder(Color.red, new Color(165, 163, 151));
	Border border2 = new TitledBorder(border1, "<  �� ��  >");  
	Border border3 = BorderFactory.createEtchedBorder(Color.white, new Color(165, 163, 151));
	Border border4 = new TitledBorder(border3, "");
	
    
	public Science3 (String name, String content) {
		
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
		this.setTitle("�ڿ����д��� 3ȣ��");
     
		getContentPane().setLayout(null);

		imgBox = new JLabel(new ImageIcon(Science3.class.getResource("�ڿ��� 3ȣ��.jpg")));
		imgBox.setBorder(border2);
		imgBox.setBounds(309, 28, 700, 300 );


		jb1.addMouseListener(new jb1Listener());  // "�����а�"��ư�� ���콺 ������ �ޱ�
		jb2.addMouseListener(new jb2Listener());  // "�ݵ�ü���б���а�"��ư�� ���콺 ������ �ޱ�
		jb3.addMouseListener(new jb3Listener());  // "���������а�"��ư�� ���콺 ������ �ޱ�
  
		this.getContentPane().add(jb1);
		this.getContentPane().add(jb2);
		this.getContentPane().add(jb3);
    
		// ��ư�� ��ġ ����
		jb1.setBounds(12, 194, 233, 40);  
		jb2.setBounds(12, 234, 233, 40);
		jb3.setBounds(12, 274, 233, 40);

		// ��ư�� �׵θ� �� �����ʱ�
		jb1.setBorderPainted(false);  
		jb2.setBorderPainted(false);
		jb3.setBorderPainted(false);

		// ��ư�� ����� �Ͼ������ ����
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
        		
        		jlabel22[i] = new  JLabel();                     //���� �迭�� ����
        		jlabel22[i].setForeground(Color.BLUE);           //�а����� ��� �Ǵ� �κ�
        		
        		jlabel22[i].setText(line);
        		if(i == 0)   //�а��� �κ� ���
        		{
        			jlabel22[i].setFont(font3);
        			jlabel22[i].setBounds(300, 350, 720, 25); 
        		}
        		else if(i == 1 || i == 2)  //�а��繫��, ��ȭ��ȣ ���
        		{
        			jlabel22[i].setFont(font2);
        			jlabel22[i].setBounds(300, 350+i*30, 720, 19); 
        		}
        		else   //�а����� ����
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
              
		label2 = new JLabel("<html><br>�ڿ����д�");   //���๮��
		label2.setFont(new Font("MD��Ʈü", Font.BOLD, 23));
		label2.setForeground(new Color(255, 255, 255));
		label2.setOpaque(true);
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setBackground(new Color(0, 188, 212));
		label2.setBounds(12, 10, 233, 148);
		getContentPane().add(label2);
      
		this.setVisible(true);
      
	}  // jbInit �޼ҵ� ����
      

	class jb1Listener implements MouseListener {  // "�����а�" ���콺 ������
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {
			
			jb1.setBackground(new Color(255, 255, 255));
		}
		public void mousePressed(MouseEvent e) {
			
			jb1.setBackground(new Color(0, 188, 212));
			Science3 sc3 = new Science3("�ڿ��� 3ȣ��.jpg", "�����а�.txt");
			sc3.show();
			dispose();
		}
		public void mouseReleased(MouseEvent e) {}
	}  // ���� Ŭ���� ����
      
	class jb2Listener implements MouseListener {  // "�ݵ�ü���б���а�" ���콺 ������
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {
			
            jb2.setBackground(new Color(255, 255, 255));
		}
		public void mousePressed(MouseEvent e) {
			jb2.setBackground(new Color(0, 188, 212));
			Science3 sc3 = new Science3("�ڿ��� 3ȣ��.jpg", "�ݵ�ü���б���а�.txt");
			sc3.show();
			dispose();
		}
		public void mouseReleased(MouseEvent e) {}
	}  // ���� Ŭ���� ����
    
	class jb3Listener implements MouseListener {  // "���������а�" ���콺 ������
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {
			
			jb3.setBackground(new Color(255, 255, 255));
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {
			jb3.setBackground(new Color(0, 188, 212));
			Science3 sc3 = new Science3("�ڿ��� 3ȣ��.jpg", "���������а�.txt");
			sc3.show();
			dispose();
		}
	}  // ���� Ŭ���� ����
}  // �ܺ� Ŭ���� ����