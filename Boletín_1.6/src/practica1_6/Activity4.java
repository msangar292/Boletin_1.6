package practica1_6;

public class Activity4 {

	public static void main(String[] args) {
		
	boolean z; 
	int a = 0;
	//boolean x = true;
	int b = 0;
	z = 2 < 1;
	int precio = 1;
	System.out.println(z);
	//z es valido, su ejecucion nos da un boolean false y la variable debe de ser de tipo boolean.
	a = a + 1;
	System.out.println(a);;
	//a es valido si primero se inicializa, es decir, le damos un valor inicial, su ejecucion nos da un int que es el tipo de variable que debemos de usar
	//System.out.println( Math.sqrt(3) = 32717);
	//la variable sqrt no funciona porque tiene un valor asignado y no se le puede asignar a sqrt.
	//'x' = 'y';
	//esta funcion no es valida porque las comillas no tienen ninguna funcion.
	//x = 'y';
	//esta funcion no es valida porque las comillas que tiene y no tienen funcion
	System.out.println(a = b); 
	//esta funcion es valida, las dos variables tienen que ser del mismo tipo, en este caso int, y convierte el valor de b en el valor de a
	 System.out.println(precio = precio - precio *(30/100)); 
	 //la funcion es valida, saca por consola el resultado de la operacion y la variable precio debe de ser de un tipo que pueda contener valores numericos.
	 
	}
	

}
