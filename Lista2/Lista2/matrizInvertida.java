import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
	
	//Nome: Matheus Duarte Gouveia de Souza - RA: 2417820

	public class matrizInvertida{

		public static void main(String arg[]){

			InputStreamReader bufeer = new InputStreamReader(System.in); 
			BufferedReader cd = new BufferedReader(bufeer);

			int l=0, c=0;
			String tamanhoLinha="";
			String tamanhoColuna="";

			System.out.println("\n Digite o tamanho da linha da matriz: "); 
			try{ 
				tamanhoLinha = cd.readLine(); 
			} 
			catch(IOException e){ 
				System.out.println("\n Erro de entrada"); 
			} 
		
			int tl = Integer.parseInt(tamanhoLinha);

			System.out.println("\n Digite o tamanho da coluna da matriz: "); 
			try{ 
				tamanhoColuna = cd.readLine(); 
			} 
			catch(IOException e){ 
				System.out.println("\n Erro de entrada"); 
			} 
		
			int tc = Integer.parseInt(tamanhoColuna);

			int matriz[][] = new int[tl][tc];

			for(l=0; l<tl; l++){

				for(c=0; c<tc; c++){	
					
					System.out.println("\t ");

					System.out.println(" Digite o numero da Matriz[" + l + "][" + c + "]: ");
					try{ 

					matriz[l][c] = Integer.parseInt(cd.readLine()); 

					} 
					catch(IOException e){ 

					System.out.println("\n Erro de entrada"); 

					} 
					
				}
			
			}

			for(l=tl-1; l>=0; l--){
				
				System.out.println("\t ");

				for(c=tc-1; c>=0; c--){	
					
					System.out.println("\t ");
					System.out.println(" [" + l + "][" + c + "]: " + matriz[l][c]);
					
				}
			
			}


			

			
		}

}