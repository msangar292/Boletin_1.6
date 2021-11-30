package practica1_6;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	boolean a; a = true;
	boolean b; b = false;
	boolean c; c = true;
	
	/*a)*/ boolean resultado2_1;
	resultado2_1 = (a && b || a && b);
	System.out.println("el resultado es " + resultado2_1);
	/*b)*/ boolean resultado2_2;
	resultado2_2 = ((a || !b) && (!a || c));
	System.out.println("el resultado es " + resultado2_2);
	/*c)*/ boolean resultado2_3;
	resultado2_3 = (a || b && c);
	System.out.println("el resultado es " + resultado2_3);
	/*d)*/ boolean resultado2_4;
	resultado2_4 = (!(a || b) && c);
	System.out.println("el resultado es " + resultado2_4);
	}
		{
	
}
}
