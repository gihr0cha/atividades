
public class PrincipalFuncionario {

	public static void main(String[] args) {
		Funcionario umFuncionario = new Funcionario("Heitor", "Barros", -1000.00, "Professor");
		Funcionario outroFuncionario = new Funcionario("Fernando", "Wagner", 50000.00, "Professor");
		
		Gerente gerente = new Gerente("Fábio", "Ferraz", 80000.00, "Gerente dos Professores");
		
		System.out.println(gerente);
		
		gerente.promover(umFuncionario, "auxiliar");
		System.out.println(umFuncionario);

		gerente.promover(umFuncionario, "coordenador");
		System.out.println(umFuncionario);
		
		gerente.promover(gerente, "gerente geral");
		System.out.println(gerente);
		
	}

}
