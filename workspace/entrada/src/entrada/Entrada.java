package entrada;

import java.util.Scanner ;

public class Entrada {
	
		
		public static void main (String a []) {
			Scanner X= new Scanner (System.in);
			int r = X.nextInt();
			Scanner y= new Scanner (System.in);
			int m = y.nextInt();
			System.out.println("El primer valor dijitado es " + r);
			System.out.println("El segundo valor dijitado es " + m );
			System.out.println(r+m);
			
			int z;
			z=r;
			r=m;
			m=z;
			System.out.println("Valor de r ");
			System.out.println("valor de m ");
			
			if (r>m)
				System.out.println("r Mayor " + Math.pow(r, m));
			else
				System.out.println("m Mayor " + Math.pow(m,r));
			
			int resta,resta2; 
			
			resta= r%3;
			resta2= m%3;
			
			if(resta==0)
				System.out.println(r+ " Es multiplo de " + 3);
			else 
				System.out.println(r+ " No es multiplo de " + 3);
			
			if (resta2==0)
				System.out.println(m+ " Es multiplo de " + 3);
			else 
				System.out.println(m+ " No es multiplo de " + 3);
			
			int n = X.nextInt();
			System.out.println("El valor dijitado es " + n);
			
			double y1 = (-m+(Math.sqrt(m*m-4*r*n)))/(2*r);
			double y2 = (-m-(Math.sqrt(m*m-4*r*n)))/(2*r);
			
			System.out.println(y1);
			System.out.println(y1);
			
		}
		
}
