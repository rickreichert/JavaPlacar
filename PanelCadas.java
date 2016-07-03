package classes.UTIL;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class PanelCadas extends JPanel {
	
	private JTextField nomeRobo;
	private JTextField nomeCap;
	private JTextField integrante1;
	private JTextField integrante2;
	private JTextField integrante3;
	private JTextField integrante4;

	public PanelCadas() {
		setLayout(null);
		
		JLabel lblNomeRob = new JLabel("Nome Rob\u00F4");
		lblNomeRob.setBounds(60, 15, 90, 14);
		add(lblNomeRob);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(60, 111, 64, 14);
		add(lblCategoria);
		
		JLabel lblNomeCapito = new JLabel("Nome Capit\u00E3o");
		lblNomeCapito.setBounds(60, 60, 90, 14);
		add(lblNomeCapito);
		
		JLabel lblNomeIntegrante = new JLabel("Nome Integrante da Equipe");
		lblNomeIntegrante.setBounds(360, 15, 158, 14);
		add(lblNomeIntegrante);
		
		JComboBox<String> categoria = new JComboBox<String>();
		categoria.setModel(new DefaultComboBoxModel<String>(new String[] {"SUMO", "SUMO-LARG", "MMA-SUMO"}));
		categoria.setToolTipText("");
		categoria.setBounds(134, 108, 121, 20);
		add(categoria);
		
		nomeRobo = new JTextField();
		nomeRobo.setBounds(55, 35, 200, 20);
		add(nomeRobo);
		nomeRobo.setColumns(10);
		
		nomeCap = new JTextField();
		nomeCap.setBounds(55, 80, 200, 20);
		add(nomeCap);
		nomeCap.setColumns(10);
		
		integrante1 = new JTextField();
		integrante1.setBounds(340, 35, 200, 20);
		add(integrante1);
		integrante1.setColumns(10);
		
		integrante3 = new JTextField();
		integrante3.setBounds(340, 95, 200, 20);
		add(integrante3);
		integrante3.setColumns(10);
		
		integrante2 = new JTextField();
		integrante2.setBounds(340, 65, 200, 20);
		add(integrante2);
		integrante2.setColumns(10);
		
		integrante4 = new JTextField();
		integrante4.setBounds(340, 125, 200, 20);
		add(integrante4);
		integrante4.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 170, 270, 2);
		add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(290, 15, 2, 135);
		add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(300, 170, 280, 2);
		add(separator_2);
		

	}
}
