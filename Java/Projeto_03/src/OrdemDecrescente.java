import java.util.Scanner;
public class OrdemDecrescente {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        float num1, num2;
        System.out.print("Informe um número, por favor:");
        num1 = entrada.nextFloat();
        System.out.print( "Me informe outro número, por favot:");
        num2 = entrada.nextFloat();

        if (num1 > num2){
            System.out.print( "A ordem decrescente seria:" + num1 + "," + num2);
        } else {
            System.out.print("A ordem decrescente do número seria:" + num1 + "," + num2);
        }
        entrada.close();
    }
}
