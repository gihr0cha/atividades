
public class MenorAprendiz extends Funcionario {

	String escola;
	String curso;
	
	MenorAprendiz(String nome, String sobrenome, double salario, String funcao, String escola, String curso) {
		super(nome, sobrenome, salario, funcao);
		
		this.escola = escola;
		this.curso = curso;
	}

}
