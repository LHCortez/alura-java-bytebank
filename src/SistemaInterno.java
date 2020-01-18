
public class SistemaInterno {
	
	private int senha=2222;
	
	public void autentica(Autenticavel aut) {
	
		boolean autenticou =aut.autentica(this.senha);
		
		if (autenticou==true) {
			System.out.println("Acesso Liberado ao Sistema.");
		}else {
			System.out.println("Acesso Negado ao Sistema.");
		}
	}

}
