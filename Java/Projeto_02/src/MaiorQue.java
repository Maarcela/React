import java.util.Scanner;

public class MaiorQue {
    public static void main( String[] args){
         Scanner entrada = new Scanner(System.in);
         double num, calculo;
         System.out.print("Me informe um número, por favor!");
         num = entrada.nextDouble();
         if (num > 20){
             calculo = num / 2;
             System.out.println("O valor informado é maior que o limite informado, a metade é:" + calculo);
         } else {
             System.out.println("Não pode ser menor que (20)");
         }
         entrada.close();
    }
}
