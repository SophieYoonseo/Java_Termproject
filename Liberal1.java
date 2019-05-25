package proj;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.*;
import javax.swing.border.*;

public class Liberal1 extends JFrame {
	
	JLabel imgBox, label2;   //imgBox = �ǹ�����, label2 : �а� ��� 
	String name, content;     //name = �ǹ����� �̹������ϸ�, content = txt ���ϸ�
	Font font1 = new Font("Dialog", Font.ITALIC, 15);   //�а���
	Font font2 = new Font("Dialog", Font.ITALIC, 19);   //�а��繫��, �а���ȭ��ȣ
	Font font3 = new Font("Dialog", Font.ITALIC, 25);  //�а�����
	
	JLabel jlabel22[] = new JLabel[20] ; //�а����� �迭ũ��
	   
	JButton jb1 = new JButton("������а�");
	JButton jb2 = new JButton("���������а�");
	JButton jb3 = new JButton("������.�߳����а�");
	JButton jb4 = new JButton("������а�");
	JButton jb5 = new JButton("�Ϻ��а�");
	JButton jb6 = new JButton("�߾��߹��а�");
	JButton jb7 = new JButton("ö�а�");
	JButton jb8 = new JButton("������.������ī�а�");
     
	JPanel jPanel3 = new JPanel();
	Border border1 = BorderFactory.createEtchedBorder(Color.red, new Color(165, 163, 151));
	Border border2 = new TitledBorder(border1, "<  �� ��  >");  
	Border border3 = BorderFactory.createEtchedBorder(Color.white, new Color(165, 163, 151));
	Border border4 = new TitledBorder(border3, "");
	
    
	public Liberal1 (String name, String content) {
		
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
		this.setTitle("�ι���ȸ��");
     
		getContentPane().setLayout(null);

		imgBox = new JLabel(new ImageIcon(Liberal1.class.getResource("�ι���ȸ��.jpg")));
		imgBox.setBorder(border2);
		imgBox.setBounds(309, 28, 700, 300 );

		jb1.addMouseListener(new jb1Listener());  
		jb2.addMouseListener(new jb2Listener());  
		jb3.addMouseListener(new jb3Listener());  
		jb4.addMouseListener(new jb4Listener());  
		jb5.addMouseListener(new jb4Listener());
		jb6.addMouseListener(new jb4Listener());
		jb7.addMouseListener(new jb4Listener());
		jb8.addMouseListener(new jb4Listener());
		
		this.getContentPane().add(jb1);
		this.getContentPane().add(jb2);
		this.getContentPane().add(jb3);
		this.getContentPane().add(jb4);
		this.getContentPane().add(jb5);
		this.getContentPane().add(jb6);
		this.getContentPane().add(jb7);
		this.getContentPane().add(jb8);
    
		// ��ư�� ��ġ ����
		jb1.setBounds(12, 194, 233, 40);  
		jb2.setBounds(12, 234, 233, 40);
		jb3.setBounds(12, 274, 233, 40);
		jb4.setBounds(12, 314, 233, 40);
		jb5.setBounds(12, 314, 233, 40);
		jb6.setBounds(12, 314, 233, 40);
		jb7.setBounds(12, 314, 233, 40);
		jb8.setBounds(12, 314, 233, 40);

		// ��ư�� �׵θ� �� �����ʱ�
		jb1.setBorderPainted(false);  
		jb2.setBorderPainted(false);
		jb3.setBorderPainted(false);
		jb4.setBorderPainted(false);
		jb5.setBorderPainted(false);
		jb6.setBorderPainted(false);
		jb7.setBorderPainted(false);
		jb8.setBorderPainted(false);

		// ��ư�� ����� �Ͼ������ ����
		jb1.setBackground(new Color(255, 255, 255));
		jb2.setBackground(new Color(255, 255, 255));
		jb3.setBackground(new Color(255, 255, 255));
		jb4.setBackground(new Color(255, 255, 255));
		jb5.setBackground(new Color(255, 255, 255));
		jb6.setBackground(new Color(255, 255, 255));
		jb7.setBackground(new Color(255, 255, 255));
		jb8.setBackground(new Color(255, 255, 255));
  
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
		label2 = new JLabel("�ι���ȸ��");   //���๮��
		label2.setFont(new Font("MD��Ʈü", Font.BOLD, 23));
		label2.setForeground(new Color(255, 255, 255));
		label2.setOpaque(true);
		label2.setHorizontalAlignment(JLabel.CENTER);
		label2.setBackground(new Color(0, 188, 212));
		label2.setBounds(12, 10, 233, 148);
		getContentPane().add(label2);
      
		this.setVisible(true);
      
	}  // jbInit �޼ҵ� ����
      

      
	class jb1Listener implements MouseListener { 
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {
			
			jb1.setBackground(new Color(255, 255, 255));
		}
		public void mousePressed(MouseEvent e) {
			jb1.setBackground(new Color(0, 188, 212));
			Liberal1 lb1 = new Liberal1("�ι���ȸ��.jpg", "������а�.txt");
			lb1.show();
			dispose();
		}
		public void mouseReleased(MouseEvent e) {}
	}  // ���� Ŭ���� ����
      
