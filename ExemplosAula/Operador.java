public class Operador{	
	public static void main(String arg[]){
		System.out.println("\t OPERACOES ");
		
		int x = Integer.parseInt(arg[0]);
		int y = Integer.parseInt(arg[1]);
		
		
		System.out.println("\n Soma: " + soma(x,y));

		
		System.out.println("\n Subtracao: " + subtracao(x,y));
		
		
		System.out.println("\n Divisao: " + divisao(x,y));
		
		
		System.out.println("\n Multiplicacao: " + multiplicacao(x,y));

	
	}

	public static int soma(int x, int y){
		int resposta = x+y;	

		return resposta;
	}

	public static int subtracao(int x, int y){
		int resposta = x-y;
		
		return resposta;
	
	}
	
	public static int divisao(int x, int y){
		int resposta = x/y;
		
		return resposta;
	
	}
	
	

	public static int multiplicacao(int x, int y){
		int resposta = x*y;	
		
		return resposta;
	}
}