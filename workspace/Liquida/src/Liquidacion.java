
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Liquidacion {

	public static void main(String[] args) throws Exception {
		int numEmple;
		String[] cedula = new String[50];
		String[] apellido = new String[50];
		String[] nombre = new String[50];
		double[] horasTrabajadas = new double[50];
		double[] sueldoxHora = new double[50];	
		
		String cedula1, nombre1, apellido1;
		double horas, sueldo;
		double total=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Digite numero de empleados");
		numEmple = Integer.valueOf(br.readLine()).intValue();
		
		for(int i=0;i<numEmple;i++){
			System.out.print("\nDigite la cedula del empleado:");
			cedula1 = br.readLine();
			
			System.out.print("\nDigite el nombre del empleado:");
			nombre1 = br.readLine();
			
			System.out.print("\nDigite el apellido del empleado:");
			apellido1 = br.readLine();
			
			System.out.print("\nDigite el numero de horas del empleado:");
			horas = Double.valueOf(br.readLine()).doubleValue();
			
			System.out.print("\nDigite el sueldo por hora del empleado:");
			sueldo = Double.valueOf(br.readLine()).doubleValue();
			
			cedula[i] = cedula1;
			apellido[i] = apellido1;
			nombre[i] = nombre1;
			horasTrabajadas[i] = horas;
			sueldoxHora[i] = sueldo;
			
			
			
		}
		
		
		for(int i=0; i<numEmple;i++){
			total = total+sueldoxHora[i]*horasTrabajadas[i];
		System.out.println("\nLa nomina total es:"+total+"y su cedula es:"+cedula[i]);
		}	
	}

}