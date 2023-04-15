package eco;
import java.sql.*;

import java.util.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import game.Fhighscore;
import game.Highscore;
import game.LevelOne;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Canvas;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.Button;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Component;

public class Projects extends JFrame{
	private JTextField nameField;
	private JPanel contentPane;
	private JPanel contentPane1;
	public Projects() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(66, 26, 549, 57);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Learn more about ecology");
		btnNewButton_1.setText("<html><center>"+"Learn more"+"<br>"+"about ecology"+"</center></html>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Eco frame1 = new Eco();
				frame1.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(66, 112, 136, 95);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Join green initiatives");
		btnNewButton_2.setText("<html><center>"+"Join green"+"<br>"+"initiatives"+"</center></html>");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Initiatives frame2 = new Initiatives();
				frame2.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(275, 112, 136, 95);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("How to compost at home");
		btnNewButton_3.setText("<html><center>"+"How to compost"+"<br>"+"at home"+"</center></html>");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Compost frame3 = new Compost();
				frame3.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(479, 112, 136, 95);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("How to Reuse Reduce Recycle");
		btnNewButton_4.setText("<html><center>"+"How to Reuse"+"<br>"+"Reduce Recycle"+"</center></html>");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RRR frame4 = new RRR();
				frame4.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_4.setBounds(66, 241, 136, 95);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("How to grow an urban garden");
		btnNewButton_5.setText("<html><center>"+"How to grow"+"<br>"+"an urban garden"+"</center></html>");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Garden frame5 = new Garden();
				frame5.setVisible(true);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_5.setBounds(275, 241, 136, 95);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Take a walk around Bulgaria");
		btnNewButton_6.setText("<html><center>"+"Take a walk"+"<br>"+"around Bulgaria"+"</center></html>");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bulgaria frame6 = new Bulgaria();
				frame6.setVisible(true);
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_6.setBounds(479, 241, 136, 95);
		contentPane.add(btnNewButton_6);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(66, 375, 549, 57);
		contentPane.add(lblNewLabel_1);
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Projects frame = new Projects();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
