package classes;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import classes.UTIL.Equipe;

@SuppressWarnings("serial")
public class Inicial extends JFrame {
	
	private AcaoMenu action = new AcaoMenu();
	
	private Container contPanel;
	private Container contMenu;
	
	private JPanel jpCadas = new PanelCadas();
	private JPanel jpPlacar = new JPanel();
	
	private JButton jCad = new JButton("Equipes");
	private JButton jExit = new JButton("Sair");
	private JButton jPart = new JButton("Partida");
	
	private Equipe listaEquipe = new Equipe();
	
	
	public static void main(String[] args) {
		new Inicial();
	}
		
	public Inicial() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
		this.setTitle("MENU");
		this.setBounds(500, 100, 800, 500);
		this.setVisible(true);
		this.getContentPane().setLayout(new BorderLayout());
		
		contMenu = new JPanel();
		contMenu.setLayout(new GridLayout(1, 3));

		contPanel = new JPanel();
		contPanel.setLayout(new CardLayout());
		
		contPanel.add(jpCadas, 0);
		contPanel.add(jpPlacar, 1);
		
		contMenu.add(jCad);
		contMenu.add(jPart);
		contMenu.add(jExit);
				
		this.getContentPane().add(contMenu, BorderLayout.NORTH);
		this.getContentPane().add(contPanel, BorderLayout.CENTER);
		
		jCad.addActionListener(action);
		jPart.addActionListener(action);
		jExit.addActionListener(action);
		
	}	
	
	private class AcaoMenu implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == jCad){
				jpPlacar.setVisible(false);
				jpCadas.setVisible(true);
			}
			else
				if(e.getSource() == jPart){
				jpCadas.setVisible(false);
				jpPlacar.setVisible(true);
			}else
				if(e.getSource() == jExit){
			        System.exit(0);
				}
		}
		
	}
}
