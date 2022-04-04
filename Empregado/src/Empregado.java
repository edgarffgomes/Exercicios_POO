
public class Empregado {
	private String nome;
	private String sobrenome;
	private double salarioM;
	
	Empregado(String n, String sn, double s){
		this.setNome(n);
		this.setSobrenome(sn);
		this.setSalarioM(s);
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public String getNome() {
		return this.nome;
	}
	public void setSobrenome(String sn) {
		this.sobrenome = sn;
	}
	public String getSobrenome() {
		return this.sobrenome;
	}
	public void setSalarioM(double s) {
		this.salarioM = s;
	}
	public double getSalarioM() {
		return this.salarioM;
	}
}
