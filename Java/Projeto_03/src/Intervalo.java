import java.util.Scanner;

public class Intervalo {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero;
         System.out.print("Me informe um número inteiro:");
         numero = entrada.nextInt();
          if (numero >= 21 && numero <= 67){
              System.out.println("Pertence ao intervalo");
          } else {
              System.out.println("Não pertence ao intervalo");
          }
          entrada.close();
    }
}
