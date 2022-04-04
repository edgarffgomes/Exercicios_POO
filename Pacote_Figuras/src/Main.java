
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------- Triângulo ------------");
		Triangulo t = new Triangulo();
		t.setBase(7);
		System.out.println(t.getBase());
		t.setAltura(4);
		System.out.println(t.getAltura());
		System.out.println(t.calculaArea());
		
		System.out.println("---------- Quadrado ------------");
		
		Quadrado q = new Quadrado();
		q.setLado(9);
		System.out.println(q.getLado());
		System.out.println(q.calculaArea());
		
		System.out.println("---------- Trapézio ------------");
		Trapezio tpz = new Trapezio();
		tpz.setBaseM(7);
		System.out.println(tpz.getBaseM());
		tpz.setBasem(3);
		System.out.println(tpz.getBasem());
		tpz.setAltura(5);
		System.out.println(tpz.getAltura());
		System.out.println(tpz.calculaArea());
		
	}

}
