
import javax.swing.JOptionPane;
public class Midia {
	private int codigo;
	private double preco;
	private String nome;
	
	public Midia(){
		System.out.println("M�dia criada");
	}
	public Midia(int c, double p, String n){
		this.codigo = c;
		this.preco = p;
		this.nome = n;
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int c) {
		this.codigo = c;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double p) {
		this.preco = p;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String n) {
		this.nome = n;
	}
	
	public String getTipo() {
		return "M�da";
	}
	public String getDetalhes() {
		return "C�digo: " + this.codigo + " Pre�o: " + this.preco + " Nome: " + this.nome;
	}
	public void inserirDados() {
		this.codigo = (Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do c�digo")));
		this.nome = (JOptionPane.showInputDialog("Digite o nome"));
		this.preco = (Double.parseDouble(JOptionPane.showInputDialog("Digite o pre�o")));
	}
}
