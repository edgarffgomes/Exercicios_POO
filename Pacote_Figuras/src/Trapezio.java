
public class Trapezio {
	private double baseM;
	private double basem;
	private double altura;
	
	public void setBaseM(double bM) {
		if(bM> this.basem) {
			this.baseM = bM;
		} else {
			System.out.println("Valor inválido");
		}
	}
	public double getBaseM() {
		return this.baseM;
	}
	
	public void setBasem(double bm) {
		if(bm<this.baseM) {
			this.basem = bm;
		} else {
			System.out.println("Valor inválido");
		}
	}
	public double getBasem() {
		return this.basem;
	}
	
	public void setAltura(double a) {
		this.altura = a;
	}
	public double getAltura() {
		return this.altura;
	}
	
	public double calculaArea() {
		return ((this.baseM + this.basem)* this.altura)/2;
	}
}
