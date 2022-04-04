
public class Fatura {
	private String numero;
	private String descricao;
	private int qtdItem;
	private double precoItem;
	
	Fatura (String n, String d, int q, double p){
		this.setNumero(n);
		this.setDescricao(d);
		this.setQtdItem(q);
		this.setprecoItem(p);
	}
	public void setNumero(String n) {
		this.numero = n;
	}
	public String getNumero() {
		return this.numero;
	}
	
	public void setDescricao(String d) {
		this.descricao = d;
	}
	public String getDescricao() {
		return this.descricao;
	}
	public void setQtdItem(int q) {
		this.qtdItem = q;
	}
	public int getQtdItem() {
		return this.qtdItem;
	}
	public void setprecoItem(double p) {
		if(p<0) {
			p = 0.0;
		}
		this.precoItem = p;
	}
	public double getPrecoItem() {
		return this.precoItem;
	}
	public double getTotalFatura() {
		double t = this.precoItem * this.qtdItem;
		if(t < 0) {
			t = 0.0;
		}
		return t;
	}

}