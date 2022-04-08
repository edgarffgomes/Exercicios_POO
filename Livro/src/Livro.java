
public class Livro {
	private String titulo;
	private int qtdPaginas;
	private int paginasLidas;
	Livro(){
		this.setTitulo("");
		this.setQtdPaginas(0);
		this.setPaginasLidas(0);
	}
	Livro(String t, int qp,int pl){
		this.setTitulo(t);
		this.setQtdPaginas(qp);
		this.setPaginasLidas(pl);
	}
	public void setTitulo(String t) {
		this.titulo = t;
	}
	public String getTitulo() {
		return this.titulo;
	}
	public void setQtdPaginas(int qp) {
		this.qtdPaginas = qp;
	}
	public int getQtdPaginas() {
		return this.qtdPaginas;
	}
	public void setPaginasLidas(int pl) {
		if(pl<=this.qtdPaginas) {
			this.paginasLidas = pl;
		}
		else {
			this.paginasLidas = this.qtdPaginas;
		}
	}
	public int getPaginasLidas() {
		return this.paginasLidas;
	}
	public String verificarProgresso() {
		float p = (this.paginasLidas * 100)/this.qtdPaginas;
		return("Você já leu " + p + " por cento do livro");
	}
}
