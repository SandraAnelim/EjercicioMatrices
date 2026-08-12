import java.util.Scanner;


public class Menu {
    public static void main(String[] args) {
       boolean continuar = true;
       Scanner sc = new Scanner(System.in);
       metodos m = new metodos();
       int n =0;
       System.out.println("Ingrese el tamaño de la matriz");
         n = sc.nextInt();
         int[][] ME = new int[n][n];
         objmatriz[][] MO = new objmatriz[n][n];
         while (continuar) {
            System.out.println("Que desea realizar 1: LLenar matriz de enteros"
                    + " 2: Mostrar matriz de enteros"
                    + " 3: LLenar matriz de objetual"
                    + " 4: Mostrar matriz de objetual");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    ME = m.LLenarMatriz(ME);
                    break;
                case 2:
                    m.MostrarMatrizEntera(ME);
                    break;
                case 3:
                    MO = m.LLenarMatrizObjetual(MO);
                    break;
                case 4:
                    m.MostrarMatrizObjetual(MO);
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    continuar = false;
                    break;

                    default:
                        System.out.println("Opcion no valida");
                        break;
            }
         }

    }
}
