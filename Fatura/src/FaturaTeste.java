
public class FaturaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fatura f = new Fatura("1665", "Cartão de Crédito", 3, 45.90);
		System.out.println(f.getNumero());
		System.out.println(f.getDescricao());
		System.out.println(f.getQtdItem());
		System.out.println(f.getPrecoItem());
		System.out.println(f.getTotalFatura());
	}

}
