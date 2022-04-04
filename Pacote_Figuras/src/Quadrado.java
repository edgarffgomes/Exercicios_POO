
public class Quadrado {
	private double lado;
	
	public void setLado(double l) {
		this.lado = l;
	}
	public double getLado() {
		return this.lado;
	}
	public double calculaArea() {
		return (Math.pow(lado, 2));
	}
}
