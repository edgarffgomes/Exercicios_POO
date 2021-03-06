
public class Aluno {
	private String nome;
	private String disciplina;
	private double mFinal;
	
	Aluno (String n, String d, double mf){
		this.setNome(n);
		this.setDisciplina(d);
		this.setMFinal(mf);
	}
	public void setNome(String n) {
		this.nome = n;
	}
	public String getNome() {
		return this.nome;
	}
	public void setDisciplina(String d) {
		this.disciplina = d;
	}
	public String getDisciplina() {
		return this.disciplina;
	}
	public void setMFinal(double mf) {
		this.mFinal = mf;
	}
	public double getMFinal() {
		return this.mFinal;
	}
	public String mostrarAluno() {
		return ("Aluno: " + this.nome + " Disciplina: " + this.disciplina + " M?dia final: " + this.mFinal);
	}
	public String retornaSituacao() {
		if(this.mFinal > 6.0) {
			return("Aprovado!");
		}
		else {
			return("Reprovado!");
		}
	}

}

