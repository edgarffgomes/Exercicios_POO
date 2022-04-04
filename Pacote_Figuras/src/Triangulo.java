
public class Triangulo {
	private double base;
	private double altura;

	public void setBase(double b) {
		this.base = b;
	}
	public double getBase() {
		return this.base;
	}
	public void setAltura(double a) {
		this.altura = a;
	}
	public double getAltura() {
		return this.altura;
	}
	public double calculaArea() {
		return (this.base * this.altura)/2;
	}
}
