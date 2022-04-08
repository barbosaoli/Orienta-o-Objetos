package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import controller.*;

public class PersonScreen implements ActionListener, ListSelectionListener {
	private JFrame window;
	private JLabel title;
	private JButton registerClient;
	private JButton refreshClient;
	private JButton registerEmployee;
	private JButton refreshEmployee;
	
	private static DataController data;
	private JList<String> registeredClientList;
	private JList<String> registeredEmployeeList;
	private String[] nameList = new String[50];

	public void mostrarDados(DataController d, int op) {
		data = d;

		switch (op) {
			case 1:
				nameList = new ClientController(data).getClientName();
				registeredClientList = new JList<String>(nameList);
				
				window = new JFrame("Clientes");
				title = new JLabel("Clientes Cadastrados");
				registerClient = new JButton("Cadastrar");
				refreshClient = new JButton("Recarregar");

				title.setFont(new Font("Arial", Font.BOLD, 20));
				title.setForeground(Color.WHITE);
				title.setBounds(90, 10, 250, 30);
				
				registeredClientList.setBounds(20, 50, 350, 250);
				registeredClientList.setBackground(Color.WHITE);
				registeredClientList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				registeredClientList.setVisibleRowCount(10);

				registerClient.setBounds(70, 320, 100, 30);
				refreshClient.setBounds(200, 320, 100, 30);

				window.setLayout(null);
				window.getContentPane().setBackground(Color.DARK_GRAY);

				window.add(title);
				window.add(registeredClientList);
				window.add(registerClient);
				window.add(refreshClient);

				window.setSize(400, 420);
				window.setVisible(true);
				window.setLocationRelativeTo(null);
				window.setResizable(false);

				registerClient.addActionListener(this);
				refreshClient.addActionListener(this);
				registeredClientList.addListSelectionListener(this);

				break;

			case 2:

				nameList = new EmployeeController(data).getNomeProf();
				registeredEmployeeList = new JList<String>(nameList);
				window = new JFrame("Funcionarios");
				title = new JLabel("Funcionarios Cadastrados");
				registerEmployee = new JButton("Cadastrar");
				refreshEmployee = new JButton("Refresh");

				title.setFont(new Font("Arial", Font.BOLD, 20));
				title.setForeground(Color.WHITE);
				title.setBounds(90, 10, 250, 30);
				registeredEmployeeList.setBounds(20, 50, 350, 250);
				registeredEmployeeList.setBackground(Color.WHITE);
				registeredEmployeeList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				registeredEmployeeList.setVisibleRowCount(10);

				registerEmployee.setBounds(70, 320, 100, 30);
				refreshEmployee.setBounds(200, 320, 100, 30);

				window.setLayout(null);
				window.getContentPane().setBackground(Color.DARK_GRAY);

				window.add(title);
				window.add(registeredEmployeeList);
				window.add(registerEmployee);
				window.add(refreshEmployee);

				window.setSize(400, 420);
				window.setVisible(true);
				window.setResizable(false);
				window.setLocationRelativeTo(null);

				registerEmployee.addActionListener(this);
				refreshEmployee.addActionListener(this);
				registeredEmployeeList.addListSelectionListener(this);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Opcao nao encontrada!", null, JOptionPane.ERROR_MESSAGE);
		}

	}

	// Captura eventos relacionados aos botoes da interface
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();

		// Cadastro de novo aluno
		if (src == registerClient)
			new PersonInformationScreen().inserirEditar(1, data, this, 0);

		// Cadastro de novo professor
		if (src == registerEmployee)
			new PersonInformationScreen().inserirEditar(2, data, this, 0);

		// Atualiza a lista de nomes de alunos mostrada no JList
		if (src == refreshClient) {
			registeredClientList.setListData(new ClientController(data).getClientName());
			registeredClientList.updateUI();
		}

		// Atualiza a lista de nomes de professores mostrada no JList
		if (src == refreshEmployee) {
			registeredEmployeeList.setListData(new EmployeeController(data).getNomeProf());
			registeredEmployeeList.updateUI();
		}

	}

	// Captura eventos relacionados ao JList
	public void valueChanged(ListSelectionEvent e) {
		Object src = e.getSource();

		if (e.getValueIsAdjusting() && src == registeredClientList) {
			new PersonInformationScreen().inserirEditar(3, data, this, registeredClientList.getSelectedIndex());
		}

		if (e.getValueIsAdjusting() && src == registeredEmployeeList) {
			new PersonInformationScreen().inserirEditar(4, data, this, registeredEmployeeList.getSelectedIndex());
		}
	}

}