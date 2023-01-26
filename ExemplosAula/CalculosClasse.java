public class Calculos{
	
	int x= 10, y=10;

	public static void main(String arg[]){

		Calculos soma, sub, mult, div;
		
		soma = new Calculos();	
		sub = new Calculos();
		mult = new Calculos();
		div = new Calculos();

		soma.fsoma();
		sub.fsub();
		mult.fmult();
		div.fdiv();

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