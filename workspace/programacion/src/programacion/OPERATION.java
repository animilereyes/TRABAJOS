package programacion;

	public class OPERATION {
		int A=10,B=5,C=15;
		public static void		main (String m[]){
			OPERATION t=new OPERATION ();
			t.x = 7;
			t.y = 8;
			t.suma();
			t.resta();
			t.multiplicacion();
			t.division(); 
		}
	
	
		
	    public  void suma(){
		   int r;
		   r= x+y;
	    
	     System.out.println ("la_suma_es"+r);
	    } 
	    public void resta(){
			   int r;
			   r= x-y;
			   System.out.println ("la resta es"+r);
	    }
	    public void multiplicacion(){
			   int r;
			   r= x*y;
			   System.out.println ("la multiplicacion es"+r);
	    }
	    public void division(){
			   int r;
			   r= x*y;
			   System.out.println ("la division es"+r);
	    }
	}
	    
		
	
		

  
	