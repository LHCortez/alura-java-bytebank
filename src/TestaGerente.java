
public class TestaGerente {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setCpf("123.456.789-00");
		g1.setNome("Tio Patinhas");
		g1.setSalario(10000.00);

		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println(g1.getBonificacao());
		
		g1.setSenha(123456);
		boolean autenticou =g1.autentica(123456);
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());

	}
}