	class jb2Listener implements MouseListener { 
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {
			
            jb2.setBackground(new Color(255, 255, 255));
		}
		public void mousePressed(MouseEvent e) {
			jb2.setBackground(new Color(0, 188, 212));
			Liberal1 lb1 = new Liberal1("�ι���ȸ��.jpg", "���������а�.txt");
			lb1.show();
			dispose();
		}
		public void mouseReleased(MouseEvent e) {}
	}  // ���� Ŭ���� ����
    
	class jb3Listener implements MouseListener { 
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {
			
			jb3.setBackground(new Color(255, 255, 255));
		}
		public void mousePressed(MouseEvent e) {
			jb3.setBackground(new Color(0, 188, 212));
			Liberal1 lb1 = new Liberal1("�ι���ȸ��.jpg", "�������߳����а�.txt");
			lb1.show();
			dispose();
		}
		public void mouseReleased(MouseEvent e) {
			
		}
	}  // ���� Ŭ���� ����
    
	class jb4Listener implements MouseListener { 
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {
			
			jb4.setBackground(new Color(255, 255, 255));
		}
		public void mousePressed(MouseEvent e) {

			jb4.setBackground(new Color(0, 188, 212));
			Liberal1 lb1 = new Liberal1("�ι���ȸ��.jpg", "������а�.txt");
			lb1.show();
			dispose();
		}
		public void mouseReleased(MouseEvent e) {
			
		}
	} // ���� Ŭ���� ����
	class jb5Listener implements MouseListener { 
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {
			
			jb5.setBackground(new Color(255, 255, 255));
		}
		public void mousePressed(MouseEvent e) {

			jb5.setBackground(new Color(0, 188, 212));
			Liberal1 lb1 = new Liberal1("�ι���ȸ��.jpg", "�Ϻ��а�.txt");
			lb1.show();
			dispose();
		}
		public void mouseReleased(MouseEvent e) {
			
		}
	} // ���� Ŭ���� ����
	class jb6Listener implements MouseListener { 
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {
			
			jb6.setBackground(new Color(255, 255, 255));
		}
		public void mousePressed(MouseEvent e) {
			jb6.setBackground(new Color(0, 188, 212));
			Liberal1 lb1 = new Liberal1("�ι���ȸ��.jpg", "�߾��߹��а�.txt");
			lb1.show();
			dispose();
		}
		public void mouseReleased(MouseEvent e) {
			

		}
	} // ���� Ŭ���� ����
	class jb7Listener implements MouseListener { 
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {
			
			jb7.setBackground(new Color(255, 255, 255));
		}
		public void mousePressed(MouseEvent e) {

			jb7.setBackground(new Color(0, 188, 212));
			Liberal1 lb1 = new Liberal1("�ι���ȸ��.jpg", "ö�а�.txt");
			lb1.show();
			dispose();
		}
		public void mouseReleased(MouseEvent e) {
			
		}
	} // ���� Ŭ���� ����
	class jb8Listener implements MouseListener { 
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {
			
			jb8.setBackground(new Color(255, 255, 255));
		}
		public void mousePressed(MouseEvent e) {
			jb8.setBackground(new Color(0, 188, 212));
			Liberal1 lb1 = new Liberal1("�ι���ȸ��.jpg", "������������ī�а�.txt");
			lb1.show();
			dispose();
		}
		public void mouseReleased(MouseEvent e) {
			
			
		}
	} // ���� Ŭ���� ����
}  // �ܺ� Ŭ���� ����