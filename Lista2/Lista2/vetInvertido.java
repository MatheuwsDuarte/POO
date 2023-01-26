import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 	
	
	//Nome: Matheus Duarte Gouveia de Souza - RA: 2417820

	public class vetInvertido{
		public static void main(String arg[]){

			InputStreamReader c = new InputStreamReader(System.in); 
			BufferedReader cd = new BufferedReader(c);

			int i=0, j=0;
			String tamanho="";

			System.out.println("\n Digite o tamanho do vetor: "); 
			try{ 
				tamanho = cd.readLine(); 
			} 
			catch(IOException e){ 
				System.out.println("\n Erro de entrada"); 
			} 
		
			int t = Integer.parseInt(tamanho);
		
			int vet[] = new int[t];

			for(i=0; i<t;i++){
						
				System.out.println("\n Digite o numero do vet [" + i + "]: "); 
				try{ 
					vet[i] = Integer.parseInt(cd.readLine()); 
				} 
				catch(IOException e){ 
					System.out.println("\n Erro de entrada"); 
				} 
			
			}
				
			for(j=t-1; j>=0; j--){
				
				System.out.println("\n vet [" + i + "]:" + vet[j]); 

			}

		}

}
