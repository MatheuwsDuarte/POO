import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

	//Nome: Matheus Duarte Gouveia de Souza - RA: 2417820

	public class  StringP{ 
		
		public static void main(String arg[]){ 

		InputStreamReader c = new InputStreamReader(System.in); 
		BufferedReader cd = new BufferedReader(c);

		
		int i=0, cont=0, n;
		String palavra="";
		String letra="";

			System.out.println("\n Digite uma palavra: "); 
			try{ 
				palavra = cd.readLine(); 
			} 
			catch(IOException e){ 
				System.out.println("\n Erro de entrada"); 
			} 

			System.out.println("\n Analisar Letra: "); 
			try{ 
				letra = cd.readLine(); 
			} 
			catch(IOException e){ 
				System.out.println("\n Erro de entrada"); 
			} 

			n= palavra.length();
			
			for(i=0; i<n; i++){

                		if((palavra.toUpperCase().charAt(i) == letra.toUpperCase().charAt(0)) && (palavra.toLowerCase().charAt(i) == letra.toLowerCase().charAt(0)))
               			{
					cont++;
                   			System.out.println("\n Esta na posicao: "+ i);      
                		}
				
			}
				
		System.out.println("\n Vezes que a letra '" + letra + "' apareceu: " + cont); 

		}

}