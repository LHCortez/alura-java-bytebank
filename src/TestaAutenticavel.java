
public class TestaAutenticavel {

	public static void main(String[] args) {

		Autenticavel g = new Gerente();
		g.setSenha(2212);

		Autenticavel adm = new Administrador();
		adm.setSenha(2222);

		Autenticavel c = new Cliente();
		c.setSenha(2222);

		
		//Lembrar que abaixo é o SistemaInterno que autentica os autenticaveis e não o contrário.
		
		SistemaInterno sis = new SistemaInterno();
		System.out.println("Gerente: ");
		sis.autentica(g);
		System.out.println("Administrador: ");
		sis.autentica(adm);
		System.out.println("Cliente: ");
		sis.autentica(c);
		
		
	}
}
