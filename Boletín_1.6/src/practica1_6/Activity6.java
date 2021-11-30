package practica1_6;

public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MAX = 1000;
		int a = 3;
		int b = 4;
		int i = 0;
		double x = 0;
		char c ;
		String s;
		
		System.out.println(i = (990 - MAX) / a); 
		//System.out.println(i = b / 0);
		//esta sentencia no es posible porque pide dividir un numero por 0
		System.out.println(i = a % (MAX - 990));
		System.out.println(i = (MAX - 990) % a);
		//System.out.println(i = 3.34 * a);
		//esta sentencia no es valida porque a que es un valor int no se puede multiplicar por un numero decimal puesto que a se haria double y no se le puede asignar un double a un int
		System.out.println(x = a / b);
		//System.out.println(x = a % (a / b));
		//esta sentencia no es valida porque no puede sacar valores decimales.
		System.out.println(i = a / b);
		System.out.println(i=++a);
		System.out.println(i=a++);
		//System.out.println(c=''';);
		//esta sentencia no es valida porque los caracteres que hay dentro no son validos
		System.out.println(c='”');
		//System.out.println(s='c');
		//esta sentencia no es valida porque s y c son variables diferentes que no se pueden insertar una en otra
		//System.out.println(s=”'”);
		//esta sentencia no es valida porque es una expresion no valida, las comillas hacen que el parentesis no funcione.
		//System.out.println(s=”””);
		//esta sentencia no es valida
		System.out.println(c='\u0041');
		System.out.println(c=65);
		
	}

}
