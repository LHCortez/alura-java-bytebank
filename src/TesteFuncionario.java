
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario luiz = new Gerente();
		luiz.setNome("Luiz Humberto Cortez");
		luiz.setCpf("xxx.xxx.xxx-xx");
		luiz.setSalario(5000);
		
		System.out.println(luiz.getNome());
		System.out.println(luiz.getCpf());
		System.out.println(luiz.getSalario());
		System.out.println(luiz.getBonificacao());
		System.out.println("Salário total: "+(luiz.getSalario() + luiz.getBonificacao()));
	}

}
