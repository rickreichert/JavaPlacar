package classes;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import classes.UTIL.Equipe;

@SuppressWarnings("serial")
public class Inicial extends JFrame{
	
	private AcaoMenu action = new AcaoMenu();
	
	private Container contPanel;
	private Container contMenu;
	
	private JPanel jpAjuda = new JPanel();
	private JPanel jpCadas = new PanelCadas();
	private JPanel jpPlacar = new JPanel();
	
	private JButton jCad = new JButton("Equipes");
	private JButton jExit = new JButton("Sair");
	private JButton jPart = new JButton("Partida");
	private JButton jAjuda = new JButton("Ajuda");
	
	private static ArrayList<Equipe> listaEquipe = new ArrayList<Equipe>();
	
	
	public static void main(String[] args) {
		new Inicial();
	}
		
	public Inicial() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
		this.setTitle("MENU");
		this.setSize(800, 500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.getContentPane().setLayout(new BorderLayout());
		
		contMenu = new JPanel();
		contMenu.setLayout(new GridLayout(1, 4));

		contPanel = new JPanel();
		contPanel.setLayout(new CardLayout());
		
		contPanel.add(jpAjuda, 0);
		contPanel.add(jpCadas, 1);
		contPanel.add(jpPlacar, 2);
		
		contMenu.add(jCad);
		contMenu.add(jPart);
		contMenu.add(jAjuda);
		contMenu.add(jExit);
				
		this.getContentPane().add(contMenu, BorderLayout.NORTH);
		this.getContentPane().add(contPanel, BorderLayout.CENTER);
		
		jCad.addActionListener(action);
		jPart.addActionListener(action);
		jExit.addActionListener(action);
		jAjuda.addActionListener(action);
		
	}	
	
	private class AcaoMenu implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == jCad){
				jpPlacar.setVisible(false);
				jpAjuda.setVisible(false);
				jpCadas.setVisible(true);
			}
			else
				if(e.getSource() == jPart){
					if(listaEquipe.size() >= 2){
						jpCadas.setVisible(false);
						jpAjuda.setVisible(false);
						jpPlacar.setVisible(true);	
					}else{
				        JOptionPane.showMessageDialog(null,"Você precisa Cadastrar DUAS Equipes antes de iniciar uma partida!!");
					}
					
				}else
					if(e.getSource() == jExit){
				        System.exit(0);
					}else
						if(e.getSource() == jAjuda){
							jpCadas.setVisible(false);
							jpPlacar.setVisible(false);
							jpAjuda.setVisible(true);
						}
		}
		
	}
	
	public static ArrayList<Equipe> getListEquipes(){
		return listaEquipe;
	}
	
	public static String[] retornaArray_com_Equipes(){
		
		ArrayList<String> lista = new ArrayList<String>();
		lista.add(" ");
		for(int i = 0; i < listaEquipe.size(); i++){
			lista.add(listaEquipe.get(i).getCapitaoEquip().getNome());
		}
		
		return (String [])lista.toArray(new String [lista.size()]);
	}

}
