
public class Data {
	private int dia;
	private int mes;
	private int ano;
	Data(int d, int m , int a){
		this.setDia(d);
		this.setMes(m);
		this.setAno(a);
		
	}
	public void setDia(int d) {
		this.dia = d;
	}
	public int getDia() {
		return this.dia;
	}
	public void setMes(int m) {
		this.mes = m;
	}
	public int getMes() {
		return this.mes;
	}
	public void setAno(int a) {
		this.ano = a;
	}
	public int getAno() {
		return this.ano;
	}
	public String displayData() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}