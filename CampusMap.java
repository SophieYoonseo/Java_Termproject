package proj;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CampusMap extends JFrame implements MouseListener {
   private JLabel statusLabel;
   private JButton engineering1;
   private JButton engineering7;
   
   public CampusMap() {
      
      this.setTitle("CampusMap 샘플");

      Container c = this.getContentPane();

      this.setSize(1819,1088);
      this.getContentPane().setLayout(null);
            
      // 하단 상태값 라벨
      statusLabel = new JLabel();
      statusLabel.setBounds(0, 0, 1801, 1041);
      //ImageIcon cam = new ImageIcon(CampusMap.class.getResource("/proj/\uBC30\uACBD \uC9C0\uB3C4.jpg"));
      statusLabel.setIcon(new ImageIcon(CampusMap.class.getResource("CampusMap1.jpg")));
      
      statusLabel.setForeground(new Color(0, 0, 0));
      this.getContentPane().add(statusLabel);

      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
      this.addMouseListener(this);
      
   }  // CampusMap 메소드 종료

   public static void main(String[] args) {
      CampusMap awtControlDemo = new CampusMap();
      //awtControlDemo.showButton();
   }

   
   
   
   @Override
   public void mouseClicked(MouseEvent e) {
   
      int xx = Integer.valueOf(e.getX()); 
      int yy = Integer.valueOf(e.getY());

   // 공과대학
      if((xx >= 1021 && xx < 1143) && (yy>=545 && yy < 580)) {
			Engineering1 eng1 = new Engineering1("2-1-2.png", "IT응용시스템공학과.txt");
			eng1.show();
		}
		
		if((xx >= 925 && xx < 1009) && (yy>=557 && yy < 620)) {
			Engineering2 eng2 = new Engineering2("2-2.png", "자원에너지공학과.txt");
			eng2.show();
		}
		if((xx >= 1106 && xx < 1163) && (yy>=502 && yy < 533)) {
			Engineering3 eng3 = new Engineering3("2-3-2.png", "기계설계공학부.txt");
			//eng3.show();
		}
		if((xx >= 930 && xx < 1057) && (yy>=501 && yy < 533)) {
			Engineering4 eng4 = new Engineering4("2-4-2.png", "기계시스템공학부.txt");
		}
		if((xx >= 854 && xx < 920) && (yy>= 519 && yy < 577)) {
			Engineering5 eng5 = new Engineering5("2-5.png", "소프트웨어공학과.txt");
		}
		if((xx >= 1165 && xx < 1251) && (yy>=462 && yy < 513)) {
			Engineering6 eng6 = new Engineering6("2-6.png", "산업정보시스템공학부.txt");
		}
		if((xx >= 1269 && xx < 1377) && (yy>=508 && yy < 557)) {
			Engineering7 eng7 = new Engineering7("2-8.png", "컴퓨터공학부.txt");
		}
		if((xx >= 1041 && xx < 1101) && (yy>=443 && yy < 492)) {
			Engineering9 eng9 = new Engineering9("2-9-2.png", "항공우주공학과.txt");
		}
		
   		
   		// 자연과학대학
   		if((xx >= 769 && xx < 848) && (yy>=541 && yy < 590)) {  // 자연대 본관
   			Science0 science0 = new Science0("자연대본관.jpg", "수학과.txt");
   			science0.show();
   		}
   		if((xx >= 802 && xx < 923) && (yy>=785 && yy < 847)) {  // 자연대 1호관
   			Science1 science1 = new Science1("자연대1호관.jpg", "화학과.txt");
   			science1.show();
   		}
   		if((xx >= 564 && xx < 678) && (yy>=854 && yy < 906)) {  // 자연대 2호관
   			Science2 science2 = new Science2("자연대2호관.jpg", "생명과학과.txt");
   			science2.show();
   		}
   		if((xx >= 786 && xx < 861) && (yy>=596 && yy < 630)) {  // 자연대 3호관
   			Science3 science3 = new Science3("자연대 3호관.jpg", "반도체과학기술학과.txt");
   			science3.show();
   		}
   		if((xx >= 863 && xx < 925) && (yy>=604 && yy < 643)) {  // 자연대 4호관
   			Science4 science4 = new Science4("자연대 4호관.jpg", "분자생물학과.txt");
   			science4.show();
   		}
   		if((xx >= 924 && xx < 1010) && (yy>=629 && yy < 665)) {  // 자연대 5호관
   			Science5 science5 = new Science5("자연대 5호관.jpg", "물리학과.txt");
   			science5.show();
   		}
   		
   		// 상과대학
   		if((xx >= 1514 && xx < 1599) && (yy>=530 && yy < 581)) {  // 상대2호관
   			Commerce2 commerce2 = new Commerce2("상대2호관.jpg", "경제학부.txt");
   			commerce2.show();
   		}
   		
   		
   		// 생활과학대학
   		if((xx >= 1611 && xx < 1709) && (yy>=772 && yy < 825)) {
   			HummanEcology human = new HummanEcology("생활과학대 크기조정.jpg", "의류학과.txt");
   			human.show();
   		}
   		
   		// 인문사회관
   		if((xx >= 1662 && xx < 1761) && (yy>=686 && yy < 736)) { 
   			Liberal1 liberal1 = new Liberal1("인문사회관.jpg", "일본학과.txt");
   			liberal1.show();
   		}
   		
   		// 인문대학
   		if((xx >= 1375 && xx < 1445) && (yy>=657 && yy < 692)) {  // 인문대학 2호관
   			Liberal2 liberal2 = new Liberal2("인문대학1호관.jpg", "독일학과.txt");
   			liberal2.show();
   		}
   		
   		// 농업생명과학대학
   		if((xx >= 832 && xx < 944) && (yy>=369 && yy < 412)) {  // 농대 본관
   			Agriculture0 agriculture0 = new Agriculture0("농대본관.jpg", "산림환경과학과.txt");
   			agriculture0.show();
   		}
   		if((xx >= 622 && xx < 722) && (yy>=441 && yy < 478)) {  // 농대 1호관
   			Agriculture1 agriculture1 = new Agriculture1("농대1호관.jpg", "농경제유통학부.txt");
   			agriculture1.show();
   		}
   		if((xx >= 721 && xx < 824) && (yy>=412 && yy < 453)) {  // 농대 2호관
   			Agriculture2 agriculture2 = new Agriculture2("농대2호관.jpg", "생물환경화학과.txt");
   			agriculture2.show();
   		}
   		if((xx >= 1041 && xx < 1135) && (yy>=367 && yy < 401)) {  // 농대 3호관
   			Agriculture3 agriculture3 = new Agriculture3("농대3호관.jpg", "농생물학과.txt");
   			agriculture3.show();
   		}
   		if((xx >= 1139 && xx < 1220) && (yy>=351 && yy < 384)) {  // 농대 4호관
   			Agriculture4 agriculture4 = new Agriculture4("농대4호관.jpg", "생물산업기계공학과.txt");
   			agriculture4.show();
   		}
   		
   		// 사범대학
   		if((xx >= 1514 && xx < 1600) && (yy>=805 && yy < 860)) {  // 사범대 본관
   			Education1 education1 = new Education1("사범대 과학관.jpg", "국어교육과.txt");
   			education1.show();
   		}
   		if((xx >= 1021 && xx < 1085) && (yy>=658 && yy < 722)) {  // 진수당(사범대) 교육연구동
   			Education2 education2 = new Education2("사범대 예체능관.jpg", "역사교육과.txt");
   			education2.show();
   		}
   		if((xx >= 809 && xx < 945) && (yy>=708 && yy < 759)) {  // 사범대 과학관
   			Education3 education3 = new Education3("사범대 과학관.jpg", "과학교육학부.txt");
   			education3.show();
   		}
   		if((xx >= 646 && xx < 729) && (yy>=576 && yy < 623)) {  // 사범대 예체능관
   			Education4 education4 = new Education4("사범대 예체능관.jpg", "체육교육과.txt");
   			education4.show();
   		}
   		
   		// 사회과학대학
   		if((xx >= 1490 && xx < 1591) && (yy>=616 && yy < 677)) { 
   			Social so = new Social("사회대.jpg", "심리학과.txt");
   			so.show();
   		}
   		
   		// 글로벌인재관
   		if((xx >= 1192 && xx < 1266) && (yy>=540 && yy < 584)) { 
   			Talent talent = new Talent("글로벌 인재관 크기조정.jpg", "공공인재학부.txt");
   			talent.show();
   		}
   		
   		// 예술대학
   		if((xx >= 183 && xx < 254) && (yy>=436 && yy < 485)) {  // 예대 본관
   			Art1 art1 = new Art1("예술대 구관.jpg", "무용학과.txt");
   			art1.show();
   		}
   		if((xx >= 244 && xx < 331) && (yy>=377 && yy < 434)) {  // 예대 2호관
   			Art2 art2 = new Art2("예술대 신관.jpg", "산업디자인학과.txt");
   			art2.show();
   		}
 
   		
   }

   @Override
   public void mousePressed(MouseEvent e) {}

   @Override
   public void mouseReleased(MouseEvent e) {
      
      System.out.println("마우스 X좌표 : " + e.getX());
      System.out.println("마우스 Y좌표 : " + e.getY());
   }

   @Override
   public void mouseEntered(MouseEvent e) {}

   @Override
   public void mouseExited(MouseEvent e) {}

}  // CampusMap 클래스 종료
