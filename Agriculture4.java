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

    JLabel imgBox, label2;   //imgBox = 건물사진, label2 : 학과 배너 
      String name, content;     //name = 건물사진 이미지파일명, content = txt 파일명
      Font font1 = new Font("Dialog", Font.ITALIC, 15);   //학과명
      Font font2 = new Font("Dialog", Font.ITALIC, 19);   //학과사무실, 학과전화번호
      Font font3 = new Font("Dialog", Font.ITALIC, 25);  //학과정보

      JLabel jlabel22[] = new JLabel[20] ; //학과정보 배열크기

      JButton jb1 = new JButton("농경제유통학부");  //버튼으로 옆에 배너 만들기
      JButton jb2 = new JButton("목재응용과학과");
      JButton jb3 = new JButton("생물산업기계공학과");
      JButton jb4 = new JButton("식품공학과");
     
      Border border1 = BorderFactory.createEtchedBorder(Color.red, new Color(165, 163, 151));  //건물외관 boundary
      Border border2 = new TitledBorder(border1, "< 건 물 외 관  >");  
      Border border3 = BorderFactory.createEtchedBorder(Color.white, new Color(165, 163, 151));
      Border border4 = new TitledBorder(border3, "");
         
      public Agriculture4 (String name, String content) {
  		
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
         
         Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
         double w = screen.getWidth() ; double h = screen.getHeight(); // 화면크기 조정
          
         this.setSize(1100, 730);     //창 크기
         this.setTitle("농대4호관");
          
         getContentPane().setLayout(null);   


         imgBox = new JLabel(new ImageIcon(Agriculture4.class.getResource(name)));
         imgBox.setBorder(border2);
         imgBox.setBounds(308, 28, 700, 300 );

         jb1.addMouseListener(new jb1Listener());                  //버튼 리스너
           jb2.addMouseListener(new jb2Listener());
           jb3.addMouseListener(new jb3Listener());
           jb4.addMouseListener(new jb4Listener());
           
           
           this.getContentPane().add(jb1);                        //버튼을 frame에 붙히기
           this.getContentPane().add(jb2);
           this.getContentPane().add(jb3);
           this.getContentPane().add(jb4);
          
           
           jb1.setBounds(12, 194, 233, 40);                        //버튼 위치 및 크기 지정
           jb2.setBounds(12, 234, 233, 40);
           jb3.setBounds(12, 274, 233, 40);
           jb4.setBounds(12, 314, 233, 40);
           
           
           jb1.setBorderPainted(false);                               //버튼 boundary 지우기
           jb2.setBorderPainted(false);
           jb3.setBorderPainted(false);
           jb4.setBorderPainted(false);
            
           
           jb1.setBackground(new Color(255, 255, 255));                 //버튼 색깔
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
           
           label2 = new JLabel("농대");                             //개행문자, 배너 
           label2.setFont(new Font("MD아트체", Font.BOLD, 23));
           label2.setForeground(new Color(255, 255, 255));
           label2.setOpaque(true);
           label2.setHorizontalAlignment(JLabel.CENTER);           //가운데정렬
           label2.setBackground(new Color(0, 188, 212));
           label2.setBounds(30, 30, 215, 130);
           this.getContentPane().add(label2);
           
           this.setVisible(true);

           
           }  // jbInit 메소드 종료
      
      //버튼리스너
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
            Agriculture4 agi0 = new Agriculture4("농대4호관.jpg", "농경제유통학부.txt");    //Agriculture4 메소드 호출
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
            Agriculture4 agi0 = new Agriculture4("농대4호관.jpg", "목재응용과학과.txt");
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
            Agriculture4 agi0 = new Agriculture4("농대4호관.jpg", "생물산업기계공학과.txt");
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
            Agriculture4 agi0 = new Agriculture4("농대4호관.jpg", "식품공학과.txt");
            agi0.show();
            dispose();
         }

         @Override
         public void mouseReleased(MouseEvent e) { }
              
      }
      
}  // 외부 클래스 종료