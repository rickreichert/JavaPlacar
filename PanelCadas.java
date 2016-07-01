package classes;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;


import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JButton;


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
		lblNomeRob.setBounds(53, 239, 90, 15);
		add(lblNomeRob);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(53, 301, 65, 15);
		add(lblCategoria);
		
		JLabel lblNomeCapito = new JLabel("Nome Capit\u00E3o");
		lblNomeCapito.setBounds(53, 188, 90, 15);
		add(lblNomeCapito);
		
		JLabel lblNomeIntegrante = new JLabel("Nome Integrante da Equipe");
		lblNomeIntegrante.setBounds(347, 189, 158, 15);
		add(lblNomeIntegrante);
		
		JComboBox<String> categoria = new JComboBox<String>();
		categoria.setEnabled(false);
		categoria.setModel(new DefaultComboBoxModel<String>(new String[] {"SUMO", "SUMO-LARG", "MMA-SUMO"}));
		categoria.setToolTipText("");
		categoria.setBounds(123, 299, 120, 20);
		add(categoria);
		
		nomeRobo = new JTextField();
		nomeRobo.setBounds(43, 259, 200, 20);
		add(nomeRobo);
		nomeRobo.setColumns(10);
		
		nomeCap = new JTextField();
		nomeCap.setBounds(43, 208, 200, 20);
		add(nomeCap);
		nomeCap.setColumns(10);
		
		integrante1 = new JTextField();
		integrante1.setBounds(327, 209, 200, 20);
		add(integrante1);
		integrante1.setColumns(10);
		
		integrante2 = new JTextField();
		integrante2.setBounds(327, 239, 200, 20);
		add(integrante2);
		integrante2.setColumns(10);
		
		integrante3 = new JTextField();
		integrante3.setBounds(327, 269, 200, 20);
		add(integrante3);
		integrante3.setColumns(10);
		
		integrante4 = new JTextField();
		integrante4.setBounds(327, 299, 200, 20);
		add(integrante4);
		integrante4.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 175, 275, 2);
		add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(293, 189, 2, 150);
		add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(295, 176, 295, 2);
		add(separator_2);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.setBounds(54, 141, 89, 23);
		add(btnIncluir);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(153, 141, 89, 23);
		add(btnRemover);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.setBounds(426, 141, 89, 23);
		add(btnGravar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(327, 141, 89, 23);
		add(btnCancelar);
		
		
	}
}
