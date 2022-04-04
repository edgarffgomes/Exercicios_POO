
public class Contato {
	private String nome;
	private String telefone;
	
	public void setNome(String n) {
		this.nome = n;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setTelefone(String t) {
		this.telefone = t;
	}
	public String getTelefone() {
		return this.telefone;
	}
	public String retornaContato() {
		return this.nome + " - " + this.telefone;
	}

}
