
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;
	private int senha;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public double getBonificacao() {
		System.out.println("Bonificação Gerente");
		return super.getSalario();
	}

}
