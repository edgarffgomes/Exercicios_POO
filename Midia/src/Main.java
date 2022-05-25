public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Midia m1 = new Midia();
		m1 = new CD(1, 15.90, "DAMN.", 16);
		System.out.println(m1.getDetalhes());
		Midia m2 = new Midia();
		m2 = new DVD();
		m2.inserirDados();
		System.out.println(m2.getDetalhes());
		
	}

}
