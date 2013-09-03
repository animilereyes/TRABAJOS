import java.util.Scanner;
public class Salario{
    //La variable ph es precio por hora y pe es el precio por hora extra.
    int ph=16, pe=20,Total;
    public void Calcular(int n){
        /*Verifica si el número de horas es menor de 40, 
        en caso de ser mayor se calcularan las horas extras*/
        if(n<=40){
        Total=n*ph;
        System.out.println("El salario total es: "+Total);
        }else{
            Total=pe*(n-40)+40*ph;
            System.out.println("El salario total es: "+Total);
        }
    }
    public static void main(String[] args){
          Salario sueldo=new Salario();
          System.out.println("Precio por hora:"+sueldo.ph+"\nHora extra:"+sueldo.pe);
          Scanner leer=new Scanner(System.in);
          System.out.println("Escribe las horas trabajadas");
          int horas=leer.nextInt();
          sueldo.Calcular(horas);
    }
}