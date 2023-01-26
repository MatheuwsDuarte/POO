import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
	
	//Nome: Matheus Duarte Gouveia de Souza - RA: 2417820

	public class  Menuoperacao{ 
		
		public static void main(String arg[]){ 
		InputStreamReader c = new InputStreamReader(System.in); 
		BufferedReader cd = new BufferedReader(c);
		
		Boolean vai=true;
		String a ="";
		String b="";
		String opcao ="";
		
		System.out.println("\n Digite o primeiro numero: "); 
		try{ 
			a = cd.readLine(); 
		} 
		catch(IOException e){ 
			System.out.println("\n Erro de entrada"); 
		} 
		
		int x = Integer.parseInt(a);
		
		System.out.println("\n Digite o segundo numero: "); 
		try{ 
			b = cd.readLine(); 
		} 
		catch(IOException e){ 
			System.out.println("\n Erro de entrada"); 
		} 
		
		int y = Integer.parseInt(b);

		while(vai){
		
			System.out.println("\t\t\n ***MENU*** ");
			System.out.println("\n [1]-SOMA");
			System.out.println("\n [2]-SUBTRACAO");
			System.out.println("\n [3]-DIVISAO");
			System.out.println("\n [4]-MULTIPLICACAO");
			System.out.println("\n [5]-SAIR");

			System.out.println("\n Digite a opcao: "); 
			try{ 
				opcao = cd.readLine(); 
			} 
			catch(IOException e){ 
				System.out.println("\n Erro de entrada"); 
			} 
		
			int escolha = Integer.parseInt(opcao);
		
			switch(escolha){	
			case 1:

			System.out.println("\n Soma: " + soma(x,y));
			break;
		
			case 2:
		
			System.out.println("\n Subtracao: " + subtracao(x,y));
			break;
		
			case 3:
			System.out.println("\n Divisao: " + divisao(x,y));
			break;
		
			case 4:
			System.out.println("\n Multiplicacao: " + multiplicacao(x,y));
			break;
		
			case 5:
			System.out.println("\n DESLIGANDO... ");
			System.exit(0);
			break;
		
			default:
			System.out.println("\n Opcao invalida. ");
			break;

			}
		}	
		
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