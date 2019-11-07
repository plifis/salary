package salary;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class generalFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPayForDay;
	private JTextField textFieldViruchka;
	private JTextField textFieldJobsDays;
	private JTextField textFieldOklad;
	private JTextField textFieldStavka;
	private JTextField textFieldSalary;
	private JTextField textFieldNalog;
	private JTextField textFieldPlan;
	private JTextField textFieldBonus;
	public String idButton = new String ();
	private JTextField textFieldPercent;
	private JTextField textFieldZaSmeny;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					generalFrame frame = new generalFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public generalFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		ButtonGroup groupButton = new ButtonGroup(); 
		
		JRadioButton rdbtnAdmin = new JRadioButton("\u0410\u0434\u043C\u0438\u043D\u0441\u0442\u0440\u0430\u0442\u043E\u0440");
		rdbtnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idButton = "admin";
				textFieldPayForDay.setText("900");
			}
		});
		panel.add(rdbtnAdmin);
		
		JRadioButton rdbtnManager = new JRadioButton("\u041F\u0440\u043E\u0434\u0430\u0432\u0435\u0446");
		rdbtnManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				idButton = "seller";
				textFieldPayForDay.setText("750");
			}
		});
		panel.add(rdbtnManager);
		
		groupButton.add(rdbtnManager);
		groupButton.add(rdbtnAdmin);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.WEST);
		
		JLabel labelPayForDay = new JLabel("\u0421\u043C\u0435\u043D\u0430");
		
		textFieldPayForDay = new JTextField();
		textFieldPayForDay.setText("750");
		textFieldPayForDay.setColumns(10);
		panel_1.setLayout(new MigLayout("", "[37px][86px,grow][133px][86px,grow]", "[20px][][][]"));
		panel_1.add(labelPayForDay, "cell 0 0,alignx right,aligny center");
		panel_1.add(textFieldPayForDay, "cell 1 0,alignx left,aligny top");
		
		JLabel labelJobsDays = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u0440\u0430\u0431\u043E\u0447\u0438\u0445 \u0434\u043D\u0435\u0439");
		panel_1.add(labelJobsDays, "cell 2 0,alignx left,aligny center");
		
		textFieldJobsDays = new JTextField();
		textFieldJobsDays.setText("0");
		panel_1.add(textFieldJobsDays, "cell 3 0,alignx left,aligny top");
		textFieldJobsDays.setColumns(10);
		
		JLabel labelOklad = new JLabel("\u041E\u043A\u043B\u0430\u0434");
		panel_1.add(labelOklad, "cell 0 1,alignx trailing");
		
		textFieldOklad = new JTextField();
		textFieldOklad.setText("12000");
		panel_1.add(textFieldOklad, "cell 1 1,growx");
		textFieldOklad.setColumns(10);
		
		JLabel labelEdinitsa = new JLabel("\u0421\u0442\u0430\u0432\u043A\u0430");
		panel_1.add(labelEdinitsa, "cell 2 1,alignx trailing");
		
		textFieldStavka = new JTextField();
		textFieldStavka.setText("0");
		panel_1.add(textFieldStavka, "cell 3 1,growx");
		textFieldStavka.setColumns(10);
		
		JLabel labelNalog = new JLabel("\u041D\u0430\u043B\u043E\u0433");
		panel_1.add(labelNalog, "cell 0 2,alignx trailing,aligny bottom");
		
		textFieldNalog = new JTextField();
		textFieldNalog.setText("0");
		panel_1.add(textFieldNalog, "cell 1 2,growx");
		textFieldNalog.setColumns(10);
		
		JLabel labelSmeny = new JLabel("\u0417\u0430 \u0441\u043C\u0435\u043D\u044B");
		labelSmeny.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(labelSmeny, "cell 2 2,alignx trailing");
		
		textFieldZaSmeny = new JTextField();
		textFieldZaSmeny.setText("0");
		panel_1.add(textFieldZaSmeny, "cell 3 2,growx");
		textFieldZaSmeny.setColumns(10);
		
		JLabel labelBonus = new JLabel("\u041F\u0440\u0435\u043C\u0438\u0430\u043B\u044C\u043D\u0430\u044F \u0447\u0430\u0441\u0442\u044C");
		panel_1.add(labelBonus, "cell 0 3,alignx trailing");
		
		textFieldBonus = new JTextField();
		textFieldBonus.setText("0");
		panel_1.add(textFieldBonus, "cell 1 3,growx");
		textFieldBonus.setColumns(10);
		
		JLabel labelPlan = new JLabel("\u041A\u043E\u044D\u0444\u0444\u0438\u0446\u0438\u0435\u043D\u0442 \u043F\u043B\u0430\u043D\u0430");
		panel_1.add(labelPlan, "cell 2 3,alignx right,aligny center");
		
		textFieldPlan = new JTextField();
		textFieldPlan.setText("1");
		panel_1.add(textFieldPlan, "cell 3 3,growx");
		textFieldPlan.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.EAST);
		panel_2.setLayout(new MigLayout("", "[107px][86px,grow]", "[20px][]"));
		
		JLabel labelViruchka = new JLabel("\u0412\u044B\u0440\u0443\u0447\u043A\u0430 \u0441\u043E\u0442\u0440\u0443\u0434\u043D\u0438\u043A\u0430");
		panel_2.add(labelViruchka, "cell 0 0,alignx left,aligny center");
		
		textFieldViruchka = new JTextField();
		textFieldViruchka.setText("0");
		panel_2.add(textFieldViruchka, "cell 1 0,alignx left,aligny top");
		textFieldViruchka.setColumns(10);
		
		JLabel labelPercent = new JLabel("\u041F\u0440\u043E\u0446\u0435\u043D\u0442");
		panel_2.add(labelPercent, "cell 0 1,alignx trailing");
		
		textFieldPercent = new JTextField();
		textFieldPercent.setText("5");
		panel_2.add(textFieldPercent, "cell 1 1,growx");
		textFieldPercent.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.SOUTH);
		
		JLabel labelSalary = new JLabel("\u0417\u0430\u0440\u043F\u043B\u0430\u0442\u0430");
		panel_3.add(labelSalary);
		
		textFieldSalary = new JTextField();
		textFieldSalary.setText("0");
		panel_3.add(textFieldSalary);
		textFieldSalary.setColumns(10);
		
		JButton buttonCalculate = new JButton("\u0420\u0430\u0441\u0447\u0435\u0442");
		buttonCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float b, jds, o, pfd, pl,st, t, v, p, n, kf;
				
				
				
				
								
				b = Float.parseFloat(textFieldBonus.getText());
				jds = Float.parseFloat(textFieldJobsDays.getText());
				
				o = Float.parseFloat(textFieldOklad.getText());
				pfd = Float.parseFloat(textFieldPayForDay.getText());
				pl = Float.parseFloat(textFieldPlan.getText());
				//sal = Float.parseFloat(textFieldSalary.getText());
				st = Float.parseFloat(textFieldStavka.getText());
				//t = Float.parseFloat(textField)
				v = Float.parseFloat(textFieldViruchka.getText());
				p = Float.parseFloat(textFieldPercent.getText());
				kf = Float.parseFloat(textFieldPlan.getText());
				
				n = (float) ((o * st * 1.7) * 0.3); //расчет налога оклад на ставку увеличиваем на северные и умножаем на процент налога
				textFieldNalog.setText(Float.toString(n));
				
				calculateSalary calcSalary = new calculateSalary (b, jds, o, pfd, pl, st, v, p, n);
				textFieldSalary.setText(calcSalary.getSalary(b, jds, o, pfd, pl, st, v, p, n));
				textFieldZaSmeny.setText(Float.toString(calcSalary.getZaSmeny(jds, pfd)));
				
				
			}
		});
		panel_3.add(buttonCalculate);
		
		
	}

}
