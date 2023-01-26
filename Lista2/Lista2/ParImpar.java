import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

	//Nome: Matheus Duarte Gouveia de Souza - RA: 2417820

	public class  ParImpar{ 
		
		public static void main(String arg[]){ 
		InputStreamReader c = new InputStreamReader(System.in); 
		BufferedReader cd = new BufferedReader(c);
		
		String numero = "";
		
		System.out.println("\n\t ***VERIFICAR SE E PAR OU IMPAR*** "); 
		
		
		System.out.println("\n Digite um numero: "); 
		try{ 
			numero = cd.readLine(); 
		} 
		catch(IOException e){ 
			System.out.println("\n Erro de entrada"); 
		} 

		int n = Integer.parseInt(numero);

		if(n%2==0){
			System.out.println("\n\t " + n + " e par."); 
		}
		else{
			System.out.println("\n\t " + n + " e impar.");
		}
	}
}