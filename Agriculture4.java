package proj;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Agriculture4 extends JFrame {

    JLabel imgBox, label2;   //imgBox = �ǹ�����, label2 : �а� ��� 
      String name, content;     //name = �ǹ����� �̹������ϸ�, content = txt ���ϸ�
      Font font1 = new Font("Dialog", Font.ITALIC, 15);   //�а���
      Font font2 = new Font("Dialog", Font.ITALIC, 19);   //�а��繫��, �а���ȭ��ȣ
      Font font3 = new Font("Dialog", Font.ITALIC, 25);  //�а�����

      JLabel jlabel22[] = new JLabel[20] ; //�а����� �迭ũ��

      JButton jb1 = new JButton("����������к�");  //��ư���� ���� ��� �����
      JButton jb2 = new JButton("����������а�");
      JButton jb3 = new JButton("������������а�");
      JButton jb4 = new JButton("��ǰ���а�");
     
      Border border1 = BorderFactory.createEtchedBorder(Color.red, new Color(165, 163, 151));  //�ǹ��ܰ� boundary
      Border border2 = new TitledBorder(border1, "< �� �� �� ��  >");  
      Border border3 = BorderFactory.createEtchedBorder(Color.white, new Color(165, 163, 151));
      Border border4 = new TitledBorder(border3, "");
         
      public Agriculture4 (String name, String content) {
  		
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
         
         Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
         double w = screen.getWidth() ; double h = screen.getHeight(); // ȭ��ũ�� ����
          
         this.setSize(1100, 730);     //â ũ��
         this.setTitle("���4ȣ��");
          
         getContentPane().setLayout(null);   


         imgBox = new JLabel(new ImageIcon(Agriculture4.class.getResource(name)));
         imgBox.setBorder(border2);
         imgBox.setBounds(308, 28, 700, 300 );

         jb1.addMouseListener(new jb1Listener());                  //��ư ������
           jb2.addMouseListener(new jb2Listener());
           jb3.addMouseListener(new jb3Listener());
           jb4.addMouseListener(new jb4Listener());
           
           
           this.getContentPane().add(jb1);                        //��ư�� frame�� ������
           this.getContentPane().add(jb2);
           this.getContentPane().add(jb3);
           this.getContentPane().add(jb4);
          
           
           jb1.setBounds(12, 194, 233, 40);                        //��ư ��ġ �� ũ�� ����
           jb2.setBounds(12, 234, 233, 40);
           jb3.setBounds(12, 274, 233, 40);
           jb4.setBounds(12, 314, 233, 40);
           
           
           jb1.setBorderPainted(false);                               //��ư boundary �����
           jb2.setBorderPainted(false);
           jb3.setBorderPainted(false);
           jb4.setBorderPainted(false);
            
           
           jb1.setBackground(new Color(255, 255, 255));                 //��ư ����
           jb2.setBackground(new Color(255, 255, 255));
           jb3.setBackground(new Color(255, 255, 255));
           jb4.setBackground(new Color(255, 255, 255));
          

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
           
           label2 = new JLabel("���");                             //���๮��, ��� 
           label2.setFont(new Font("MD��Ʈü", Font.BOLD, 23));
           label2.setForeground(new Color(255, 255, 255));
           label2.setOpaque(true);
           label2.setHorizontalAlignment(JLabel.CENTER);           //�������
           label2.setBackground(new Color(0, 188, 212));
           label2.setBounds(30, 30, 215, 130);
           this.getContentPane().add(label2);
           
           this.setVisible(true);

           
           }  // jbInit �޼ҵ� ����
      
      //��ư������
      class jb1Listener implements MouseListener {
         
         
         @Override
         public void mouseClicked(MouseEvent e) {}

         @Override
         public void mouseEntered(MouseEvent e) {}

         @Override
         public void mouseExited(MouseEvent e) {
            
            jb1.setBackground(new Color(255, 255, 255));
            
         
         }

         @Override
         public void mousePressed(MouseEvent e) {
         
            jb1.setBackground(new Color(0, 188, 212));
            Agriculture4 agi0 = new Agriculture4("���4ȣ��.jpg", "����������к�.txt");    //Agriculture4 �޼ҵ� ȣ��
            agi0.show();
            dispose();                                                          
         }

         @Override
         public void mouseReleased(MouseEvent e) { }
              
      }
           
      class jb2Listener implements MouseListener {
         
       
         @Override
         public void mouseClicked(MouseEvent e) { }

         @Override
         public void mouseEntered(MouseEvent e) { }

         @Override
         public void mouseExited(MouseEvent e) {
      
            jb2.setBackground(new Color(255, 255, 255));
         
         }
       
         @Override
         public void mousePressed(MouseEvent e) {

            jb2.setBackground(new Color(0, 188, 212));
            Agriculture4 agi0 = new Agriculture4("���4ȣ��.jpg", "����������а�.txt");
            agi0.show();
            dispose();
         }

         @Override
         public void mouseReleased(MouseEvent e) { }
         
      }
      
      class jb3Listener implements MouseListener {
         
         
         @Override
         public void mouseClicked(MouseEvent e) { }

         @Override
         public void mouseEntered(MouseEvent e) { }

         @Override
         public void mouseExited(MouseEvent e) {

             jb3.setBackground(new Color(255, 255, 255));

          }

         @Override
         public void mousePressed(MouseEvent e) {
               
            jb3.setBackground(new Color(0, 188, 212));
            Agriculture4 agi0 = new Agriculture4("���4ȣ��.jpg", "������������а�.txt");
            agi0.show();
            dispose();
         }

         @Override
         public void mouseReleased(MouseEvent e) {    }
              
      }
      
      class jb4Listener implements MouseListener {
         
         
         @Override
         public void mouseClicked(MouseEvent e) { }

         @Override
         public void mouseEntered(MouseEvent e) { }

         @Override
         public void mouseExited(MouseEvent e) {
            
            jb4.setBackground(new Color(255, 255, 255));

         }

         @Override
         public void mousePressed(MouseEvent e) {
            jb4.setBackground(new Color(0, 188, 212));
            Agriculture4 agi0 = new Agriculture4("���4ȣ��.jpg", "��ǰ���а�.txt");
            agi0.show();
            dispose();
         }

         @Override
         public void mouseReleased(MouseEvent e) { }
              
      }
      
}  // �ܺ� Ŭ���� ����