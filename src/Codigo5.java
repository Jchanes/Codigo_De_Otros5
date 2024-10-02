import java.util.Scanner;

public class Codigo5 {
	
	public static void main(String[] args) {

	    Scanner s = new Scanner(System.in);
	    System.out.print("Introduzca un número: ");
	    int ni = s.nextInt();
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (ni > 0) {
		  int digito = (afo%10==0);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
		  
		  ni /= 10;
	    }
	    if (afo > noAfo) {
	      System.out.println("El " + c + " es un número afortunado.");
	    } else {
	      System.out.println("El " + c + " no es un número afortunado.");
	    }
	    
	  }
	}//main method
	  
	}//class Codigo5