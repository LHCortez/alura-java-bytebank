
public class TesteSistema {

	public static void main(String[] args) {
	
		//Cria o gerente e seta a senha.
		Gerente g = new Gerente();
		g.setSenha(2222);
		
		//Cria o Sistema e autentica o gerenete acima.
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		
		

	}

}
