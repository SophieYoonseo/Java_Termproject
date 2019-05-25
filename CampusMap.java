package proj;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CampusMap extends JFrame implements MouseListener {
   private JLabel statusLabel;
   private JButton engineering1;
   private JButton engineering7;
   
   public CampusMap() {
      
      this.setTitle("CampusMap ����");

      Container c = this.getContentPane();

      this.setSize(1819,1088);
      this.getContentPane().setLayout(null);
            
      // �ϴ� ���°� ��
      statusLabel = new JLabel();
      statusLabel.setBounds(0, 0, 1801, 1041);
      //ImageIcon cam = new ImageIcon(CampusMap.class.getResource("/proj/\uBC30\uACBD \uC9C0\uB3C4.jpg"));
      statusLabel.setIcon(new ImageIcon(CampusMap.class.getResource("CampusMap1.jpg")));
      
      statusLabel.setForeground(new Color(0, 0, 0));
      this.getContentPane().add(statusLabel);

      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
      this.addMouseListener(this);
      
   }  // CampusMap �޼ҵ� ����

   public static void main(String[] args) {
      CampusMap awtControlDemo = new CampusMap();
      //awtControlDemo.showButton();
   }

   
   
   
   @Override
   public void mouseClicked(MouseEvent e) {
   
      int xx = Integer.valueOf(e.getX()); 
      int yy = Integer.valueOf(e.getY());

   // ��������
      if((xx >= 1021 && xx < 1143) && (yy>=545 && yy < 580)) {
			Engineering1 eng1 = new Engineering1("2-1-2.png", "IT����ý��۰��а�.txt");
			eng1.show();
		}
		
		if((xx >= 925 && xx < 1009) && (yy>=557 && yy < 620)) {
			Engineering2 eng2 = new Engineering2("2-2.png", "�ڿ����������а�.txt");
			eng2.show();
		}
		if((xx >= 1106 && xx < 1163) && (yy>=502 && yy < 533)) {
			Engineering3 eng3 = new Engineering3("2-3-2.png", "��輳����к�.txt");
			//eng3.show();
		}
		if((xx >= 930 && xx < 1057) && (yy>=501 && yy < 533)) {
			Engineering4 eng4 = new Engineering4("2-4-2.png", "���ý��۰��к�.txt");
		}
		if((xx >= 854 && xx < 920) && (yy>= 519 && yy < 577)) {
			Engineering5 eng5 = new Engineering5("2-5.png", "����Ʈ������а�.txt");
		}
		if((xx >= 1165 && xx < 1251) && (yy>=462 && yy < 513)) {
			Engineering6 eng6 = new Engineering6("2-6.png", "��������ý��۰��к�.txt");
		}
		if((xx >= 1269 && xx < 1377) && (yy>=508 && yy < 557)) {
			Engineering7 eng7 = new Engineering7("2-8.png", "��ǻ�Ͱ��к�.txt");
		}
		if((xx >= 1041 && xx < 1101) && (yy>=443 && yy < 492)) {
			Engineering9 eng9 = new Engineering9("2-9-2.png", "�װ����ְ��а�.txt");
		}
		
   		
   		// �ڿ����д���
   		if((xx >= 769 && xx < 848) && (yy>=541 && yy < 590)) {  // �ڿ��� ����
   			Science0 science0 = new Science0("�ڿ��뺻��.jpg", "���а�.txt");
   			science0.show();
   		}
   		if((xx >= 802 && xx < 923) && (yy>=785 && yy < 847)) {  // �ڿ��� 1ȣ��
   			Science1 science1 = new Science1("�ڿ���1ȣ��.jpg", "ȭ�а�.txt");
   			science1.show();
   		}
   		if((xx >= 564 && xx < 678) && (yy>=854 && yy < 906)) {  // �ڿ��� 2ȣ��
   			Science2 science2 = new Science2("�ڿ���2ȣ��.jpg", "������а�.txt");
   			science2.show();
   		}
   		if((xx >= 786 && xx < 861) && (yy>=596 && yy < 630)) {  // �ڿ��� 3ȣ��
   			Science3 science3 = new Science3("�ڿ��� 3ȣ��.jpg", "�ݵ�ü���б���а�.txt");
   			science3.show();
   		}
   		if((xx >= 863 && xx < 925) && (yy>=604 && yy < 643)) {  // �ڿ��� 4ȣ��
   			Science4 science4 = new Science4("�ڿ��� 4ȣ��.jpg", "���ڻ����а�.txt");
   			science4.show();
   		}
   		if((xx >= 924 && xx < 1010) && (yy>=629 && yy < 665)) {  // �ڿ��� 5ȣ��
   			Science5 science5 = new Science5("�ڿ��� 5ȣ��.jpg", "�����а�.txt");
   			science5.show();
   		}
   		
   		// �������
   		if((xx >= 1514 && xx < 1599) && (yy>=530 && yy < 581)) {  // ���2ȣ��
   			Commerce2 commerce2 = new Commerce2("���2ȣ��.jpg", "�����к�.txt");
   			commerce2.show();
   		}
   		
   		
   		// ��Ȱ���д���
   		if((xx >= 1611 && xx < 1709) && (yy>=772 && yy < 825)) {
   			HummanEcology human = new HummanEcology("��Ȱ���д� ũ������.jpg", "�Ƿ��а�.txt");
   			human.show();
   		}
   		
   		// �ι���ȸ��
   		if((xx >= 1662 && xx < 1761) && (yy>=686 && yy < 736)) { 
   			Liberal1 liberal1 = new Liberal1("�ι���ȸ��.jpg", "�Ϻ��а�.txt");
   			liberal1.show();
   		}
   		
   		// �ι�����
   		if((xx >= 1375 && xx < 1445) && (yy>=657 && yy < 692)) {  // �ι����� 2ȣ��
   			Liberal2 liberal2 = new Liberal2("�ι�����1ȣ��.jpg", "�����а�.txt");
   			liberal2.show();
   		}
   		
   		// ���������д���
   		if((xx >= 832 && xx < 944) && (yy>=369 && yy < 412)) {  // ��� ����
   			Agriculture0 agriculture0 = new Agriculture0("��뺻��.jpg", "�긲ȯ����а�.txt");
   			agriculture0.show();
   		}
   		if((xx >= 622 && xx < 722) && (yy>=441 && yy < 478)) {  // ��� 1ȣ��
   			Agriculture1 agriculture1 = new Agriculture1("���1ȣ��.jpg", "����������к�.txt");
   			agriculture1.show();
   		}
   		if((xx >= 721 && xx < 824) && (yy>=412 && yy < 453)) {  // ��� 2ȣ��
   			Agriculture2 agriculture2 = new Agriculture2("���2ȣ��.jpg", "����ȯ��ȭ�а�.txt");
   			agriculture2.show();
   		}
   		if((xx >= 1041 && xx < 1135) && (yy>=367 && yy < 401)) {  // ��� 3ȣ��
   			Agriculture3 agriculture3 = new Agriculture3("���3ȣ��.jpg", "������а�.txt");
   			agriculture3.show();
   		}
   		if((xx >= 1139 && xx < 1220) && (yy>=351 && yy < 384)) {  // ��� 4ȣ��
   			Agriculture4 agriculture4 = new Agriculture4("���4ȣ��.jpg", "������������а�.txt");
   			agriculture4.show();
   		}
   		
   		// �������
   		if((xx >= 1514 && xx < 1600) && (yy>=805 && yy < 860)) {  // ����� ����
   			Education1 education1 = new Education1("����� ���а�.jpg", "�������.txt");
   			education1.show();
   		}
   		if((xx >= 1021 && xx < 1085) && (yy>=658 && yy < 722)) {  // ������(�����) ����������
   			Education2 education2 = new Education2("����� ��ü�ɰ�.jpg", "���米����.txt");
   			education2.show();
   		}
   		if((xx >= 809 && xx < 945) && (yy>=708 && yy < 759)) {  // ����� ���а�
   			Education3 education3 = new Education3("����� ���а�.jpg", "���б����к�.txt");
   			education3.show();
   		}
   		if((xx >= 646 && xx < 729) && (yy>=576 && yy < 623)) {  // ����� ��ü�ɰ�
   			Education4 education4 = new Education4("����� ��ü�ɰ�.jpg", "ü��������.txt");
   			education4.show();
   		}
   		
   		// ��ȸ���д���
   		if((xx >= 1490 && xx < 1591) && (yy>=616 && yy < 677)) { 
   			Social so = new Social("��ȸ��.jpg", "�ɸ��а�.txt");
   			so.show();
   		}
   		
   		// �۷ι������
   		if((xx >= 1192 && xx < 1266) && (yy>=540 && yy < 584)) { 
   			Talent talent = new Talent("�۷ι� ����� ũ������.jpg", "���������к�.txt");
   			talent.show();
   		}
   		
   		// ��������
   		if((xx >= 183 && xx < 254) && (yy>=436 && yy < 485)) {  // ���� ����
   			Art1 art1 = new Art1("������ ����.jpg", "�����а�.txt");
   			art1.show();
   		}
   		if((xx >= 244 && xx < 331) && (yy>=377 && yy < 434)) {  // ���� 2ȣ��
   			Art2 art2 = new Art2("������ �Ű�.jpg", "����������а�.txt");
   			art2.show();
   		}
 
   		
   }

   @Override
   public void mousePressed(MouseEvent e) {}

   @Override
   public void mouseReleased(MouseEvent e) {
      
      System.out.println("���콺 X��ǥ : " + e.getX());
      System.out.println("���콺 Y��ǥ : " + e.getY());
   }

   @Override
   public void mouseEntered(MouseEvent e) {}

   @Override
   public void mouseExited(MouseEvent e) {}

}  // CampusMap Ŭ���� ����
