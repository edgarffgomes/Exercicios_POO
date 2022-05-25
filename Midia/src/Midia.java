
import javax.swing.JOptionPane;
public class Midia {
	private int codigo;
	private double preco;
	private String nome;
	
	public Midia(){
		System.out.println("Mídia criada");
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
		return "Mída";
	}
	public String getDetalhes() {
		return "Código: " + this.codigo + " Preço: " + this.preco + " Nome: " + this.nome;
	}
	public void inserirDados() {
		this.codigo = (Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do código")));
		this.nome = (JOptionPane.showInputDialog("Digite o nome"));
		this.preco = (Double.parseDouble(JOptionPane.showInputDialog("Digite o preço")));
	}
}
