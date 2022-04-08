package filme;

public class TestarFilme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Filme filme1 = new Filme();
		System.out.println("--------- Filme 1 ----------");
		filme1.setTitulo("Vingadores");
		filme1.setDuracaoEmMinutos(142);
		System.out.println(filme1.exibirDuracaoEmHoras());
		
		Filme filme2 = new Filme();
		System.out.println("--------- Filme 2 ----------");
		filme2.setTitulo("Hotel Transilvânia");
		filme2.setDuracaoEmMinutos(93);
		System.out.println(filme2.exibirDuracaoEmHoras());
		System.out.println("Os filmes em cartaz são " + filme1.getTitulo() + " e " + filme2.getTitulo());
		
		Filme filme3 = new Filme();
		System.out.println("--------- Filme 3 ----------");
		filme3.setTitulo("Batman");
		filme3.setDuracaoEmMinutos(175);
		System.out.println(filme3.exibirDuracaoEmHoras());
	
		Filme filme4 = new Filme();
		System.out.println("--------- Filme 4 ----------");
		filme4.setTitulo("Mad Max");
		filme4.setDuracaoEmMinutos(120);
		System.out.println(filme4.exibirDuracaoEmHoras());
		
		Filme filme5 = new Filme();
		System.out.println("--------- Filme 5 ----------");
		filme5.setTitulo("Duna");
		filme5.setDuracaoEmMinutos(155);
		System.out.println(filme5.exibirDuracaoEmHoras());
		
		Filme filme6 = new Filme();
		System.out.println("--------- Filme 6 ----------");
		filme6.setTitulo("CODA");
		filme6.setDuracaoEmMinutos(111);
		System.out.println(filme6.exibirDuracaoEmHoras());
		
		Filme filme7 = new Filme();
		System.out.println("--------- Filme 7 ----------");
		filme7.setTitulo("Luca");
		filme7.setDuracaoEmMinutos(96);
		System.out.println(filme7.exibirDuracaoEmHoras());
		System.out.println("Os filmes em cartaz são " + filme1.getTitulo() + " , " + filme2.getTitulo() + " , " + filme3.getTitulo() + " , " + filme4.getTitulo() + " , " + filme5.getTitulo() + " , " + filme6.getTitulo() + " e " + filme7.getTitulo());
	}

}
