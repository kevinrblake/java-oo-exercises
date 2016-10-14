import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JPanel;

public class Quiz {

	private JFrame frmQuizTime;
	private JTextField txtClickTheButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz window = new Quiz();
					window.frmQuizTime.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Quiz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuizTime = new JFrame();
		frmQuizTime.setTitle("Quiz Time!");
		frmQuizTime.setBounds(100, 100, 600, 363);
		frmQuizTime.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQuizTime.getContentPane().setLayout(null);
		
		txtClickTheButton = new JTextField();
		txtClickTheButton.setBounds(0, 0, 584, 23);
		txtClickTheButton.setHorizontalAlignment(SwingConstants.CENTER);
		txtClickTheButton.setFont(new Font("Garamond", Font.PLAIN, 16));
		txtClickTheButton.setText("Click the Button!");
		frmQuizTime.getContentPane().add(txtClickTheButton);
		txtClickTheButton.setColumns(10);
		
		JButton btnAnswerAQuestion = new JButton("Answer a Question!");
		btnAnswerAQuestion.setBounds(125, 35, 342, 188);
		btnAnswerAQuestion.setFont(new Font("Garamond", Font.PLAIN, 16));
		btnAnswerAQuestion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		frmQuizTime.getContentPane().add(btnAnswerAQuestion);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(0, 318, 584, 6);
		textPane.setFont(new Font("Garamond", Font.PLAIN, 16));
		frmQuizTime.getContentPane().add(textPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(40, 257, 511, 28);
		frmQuizTime.getContentPane().add(panel);
	}
}
