public class Objt{

	static int x = 30;

	public static void main(String arg[]){


	x = 40;

	System.out.println("\n 1- Valor de x MAIN: " + x);

	Objt obj;
	obj = new Objt();
	obj.x = 16;
	obj.mostrar();
	obj.mostrarEnd(obj);

	System.out.println("\n 2- Valor de x MAIN: " + x);

	Objt obj2;
	obj2 = new Objt();
	obj2.x = 25;
	obj2.mostrar();	
	obj2.mostrarEnd(obj2);

	System.out.println("\n 3- Valor de x MAIN: " + x);



	}

	public void mostrar(){
	
		System.out.println("\n Valor de x: " + x);

	}

	public void mostrarEnd(Objt o){
	
		System.out.println("\n Valor de Endereco de x: " + o);

	}



}