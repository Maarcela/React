import java.util.Scanner;

public class Decrescente {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double num5, num4;
        System.out.print("Informe um número, por favor:");
        num5 = entrada.nextDouble();
        System.out.print("Me inforne outro número por favor:");
        num4 = entrada.nextDouble();
        if (num5 > num4){
            System.out.print(" A ordem descrescente é:" + num5 + "," + num4);
        } else {
            System.out.print("A ordem decrescente é:" + num4 + "," + num5);
        }
        entrada.close();
    }
}
