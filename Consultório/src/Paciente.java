
public class Paciente {
	private String nome;
	private String cpf;
	private String dataN;
	
	Paciente(String n, String c, String d){
		this.setNome(n);
		this.setCPF(c);
		this.setDataN(d);
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	public String getNome() {
		return this.nome;
	}
	public void setCPF(String c) {
		this.cpf = c;
	}
	public String getCPF() {
		return this.cpf;
	}
	public void setDataN(String d) {
		this.dataN = d;
	}
	public String getDataN() {
		return this.dataN;
	}
}
