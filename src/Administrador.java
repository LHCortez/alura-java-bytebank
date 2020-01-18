
public class Administrador extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;
	private int senha;

	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;

	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public double getBonificacao() {
		System.out.println("Bonificação Administrador");
		return 50;
	}
}
