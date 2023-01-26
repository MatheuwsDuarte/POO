import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
	
	//Nome: Matheus Duarte Gouveia de Souza - RA: 2417820

	public class conversorW{
		
		public static void main(String arg[]){

		InputStreamReader teclado =  new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(teclado);

		Boolean menu=true;
		String opcao="";	
		String valor="";

		System.out.println("\n Digite o valor da String: "); 
			try{ 
				valor = buff.readLine(); 
			} 
			catch(IOException e){ 
				System.out.println("\n Erro de entrada"); 
			} 

		while(menu){
		
			System.out.println("\t\t\n ***CONVERSOR*** ");
			System.out.println("\n [1]-INTEGER");
			System.out.println("\n [2]-BOOLEAN");
			System.out.println("\n [3]-CHARACTER");
			System.out.println("\n [4]-DOUBLE");
			System.out.println("\n [5]-BYTE");
			System.out.println("\n [6]-SHORT");
			System.out.println("\n [7]-FLOAT");
			System.out.println("\n [8]-LONG");
			System.out.println("\n [9]-SAIR");

			System.out.println("\n Digite a opcao: "); 
			try{ 
				opcao = buff.readLine(); 
			} 
			catch(IOException e){ 
				System.out.println("\n Erro de entrada"); 
			} 
		
			int escolha = Integer.parseInt(opcao);
		
			switch(escolha){
	
			case 1:
			
			System.out.println("\n String convertido para int:" + converterString_Int(valor));

			break;
				
			case 2:
		
			System.out.println("\n String convertido para bol: " + converterStringbol(valor));
			break;
		
			case 3:

			System.out.println("\n String convertido para char: " + converterStringchar(valor));
			break;
		
			case 4:

			System.out.println("\n String convertido para double:" + converterStringDouble(valor));
			break;
			
			case 5:

			System.out.println("\n String convertido para byte:" + converterStringByte(valor));
			break;

			case 6:

			System.out.println("\n String convertido para short:" + converterStringShort(valor));
			break;

			case 7:

			System.out.println("\n String convertido para float:" + converterStringFloat(valor));
			break;

			case 8:

			System.out.println("\n String convertido para long:" + converterStringLong(valor));
			break;
		
			case 9:

			System.out.println("\n DESLIGANDO... ");
			System.exit(0);
			break;
		
			default:

			System.out.println("\n Opcao invalida. ");
			break;

			}
		}

	}

//	i) Classe Integer: metodo parseInt();
//	ii) O metodo converterString_Int() ira converter o valor de uma String para o tipo primitivo int  
//	iii) <<http://www.linhadecodigo.com.br/artigo/3667/classes-wrappers-em-java.aspx>>

	public static int converterString_Int(String v){

		int valorInt = Integer.parseInt(v);

		return valorInt;

	}

//	i) Classe Boolean: metodo parseBoolean();
//	ii) O metodo converterStringbol(String v) ira converter o valor de uma String para o tipo primitivo boolean  
//	iii) <<http://www.linhadecodigo.com.br/artigo/3667/classes-wrappers-em-java.aspx>>

	public static Boolean converterStringbol(String v){
		
		boolean valorBool = Boolean.parseBoolean(v);

		return valorBool;
		
	}

//	i) Classe Character: metodo charAt();
//	ii) O metodo converterStringchar ira converter o valor de uma String para o tipo primitivo char  
//	iii) <<http://www.linhadecodigo.com.br/artigo/3667/classes-wrappers-em-java.aspx>>

	public static Character converterStringchar(String v){
		
		char valorChar = v.charAt(0);

		return valorChar;
		
	}
	
//	i) Classe Double: metodo parseDouble();
//	ii) O metodo converterStringDouble() ira converter o valor de uma String para o tipo primitivo double 
//	iii) <<http://www.linhadecodigo.com.br/artigo/3667/classes-wrappers-em-java.aspx>>

	public static Double converterStringDouble(String v){
		
		double valorDouble = Double.parseDouble(v);

		return	valorDouble;
		
	}
	
//	i) Classe Byte: metodo parseByte();
//	ii) O metodo converterStringByte() ira converter o valor de uma String para o tipo primitivo byte  
//	iii) <<http://www.linhadecodigo.com.br/artigo/3667/classes-wrappers-em-java.aspx>>

	public static Byte converterStringByte(String v){
		
		byte valorByte = Byte.parseByte(v);

		return valorByte;
		
	}
	
//	i) Classe Short: metodo parseShort();
//	ii) O metodo converterStringShort() ira converter o valor de uma String para o tipo primitivo short   
//	iii) <<http://www.linhadecodigo.com.br/artigo/3667/classes-wrappers-em-java.aspx>>

	public static Short converterStringShort(String v){
		
		short valorShort = Short.parseShort(v);

		return valorShort;
		
	}
	
//	i) Classe Float: metodo parseFloat();
//	ii) O metodo converterStringFloat() ira converter o valor de uma String para o tipo primitivo float 
//	iii) <<http://www.linhadecodigo.com.br/artigo/3667/classes-wrappers-em-java.aspx>>

	public static Float converterStringFloat(String v){
		
		float valorFloat = Float.parseFloat(v);


		return valorFloat;
		
	}
	
//	i) Classe Long: metodo parseLong();
//	ii) O metodo converterStringLong() ira converter o valor de uma String para o tipo primitivo long
//	iii) <<http://www.linhadecodigo.com.br/artigo/3667/classes-wrappers-em-java.aspx>>

	public static Long converterStringLong(String v){
		
		long valorLong = Long.parseLong(v);

		return valorLong;
		
	}

} 