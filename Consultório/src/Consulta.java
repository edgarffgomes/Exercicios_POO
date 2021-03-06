
public class Consulta {
	private String data;
	private String hora;
	private Medico med;
	private Paciente pac;
	
	Consulta (String d, String h, Medico m, Paciente p){
		this.setData(d);
		this.setHora(h);
		this.setMedico(m);
		this.setPaciente(p);
	}
	
	public void setData(String d) {
		this.data = d;
	}
	public String getData() {
		return this.data;
	}
	public void setHora(String h) {
		this.hora = h;
	}
	public String getHora() {
		return this.hora;
	}
	public void setMedico(Medico m) {
		this.med = m;
	}
	public Medico getMedico() {
		return this.med;
	}
	public void setPaciente(Paciente p) {
		this.pac = p;
	}
	public Paciente getPaciente() {
		return this.pac;
	}
	public String mostrarConsulta() {
		return "O paciente " + this.pac.getNome() + " possui uma consulta com o m?dico " + this.med.getNome() + " marcada para o dia " +  this.getData() + " ?s " + this.getHora() + "horas.";
	}
}
