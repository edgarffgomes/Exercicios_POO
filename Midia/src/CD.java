import java.util.Scanner;

import javax.swing.JOptionPane;
public class CD extends Midia{
	private int nMusicas;
	Scanner sc = new Scanner(System.in);
	
	public CD() {
		System.out.println("CD criado");
	}
	public CD(int c, double p, String n, int nM) {
		super(c, p, n);
		this.setNMusicas(nM);
	}
	public int getNMusicas() {
		return this.nMusicas;
	}
	public void setNMusicas(int nM) {
		this.nMusicas = nM;
	}
	public String getTipo() {
		return "Dvd";
	}
	public String getDetalhes() {
		return super.getDetalhes() + " Número de Músicas: " + this.getNMusicas();
	}
	public void inserirDados() {
		super.inserirDados();
		this.nMusicas = (Integer.parseInt(JOptionPane.showInputDialog("Digite o número de músicas")));
	}
}
