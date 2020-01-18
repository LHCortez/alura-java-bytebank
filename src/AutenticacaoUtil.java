
public class AutenticacaoUtil {

	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica() {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}
