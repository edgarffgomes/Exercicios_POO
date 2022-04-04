
public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public void setDia(int d) {
		if(d>0 && d<32) {
			this.dia = d;
		} else {
			System.out.println("Valor inválido");
		}
	}
	public int getDia() {
		return this.dia;
	}
	public void setMes(int m) {
		if(m>0 && m<13) {
			this.mes = m;
		} else {
			System.out.println("Valor inválido");
		}
	}
	public int geMes() {
		return this.mes;
	}
	public void setAno(int a) {
		if(a>0) {
			this.ano = a;
		} else {
			System.out.println("Valor inválido");
		}
	}
	public int getAno() {
		return this.ano;
	}
	
	public String retornaData() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}
