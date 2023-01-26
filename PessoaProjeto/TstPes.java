public class TstPes{

	public static void main(String arg[]){ //class Loader

		Leitura l = new Leitura();
		Pessoa p = new Pessoa(p.getCpf, p.getNome, new Endereco);

		//Endereco e = new Endereco();
		//e.setRua("Rua 1");
		//e.setNum(25);
		//p.setEnder(e);

		p.getEnder().setNum(16);
		p.getEnder().setRua("Jesus Cristo");

		p.getCid().setNomeCid("Salto");
		p.getCid().setUfCid("Sao Paulo");
		p.getCid().setCodCid("13324408");

		p.setCpf(Integer.parseInt(l.entDados("\nCPF: ")));
		p.setNome(l.entDados("\nNOME: "));

		System.out.println("\nCPF.: "+p.getCpf());
		System.out.println("NOME: "+p.getNome());

		System.out.println("\nRua.: "+p.getEnder().getRua());
		System.out.println("Numero: "+p.getEnder().getNum());

		System.out.println("\nCidade: "+p.getCid().getNomeCid());
		System.out.println("Estado: "+p.getCid().getUfCid());
		System.out.println("CEP: "+p.getCid().getCodCid());

	}// fim do main


}//fim da classe








