package classes;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;


import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import classes.UTIL.*;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


@SuppressWarnings("serial")
public class PanelCadas extends JPanel {

	private Equipe novaEquipe;
	
	private JTextField nomeRobo;
	private JTextField nomeCap;
	private JTextField integrante1;
	private JTextField integrante2;
	private JTextField integrante3;
	private JTextField integrante4;
	private JTextField alturaRobo;
	private JTextField pesoRobo;
	private JTextField larguraRobo;
	
	private JButton btnCancelar;
	private JButton btnAlterar;
	private JButton btnRemover;
	private JButton btnGravar;
	
	private JComboBox<String> listaEquip;
	private JComboBox<String> categoria;
	
	private EventoDeBotoes event;
	
	public PanelCadas() {
		setLayout(null);
		setSize(800, 450);
		
		event = new EventoDeBotoes();
		
		JLabel lblNomeRob = new JLabel("Nome Rob\u00F4");
		lblNomeRob.setBounds(61, 154, 300, 15);
		add(lblNomeRob);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setBounds(202, 220, 65, 15);
		add(lblCategoria);
		
		JLabel lblNomeCapito = new JLabel("Nome Capit\u00E3o");
		lblNomeCapito.setBounds(454, 86, 300, 15);
		add(lblNomeCapito);
		
		JLabel lblNomeIntegrante = new JLabel("Nome Integrante da Equipe");
		lblNomeIntegrante.setBounds(454, 179, 300, 15);
		add(lblNomeIntegrante);
		
		JLabel lblAlturacm = new JLabel("Altura (cm)");
		lblAlturacm.setBounds(81, 220, 90, 14);
		add(lblAlturacm);
		
		JLabel lblLarguracm = new JLabel("Largura (cm)");
		lblLarguracm.setBounds(81, 297, 90, 14);
		add(lblLarguracm);
		
		JLabel lblPesokg = new JLabel("Peso (kg)");
		lblPesokg.setBounds(202, 294, 59, 14);
		add(lblPesokg);
		
		JLabel lblListaDeEquipes = new JLabel("Lista de Equipes");
		lblListaDeEquipes.setBounds(61, 86, 300, 14);
		add(lblListaDeEquipes);
		
		JLabel lblTituloPanel = new JLabel("Cadastro de Equipes");
		lblTituloPanel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloPanel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblTituloPanel.setBounds(150, 20, 500, 30);
		add(lblTituloPanel);
		
		listaEquip = new JComboBox<String>();
		listaEquip.setEnabled(false);
		listaEquip.setModel(new DefaultComboBoxModel<String>(new String[] {" "}));
		listaEquip.setBounds(71, 112, 290, 20);
		listaEquip.addActionListener(event);
		add(listaEquip);
		
		categoria = new JComboBox<String>();
		categoria.setEnabled(false);
		categoria.setModel(new DefaultComboBoxModel<String>(new String[] {"SUMO", "SUMO-LARG", "MMA-SUMO"}));
		categoria.setToolTipText("");
		categoria.setBounds(216, 240, 90, 20);
		add(categoria);
		
		nomeRobo = new JTextField();
		nomeRobo.setBounds(74, 176, 287, 20);
		add(nomeRobo);
		nomeRobo.setColumns(10);
		
		nomeCap = new JTextField();
		nomeCap.setBounds(476, 112, 278, 20);
		add(nomeCap);
		nomeCap.setColumns(10);
		
		integrante1 = new JTextField();
		integrante1.setBounds(476, 207, 278, 20);
		add(integrante1);
		integrante1.setColumns(10);
		
		integrante2 = new JTextField();
		integrante2.setBounds(476, 250, 278, 20);
		add(integrante2);
		integrante2.setColumns(10);
		
		integrante3 = new JTextField();
		integrante3.setBounds(476, 295, 278, 20);
		add(integrante3);
		integrante3.setColumns(10);
		
		integrante4 = new JTextField();
		integrante4.setBounds(476, 342, 278, 20);
		add(integrante4);
		integrante4.setColumns(10);
		
		JSeparator separatorMeio = new JSeparator();
		separatorMeio.setOrientation(SwingConstants.VERTICAL);
		separatorMeio.setBounds(400, 75, 2, 340);
		add(separatorMeio);
		
		alturaRobo = new JTextField();
		alturaRobo.setBounds(96, 241, 50, 20);
		add(alturaRobo);
		alturaRobo.setColumns(10);
		
		pesoRobo = new JTextField();
		pesoRobo.setBounds(217, 317, 50, 20);
		add(pesoRobo);
		pesoRobo.setColumns(10);
		
		larguraRobo = new JTextField();
		larguraRobo.setBounds(96, 317, 50, 20);
		add(larguraRobo);
		larguraRobo.setColumns(10);
		
		btnAlterar = new JButton("Alterar/Editar");
		btnAlterar.setBounds(50, 405, 129, 23);
		btnAlterar.addActionListener(event);
		add(btnAlterar);
		
		btnRemover = new JButton("Remover");
		btnRemover.setBounds(216, 405, 129, 23);
		btnRemover.addActionListener(event);
		btnRemover.setEnabled(false);
		add(btnRemover);
		
		btnGravar = new JButton("Gravar");
		btnGravar.setBounds(454, 405, 129, 23);
		btnGravar.addActionListener(event);
		add(btnGravar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(625, 405, 129, 23);
		btnCancelar.addActionListener(event);
		add(btnCancelar);
				
	}
	
	private void limpaCadastro(){
		nomeRobo.setText("");
		nomeCap.setText("");
		integrante1.setText("");
		integrante2.setText("");
		integrante3.setText("");
		integrante4.setText("");
		alturaRobo.setText("");
		pesoRobo.setText("");
		larguraRobo.setText("");
	}
	
	private void escreveCampos(){
				
		Iterator<Equipe> iterator = (Iterator<Equipe>) Inicial.getListEquipes().iterator();
		Equipe e;
	    while (iterator.hasNext()) {
	    	
	    	e = iterator.next();
	    	
	    	if(listaEquip.getSelectedItem().equals(e.getCapitaoEquip().getNome())){
	    		nomeRobo.setText(e.getRoboEquip().getNome());
	    		nomeCap.setText(e.getCapitaoEquip().getNome());
	    		integrante1.setText(e.getIntegrantes().get(0).getNome());
	    		integrante2.setText(e.getIntegrantes().get(1).getNome());
	    		integrante3.setText(e.getIntegrantes().get(2).getNome());
	    		integrante4.setText(e.getIntegrantes().get(3).getNome());
	    		alturaRobo.setText(e.getRoboEquip().getCatRobo().getAltura().toString());
	    		pesoRobo.setText(e.getRoboEquip().getCatRobo().getPeso().toString());
	    		larguraRobo.setText(e.getRoboEquip().getCatRobo().getLados().toString());
	    	}
	    	break;
	    }
	}
	
	private void removeEquipe() {
		Iterator<Equipe> iterator = (Iterator<Equipe>) Inicial.getListEquipes().iterator();
		Equipe e;
	    while (iterator.hasNext()) {
	    	
	    	e = iterator.next();
	    	
	    	if(listaEquip.getSelectedItem().equals(e.getCapitaoEquip().getNome())){
	    		Inicial.getListEquipes().remove(e);
	    	}
	    	break;
	    }
	}
	
	
	private void alteraEquipe() throws Exception{
		
		Iterator<Equipe> iterator = (Iterator<Equipe>) Inicial.getListEquipes().iterator();
		Equipe e;
	    while (iterator.hasNext()) {
	    	
	    	e = iterator.next();
	    	
	    	if(listaEquip.getSelectedItem().equals(e.getCapitaoEquip().getNome())){
	    		
	    		e.getRoboEquip().setNome(nomeRobo.getText());
	    		e.getCapitaoEquip().setNome(nomeCap.getText());
	    		e.getIntegrantes().get(0).setNome(integrante1.getText());
	    		e.getIntegrantes().get(1).setNome(integrante2.getText());
	    		e.getIntegrantes().get(2).setNome(integrante3.getText());
	    		e.getIntegrantes().get(3).setNome(integrante4.getText());
	    		e.getRoboEquip().getCatRobo().setAltura(Integer.parseInt(alturaRobo.getText()));	    		
	    		e.getRoboEquip().getCatRobo().setPeso(Integer.parseInt(pesoRobo.getText()));	    		
	    		e.getRoboEquip().getCatRobo().setLados(Integer.parseInt(larguraRobo.getText()));
	    		
	    	}
	    	break;
	    }
	}
	
	private void criaEquipe() throws Exception{

		Categoria cat = new Sumo("SUMO", Integer.parseInt(larguraRobo.getText()), Integer.parseInt(alturaRobo.getText()), Integer.parseInt(pesoRobo.getText()));
		
		Pessoa pes = new Pessoa(nomeCap.getText());
		
		Robo rob = new Robo(nomeRobo.getText(), cat);
		
		ArrayList<Pessoa> intEquip = new ArrayList<Pessoa>();
		intEquip.add(new Pessoa(integrante1.getText()));
		intEquip.add(new Pessoa(integrante2.getText()));
		intEquip.add(new Pessoa(integrante3.getText()));
		intEquip.add(new Pessoa(integrante4.getText()));
		
		
		novaEquipe = new Equipe(pes, rob, intEquip);
		
	}
		
	private class EventoDeBotoes implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == btnCancelar){
				listaEquip.setModel(new DefaultComboBoxModel<String>(new String[] {" "}));
				listaEquip.setEnabled(false);
				limpaCadastro();
			}else
				
