
public class TesteReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Huguinho");
		g1.setSalario(5000.00);

		Designer d = new Designer();
		d.setNome("Luizinho");
		d.setSalario(2000.00);

		EditorVideo ev = new EditorVideo();
		ev.setNome("Zezinho");
		ev.setSalario(2500.00);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(d);
		controle.registra(ev);
		
		System.out.println(controle.getSoma());
	}
}
