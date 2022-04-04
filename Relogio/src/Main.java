
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------- Data ------------");
		Data d = new Data();
		d.setDia(13);
		d.setMes(10);
		d.setAno(2005);
		System.out.println(d.retornaData());
		
		System.out.println("---------- Hora ------------");
		Hora h = new Hora();
		h.setHora(12);
		h.setMinutos(43);
		h.setSegundos(38);
		System.out.println(h.retornaHora());
		
		System.out.println("---------- Contato ------------");
		Contato c = new Contato();
		c.setNome("Marcelo Torres");
		c.setTelefone("(22)99999-9999");
		System.out.println(c.retornaContato());
		
	}

}
