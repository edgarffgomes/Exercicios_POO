
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Especialidade e = new Especialidade("Pediatria");
		Medico m = new Medico("Roberto", "1", e);
		Paciente p = new Paciente("Angélica", "4", "15/01/2020");
		Consulta c  = new Consulta("05/04/2022", "11:15", m, p);
		System.out.println(c.mostrarConsulta());
		
	}

}
