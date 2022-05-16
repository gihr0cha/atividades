
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
			System.err.println("Sal�rio n�o pode ser menor que o sal�rio m�nimo!");
			this.salario = SALARIOMINIMO;
		}
		
		this.ativo = true;
	}
	
	void alterarSalario(double novoSalario) {
		if(novoSalario >= SALARIOMINIMO) {
			this.salario = novoSalario;
		}else {
			System.err.println("Sal�rio n�o pode ser menor que o sal�rio m�nimo!");
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
		String mensagem = "Funcion�rio "+ this.nome +" "+ this.sobrenome;
		mensagem += "\nCargo: "+ this.funcao;
		mensagem += "\nSal�rio R$"+this.salario; 
		return mensagem;
	}

	

}












