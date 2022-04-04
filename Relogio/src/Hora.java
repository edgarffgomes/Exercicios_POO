
public class Hora {
	private int hora;
	private int minutos;
	private int segundos;
	
	public void setHora(int h) {
		if(h>=0 && h<25) {
			this.hora = h;
		} else {
			System.out.println("Valor inválido para hora.");
		}
	}
	public int getHora() {
		return this.hora;
	}
	public void setMinutos(int m) {
		if(m>=0 && m<60) {
			this.minutos = m;
		} else {
			System.out.println("Valor inválido para minutos.");
		}
	}
	public int getMinutos() {
		return this.minutos;
	}
	public void setSegundos(int s) {
		if(s>=0 && s<60) {
			this.segundos = s;
		} else {
			System.out.println("Valor inválido");
		}
	}
	public int getSegundos() {
		return this.segundos;
	}
	public String retornaHora() {
		return this.hora + ":" + this.minutos + ":" + this.segundos;
	}
}
