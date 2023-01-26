public class TstHer{

	public static void main(String arg[]){ //class Loader

		Aluno a = new Aluno();
		Professor p = new Professor();
				
		System.out.println("\n =====ALUNO=====");

		a.setRa(7);
		a.setCurso("Eng. Comput.");
		a.setCpf(34);
		a.setNome("Aluno A");

		System.out.println("\nRA - Aluno: "+a.getRa());
		System.out.println("CURSO - Aluno: "+a.getCurso());

		System.out.println("\nCPF - Aluno: "+a.getCpf());
		System.out.println("NOME - Aluno: "+a.getNome());



		System.out.println("\n =====PROFESSOR=====");

		p.setCodP(24178118);
		p.setTituloP("Doutorado");
		p.setCpf(221);
		p.setNome("Jose");
		
		System.out.println("\nCPF - Professor: "+p.getCodP());
		System.out.println("NOME - Professor: "+p.getTituloP());

		System.out.println("\nCPF - Professor: "+p.getCpf());
		System.out.println("NOME - Professor: "+p.getNome());

	
	}// fim do main


}//fim da classe








