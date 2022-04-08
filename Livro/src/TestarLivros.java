
public class TestarLivros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro livrofavorito = new Livro();
		System.out.println("----------- Livro 1 ----------");
		livrofavorito.setTitulo("O Pequeno Príncipe");
		livrofavorito.setQtdPaginas(98);
		System.out.println("O livro " + livrofavorito.getTitulo() + " possui " + livrofavorito.getQtdPaginas() +  " páginas");
		livrofavorito.setPaginasLidas(20);
		System.out.println(livrofavorito.verificarProgresso());
		livrofavorito.setPaginasLidas(50);
		System.out.println(livrofavorito.verificarProgresso());
		
		System.out.println("----------- Livro 2 ----------");
		Livro segundolivro = new Livro();
		segundolivro.setTitulo("1984");
		segundolivro.setQtdPaginas(215);
		System.out.println("O livro " + segundolivro.getTitulo() + " possui " + segundolivro.getQtdPaginas() +  " páginas");
		segundolivro.setPaginasLidas(80);
		System.out.println(segundolivro.verificarProgresso());
		segundolivro.setPaginasLidas(162);
		System.out.println(segundolivro.verificarProgresso());
		
		System.out.println("----------- Livro 3 ----------");
		Livro terceirolivro = new Livro();
		terceirolivro.setTitulo("O Príncipe");
		terceirolivro.setQtdPaginas(100);
		System.out.println("O livro " + terceirolivro.getTitulo() + " possui " + terceirolivro.getQtdPaginas() +  " páginas");
		terceirolivro.setPaginasLidas(15);
		System.out.println(terceirolivro.verificarProgresso());
		terceirolivro.setPaginasLidas(100);
		System.out.println(terceirolivro.verificarProgresso());
		
		System.out.println("----------- Livro 4 ----------");
		Livro quartolivro = new Livro();
		quartolivro.setTitulo("As Aventuras de Pi");
		quartolivro.setQtdPaginas(315);
		System.out.println("O livro " + quartolivro.getTitulo() + " possui " + quartolivro.getQtdPaginas() +  " páginas");
		quartolivro.setPaginasLidas(90);
		System.out.println(quartolivro.verificarProgresso());
		quartolivro.setPaginasLidas(213);
		System.out.println(quartolivro.verificarProgresso());
	}

}
