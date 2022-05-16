
public class Gerente extends Funcionario {

	
	Gerente(String nome, String sobrenome, double salario, String funcao){
		super(nome, sobrenome, salario, funcao);
	}
	
	void promover(Funcionario funcionario, String funcao) {
		switch(funcao) {
		case "auxiliar":
			funcionario.alterarSalario(1500.00);
			funcionario.alterarFuncao("Auxiliar");
			break;
		case "assistente":
			funcionario.alterarSalario(3500.00);
			funcionario.alterarFuncao("Assistente");
			break;
		case "coordenador":
			funcionario.alterarSalario(5000.00);
			funcionario.alterarFuncao("Coordenador");
			break;
		case "gerente geral":
			funcionario.alterarSalario(30000.00);
			funcionario.alterarFuncao("Gerente Geral");
			break;
		default:
			System.err.println("Função não cadastrada.");
			break;
		}
	}
	
	
	public String toString() {
		String mensagem = "Gerente "+ this.nome +" "+ this.sobrenome;
		mensagem += "\nCargo: "+ this.funcao;
		mensagem += "\nSalário R$"+this.salario; 
		return mensagem;
	}
}
