import java.util.Scanner;

public class Ejercicio_temperaturas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] temperaturas = new double[7];

        for(int i = 0; i < 7; i++){
            System.out.println("Ingrese la temperatura del dia " + (i + 1) + ": ");
            temperaturas[i] = sc.nextDouble();
        }

        for(int i = 0; i < 7; i++){
            System.out.println("Dia " + (i + 1) + ": " + temperaturas[i]);
        }

        double suma = 0;
        for(int i = 0; i < 7; i++){
            suma += temperaturas[i];
        }
        System.out.println("Promedio: " + suma / 7);

        double masAlta = temperaturas[0];
        for(int i = 1; i < 7; i++){
            if(temperaturas[i] > masAlta){
                masAlta = temperaturas[i];
            }
        }
        System.out.println("Temperatura mas alta: " + masAlta);

        double masBaja = temperaturas[0];
        for(int i = 1; i < 7; i++){
            if(temperaturas[i] < masBaja){
                masBaja = temperaturas[i];
            }
        }
        System.out.println("Temperatura mas baja: " + masBaja);

        int diasCalurosos = 0;
        for(int i = 0; i < 7; i++){
            if(temperaturas[i] >= 30){
                diasCalurosos++;
            }
        }
        System.out.println("Dias calurosos: " + diasCalurosos);

        int diasFrios = 0;
        for(int i = 0; i < 7; i++){
            if(temperaturas[i] < 27){
                diasFrios++;
            }
        }
        System.out.println("Dias frios: " + diasFrios);

        sc.close();
    }
}