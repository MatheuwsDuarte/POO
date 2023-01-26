public class Calculos{
	
	int x= 10, y=10;

	public static void main(String arg[]){

		Calculos soma, sub, mult, div; //Declaracao
		
		soma = new Calculos();	//Metodo contrutor -> informar as dimensoes(tamanho) da variavel durante o processo
		sub = new Calculos();	//de INSTANCIACAO: nasce o objeto.
		mult = new Calculos();
		div = new Calculos();

		soma.fsoma();
		sub.fsub();
		mult.fmult();
		div.fdiv();

		System.gc(); //Limpa objetos que perderam a referencia.


	}

	public void fsoma(){
		System.out.println("\n Soma e: " + (x+y));
	}

	public void fsub(){
		System.out.println("\n Subtracao e: " + (x-y));
	}

	public void fmult(){
		System.out.println("\n Multipliacao e: " + (x*y));
	}

	public void fdiv(){
		System.out.println("\n Divisao e: " + (x/y));
	}

}