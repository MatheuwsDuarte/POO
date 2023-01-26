public class TestePessoa{

	public static void main(String arg[]){
		
		Leitura l = new Leitura();
		Pessoa p = new Pessoa();

		String x = p.setCpf(Integer.parseInt(l.entDados("\n CPF: ")));

		//int c = Integer.parseInt(c);

		//p.setCpf(c);

		String n = p.setNome(l.entDados("\n Nome: "));

		//p.setNome(n);
		
		System.out.println("\n CPF: "+ p.getCpf());
		System.out.println("\n Nome: "+ p.getNome());


		
	}

}//fim da classe