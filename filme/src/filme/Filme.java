package filme;

public class Filme {
	private String titulo;
	private int duracaoEmMinutos;
	
	public Filme(){
		this.setTitulo("");
		this.setDuracaoEmMinutos(0);
	}
	public Filme (String t, int dm){
		this.setTitulo(t);
		this.setDuracaoEmMinutos(dm);
	}
	
	public void setTitulo(String t) {
		this.titulo = t;
	}
	public String getTitulo() {
		return this.titulo;
	}
	public void setDuracaoEmMinutos(int dm) {
		this.duracaoEmMinutos = dm;
	}
	public int getDuracaoEmMinutos() {
		return this.duracaoEmMinutos;
	}
	public String exibirDuracaoEmHoras() {
		double minutos = this.duracaoEmMinutos % 60;
		double horas = (this.duracaoEmMinutos - minutos)/60;
		return ("O filme " + this.titulo + " possui " + horas + " horas e " + minutos + " minutos de duração.");
		
	}
}
