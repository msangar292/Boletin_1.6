package practica1_6;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int lado1 = 3;
		double precio = 325.6;
		//int lado2 = 4;
		boolean comprar = false;
		int ch = 7;
		//int hipotenusa = 5;
		
		System.out.println(5 * precio - 1.50);
		//esta expresion no da un resultado booleano porque es una operacion entre numeros enteros con un double
		System.out.println((precio < 300 + 0.1 * precio) || comprar);
		//esta expresion da un valor booleano y da true
		//System.out.println(Math.sqrt(lado1) + Math.sqrt(lado2) = Math.sqrt(hipotenusa));
		//esta expresion es erronea, el igual deberia de ser un <= o un >=.
		//System.out.println((!comprar) && (precio + 125.3));
		//esta expresion es erronea, porque no se puede usar con boolean y double
		System.out.println((ch <= 'A') && comprar);
		//esta expresion da un valor booleano y da false
		//System.out.println(ch = '7' || ! comprar);
		//esta expresion es erronea, no se puede usar || para un valor int con un valor boolean
		
		
		
		
	}

}