				if(e.getSource() == btnAlterar){
					if(listaEquip.isEnabled()){
						limpaCadastro();
						listaEquip.setEnabled(false);
					}else{
						
						listaEquip.setModel(new DefaultComboBoxModel<String>(Inicial.retornaArray_com_Equipes()));
						
						JOptionPane.showMessageDialog(null,"Selecione Uma Equipe da Lista !");
						listaEquip.setEnabled(true);
					}
				}else
					
					if(e.getSource() == btnGravar){
						
						try {
							
							if(!listaEquip.isEnabled()){
								criaEquipe();
								Inicial.getListEquipes().add(novaEquipe);
								JOptionPane.showMessageDialog(null,"Gravado com Sucesso!");
							}else{
								alteraEquipe();
								JOptionPane.showMessageDialog(null,"Alterado com Sucesso!");
							}
							
							limpaCadastro();
							btnRemover.setEnabled(true);
							
						} catch (Exception g) {
							JOptionPane.showMessageDialog(null,"Preencha os Campos CORRETAMENTE para Gravar!");							
						} finally{
							listaEquip.setModel(new DefaultComboBoxModel<String>(new String[] {" "}));
							listaEquip.setEnabled(false);
						}
						
					}else
						
						if(e.getSource() == listaEquip){
							escreveCampos();
						} else
							
							if(e.getSource() == btnRemover){
								if(listaEquip.isEnabled()){
									removeEquipe();
									JOptionPane.showMessageDialog(null,"Equipe Removida com Suceso !");
									limpaCadastro();
									listaEquip.setModel(new DefaultComboBoxModel<String>(new String[] {" "}));
									listaEquip.setEnabled(false);
								}else{
									JOptionPane.showMessageDialog(null,"Selecione Uma Equipe da Lista !");
									listaEquip.setModel(new DefaultComboBoxModel<String>(Inicial.retornaArray_com_Equipes()));
									listaEquip.setEnabled(true);
								}
								
							}
			
		}
		
	}
}
