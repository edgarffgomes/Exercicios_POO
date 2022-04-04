
public class EmpregadoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empregado e1 = new Empregado("Renata", "Mesquita", 10000.00);
		Empregado e2 = new Empregado("Egdar", "Gomes", 5000.00);
		e2.setSobrenome("Edgar");
		System.out.println("Salario anual do(a) empregado(a)  " +  e1.getNome() + ": " + (e1.getSalarioM() * 12));
		System.out.println("Salario anual do(a) empregado(a)  " +  e2.getNome() + ": " + (e2.getSalarioM() * 12));
		e1.setSalarioM((e1.getSalarioM() + (e1.getSalarioM() * 10/100)));
		e2.setSalarioM((e2.getSalarioM() + (e2.getSalarioM() * 10/100)));
		System.out.println("Novo salario anual do(a) empregado(a)  " +  e1.getNome() + ": " + (e1.getSalarioM() * 12));
		System.out.println("Novo salario anual do(a) empregado(a)  " +  e2.getNome() + ": " + (e2.getSalarioM() * 12));
		}

}
