package pineda;
public class Persona {
  
   String nombre;
   int edad;
   String sexo;
   int telefono;
  
  public Persona (String n, int e, String s, int t){
    this.nombre = n;
    this.edad = e;
    this.sexo = s;
    this.telefono = t;}
  
      public Persona (){ 
        this.nombre = ""; 
        this.edad = 30; 
        this.sexo ="masculino"; 
        this.telefono = 0; 
      }
      
      public Persona(String string, int i, String string2) {
		
	}

	public Persona(String string, int i) {
		
	}

	public Persona(String string, double d) {
		
	}

	public void cambiarEdad (int e){
        this.edad = e;
      }
      
      public String consultarNombre (){
        return nombre;
      }
      
      public int consultarEdad (){
        return edad;
      }
      
      public String consultarCiudad (){
        return sexo;
      }
      
      public int consultarTelefono (){
        return telefono;
      }
      

public static void main (String[] args){
	Persona p1 = new Persona ("Pepe", 37, "masculino", 611223344);
	Persona p2 = new Persona ("carlos",18,"masculino");

	System.out.println ("P1:");
	 System.out.println ("Nombre: "+p1.consultarNombre());
	    System.out.println ("Edad: "+p1.consultarEdad());

	    System.out.println ("P2:");
	    System.out.println ("Nombre: "+p2.consultarNombre());
	    System.out.println ("Edad: "+p2.consultarEdad());
	    System.out.println ("sexo: "+p2.consultarsexo());


}
class persona
{
	  
	  public void main (String[] args){
	    Persona p1 = new Persona ("Pepe", 37);
	    Persona p2 = new Persona ("carlos",18,"masculino");
	  
	    System.out.println ("P1:");
	    System.out.println ("Nombre: "+p1.consultarNombre());
	    System.out.println ("Edad: "+p1.consultarEdad());
	   
	  
	    System.out.println ("P2:");
	    System.out.println ("Nombre: "+p2.consultarNombre());
	    System.out.println ("Edad: "+p2.consultarEdad());
	    System.out.println ("sexo: "+p2.consultarsexo());
	  
	    p2.cambiarEdad(20);
	    System.out.println ("Edad P2: "+p2.consultarEdad());
	  }
	  
	}
public String consultarsexo() {
	return null;
}
} 
