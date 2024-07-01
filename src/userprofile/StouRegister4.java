package userprofile;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StouRegister4 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private Font myFont = new Font("TH SarabunPSK", Font.PLAIN, 20);
	private CardLayout card = new CardLayout();
	private JPanel inputPanel;
	private JPanel outputPanel;
	
	private String subjects[] = {"ทักษะชีวิต","ไทยศึกษา","ภาษาอังกฤษเพื่อการสื่อสาร","ไทยกับสังคมโลก",
			"การจัดการระบบฐานข้อมูล","การโปรแกรมคอมพิวเตอร์","การโปรแกรมเว็บ","วิศวกรรมซอฟต์แวร์","การโปรแกรมเชิงวัตถุ"};
	
	private JComboBox cboSubject[] = new JComboBox[3];
	private JLabel lbSubject[] = new JLabel[3];
	
	public StouRegister4() {
		
		UIManager.put("Label.font", myFont);
		UIManager.put("Button.font", myFont);
		UIManager.put("Combobox.font", myFont);
		
		getContentPane().setLayout(card);
		
		createInputPanel();
		createOutputPanel();
		
		getContentPane().add(inputPanel, "page1");
		
		getContentPane().add(outputPanel, "page2");
		
	}
	
	private void createInputPanel() {
		inputPanel = new JPanel();
		inputPanel.setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel lbSubjectHeader = new JLabel("เลือกชุดวิชาที่ลงทะเบียน (ไม่เกิน 3 ชุดวิชา)");
		
		gbc.insets = new Insets(2,5,2,5);
		gbc.gridx = 0;
		gbc.gridy = 0;
		inputPanel.add(lbSubjectHeader, gbc);
		
		JPanel subjectPanel = new JPanel();
		subjectPanel.setLayout(new GridBagLayout());
		
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 0;
		gbc.gridy = 1;
		inputPanel.add(subjectPanel, gbc);
		
		JButton btnOK = new JButton("ตกลง");
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.gridx = 0;
		gbc.gridy = 2;
		inputPanel.add(btnOK, gbc);
		
		for (int row=0; row<3; row++) {
			lbSubject[row] = new JLabel();
			lbSubject[row].setText("เลือกชุดวิช่าที่ต้องการลงทะเบียน"+(row+1));
			
			gbc.gridx = 0;
			gbc.gridy = row;
			subjectPanel.add(lbSubject[row], gbc);
			
			cboSubject[row] = new JComboBox<String>();
			gbc.gridx = 1;
			gbc.gridy = row;
			subjectPanel.add(cboSubject[row], gbc);
			
		}
		
		for (int i=0; i<3; i++) {
			cboSubject[i].addItem("เลือกชุดวิชาที่ "+(i+1));
			
			for (String item:subjects)
				cboSubject[i].addItem(item);
		}
		
		btnOK.addActionListener(new ActionListener() {
			
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String str;
			
			for (int i=0; i<3; i++) {
				str = "ชุดวิชาที่ "+(i+1)+" ที่ได้เลือกคือ: ";
				
				if (cboSubject[i].getSelectedIndex() != 0)
					str +=
	cboSubject[i].getSelectItem();
				else
					str +="-";
				lbSubject[i].setText(str);
				
			}
			
			card.show(getContentPane(), "page2");
		}
			
		
		});
		
	}
	
	private void createOutputPanel() {
		
		outputPanel = new JPanel();
		outputPanel.setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel header = new JLabel("สรุปการกรอกข้อมูล");
		gbc.insets = new Insets(2, 0, 2, 0);
		
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		outputPanel.add(header, gbc);
		
		for (int i=0; i<3; i++) {
			lbSubject[i] = new JLabel();
			gbc.gridx = 0;
			gbc.gridy++;
			outputPanel.add(lbSubject[i], gbc);
		}
		
		JButton btnEdit = new JButton("แก้ไข");
		gbc.anchor = GridBagConstraints.CENTER;
		
		gbc.gridx = 0;
		gbc.gridy++;
		outputPanel.add(btnEdit, gbc);
		
		btnEdit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				card.show(getContentPane(), "page1");
				
			}
		});
	}
	
	public static void main(String[] args) {
		StouRegister4 frame = new StouRegister4();
		frame.setSize(500,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
