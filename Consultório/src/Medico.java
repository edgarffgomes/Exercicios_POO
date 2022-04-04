public class Medico {
	private String nome;
	private String crm;
	private Especialidade especialidade;
	
	Medico (String n, String c, Especialidade e){
		this.setNome(n);
		this.setCRM(c);
		this.setEspecialidade(e);
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public String getNome() {
		return this.nome;
	}
	public void setCRM(String c) {
		this.crm = c;
	}
	public String getCRM() {
		return this.crm;
	}
	public void setEspecialidade(Especialidade e) {
		this.especialidade = e;
	}
	public Especialidade getEspecialidade() {
		return this.especialidade;
	}
}
