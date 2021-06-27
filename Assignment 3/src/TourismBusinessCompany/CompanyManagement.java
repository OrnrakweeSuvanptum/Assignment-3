package TourismBusinessCompany;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CompanyManagement extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CompanyManagement frame = new CompanyManagement();
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
	public CompanyManagement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1003, 714);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel.setBackground(Color.CYAN);
		panel.setBounds(0, 0, 989, 675);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(39, 27, 911, 78);
		panel.add(panel_1);
		
		JLabel CompanyLabel = new JLabel("WEE TOURISM ENTERPRISE");
		CompanyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		CompanyLabel.setFont(new Font("Rockwell Extra Bold", Font.BOLD, 39));
		CompanyLabel.setBounds(10, 11, 891, 56);
		panel_1.add(CompanyLabel);
		
		JLabel TourismIcon = new JLabel("");
		TourismIcon.setIcon(new ImageIcon(CompanyManagement.class.getResource("/Image/tourism company.jpg")));
		TourismIcon.setBounds(330, 130, 290, 174);
		panel.add(TourismIcon);
		
		JLabel CompanyNameLabel = new JLabel("Company Name: WEE TOURISM ENTERPRISE");
		CompanyNameLabel.setFont(new Font("Arial Black", Font.BOLD, 19));
		CompanyNameLabel.setBounds(64, 343, 548, 21);
		panel.add(CompanyNameLabel);
		
		JLabel AddressLabel = new JLabel("Address: No252, Jalan Bunga Mawar, Pantai Cenang Langkawi, Kedah ");
		AddressLabel.setFont(new Font("Arial Black", Font.BOLD, 19));
		AddressLabel.setBounds(64, 375, 787, 21);
		panel.add(AddressLabel);
		
		JLabel PosscodeLabel = new JLabel("Posscode: 07000");
		PosscodeLabel.setFont(new Font("Arial Black", Font.BOLD, 19));
		PosscodeLabel.setBounds(64, 407, 215, 21);
		panel.add(PosscodeLabel);
		
		JLabel LocationLabel = new JLabel("Location: Pantai Cenang, Langkawi ");
		LocationLabel.setFont(new Font("Arial Black", Font.BOLD, 19));
		LocationLabel.setBounds(64, 439, 417, 21);
		panel.add(LocationLabel);
		
		JLabel TelNumLabel = new JLabel("Telephone Number: 04-4550493");
		TelNumLabel.setFont(new Font("Arial Black", Font.BOLD, 19));
		TelNumLabel.setBounds(64, 471, 361, 21);
		panel.add(TelNumLabel);
		
		JLabel FaxLabel = new JLabel("Fax: 04-4550934");
		FaxLabel.setFont(new Font("Arial Black", Font.BOLD, 19));
		FaxLabel.setBounds(64, 503, 202, 21);
		panel.add(FaxLabel);
		
		JLabel WebsiteLabel = new JLabel("Website: www.weetourism.com.my ");
		WebsiteLabel.setFont(new Font("Arial Black", Font.BOLD, 19));
		WebsiteLabel.setBounds(64, 535, 406, 21);
		panel.add(WebsiteLabel);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1_1_1.setBackground(Color.CYAN);
		panel_1_1_1.setBounds(52, 588, 194, 62);
		panel.add(panel_1_1_1);
		
		JButton PromotionServButton = new JButton("PROMOTION");
		PromotionServButton.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		PromotionServButton.setBackground(new Color(0, 206, 209));
		PromotionServButton.setBounds(22, 19, 152, 23);
		panel_1_1_1.add(PromotionServButton);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1_1_2.setBackground(Color.CYAN);
		panel_1_1_2.setBounds(284, 588, 220, 62);
		panel.add(panel_1_1_2);
		
		JButton AdsButton = new JButton("ADVERTISEMENT");
		AdsButton.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		AdsButton.setBackground(new Color(0, 206, 209));
		AdsButton.setBounds(17, 19, 187, 23);
		panel_1_1_2.add(AdsButton);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1_1_1_1.setBackground(Color.CYAN);
		panel_1_1_1_1.setBounds(540, 588, 194, 62);
		panel.add(panel_1_1_1_1);
		
		JButton EmployeeButton = new JButton("EMPLOYEE");
		EmployeeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Employee emp = new Employee();
				emp.setModalExclusionType(null);
	            emp.setVisible(true);
			}
		});
		EmployeeButton.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		EmployeeButton.setBackground(new Color(0, 206, 209));
		EmployeeButton.setBounds(22, 19, 144, 23);
		panel_1_1_1_1.add(EmployeeButton);
		
		JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(95, 158, 160)));
		panel_1_1_1_1_1.setBackground(Color.CYAN);
		panel_1_1_1_1_1.setBounds(770, 588, 163, 62);
		panel.add(panel_1_1_1_1_1);
		
		JButton ExitButton = new JButton("LOGOUT");
		ExitButton.setFont(new Font("Rockwell Condensed", Font.BOLD, 20));
		ExitButton.setBackground(new Color(0, 206, 209));
		ExitButton.setBounds(22, 19, 118, 23);
		panel_1_1_1_1_1.add(ExitButton);
	}
}
