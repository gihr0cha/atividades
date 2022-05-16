
public class Funcionario {
	
	String nome;
	String sobrenome;
	double salario;
	String funcao;
	boolean ativo;
	final double SALARIOMINIMO = 1100;
	
	Funcionario(String nome, String sobrenome, double salario, String funcao){
		
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.funcao = funcao;
		if(salario >= SALARIOMINIMO) {
			this.salario = salario;
		}else {
			System.err.println("Salário não pode ser menor que o salário mínimo!");
			this.salario = SALARIOMINIMO;
		}
		
		this.ativo = true;
	}
	
	void alterarSalario(double novoSalario) {
		if(novoSalario >= SALARIOMINIMO) {
			this.salario = novoSalario;
		}else {
			System.err.println("Salário não pode ser menor que o salário mínimo!");
		}
	}
	
	void demitir() {
		this.ativo = false;
	}
	
	void readmitir() {
		this.ativo = true;
	}
	
	void alterarFuncao(String novaFuncao) {
		this.funcao = novaFuncao;
	}
	
	public String toString() {
		String mensagem = "Funcionário "+ this.nome +" "+ this.sobrenome;
		mensagem += "\nCargo: "+ this.funcao;
		mensagem += "\nSalário R$"+this.salario; 
		return mensagem;
	}

	

}












