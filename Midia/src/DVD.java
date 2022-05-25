import javax.swing.JOptionPane;

public class DVD extends Midia {
	private int nFaixas;
	
	public DVD(){
		System.out.println("Dvd criado!");
	}
	public DVD(int c, double p, String n, int nF) {
		super(c, p, n);
		this.setNFaixas(nF);
	}
	public int getNFaixas() {
		return this.nFaixas;
	}
	public void setNFaixas(int nF) {
		this.nFaixas = nF;
	}
	public String getTipo() {
		return "Dvd";
	}
	public String getDetalhes() {
		return super.getDetalhes() + " Número de faixas: " + this.getNFaixas();
	}
	public void inserirDados() {
		super.inserirDados();
		this.nFaixas = (Integer.parseInt(JOptionPane.showInputDialog("Digite o número de faixas")));
	}
}
