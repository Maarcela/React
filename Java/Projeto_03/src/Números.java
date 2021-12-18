import java.util.Scanner;

public class Números {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);

        int num1, num2, num3;
        System.out.print("Informe o primeiro número:");
        num1 = entrada.nextInt();
        System.out.print("Informe o segundo número:");
        num2 = entrada.nextInt();
        System.out.print("Informe o terceiro número:");
        num3 = entrada.nextInt();

        if ( num1 == num2 && num1 == num3){
            System.out.print("Os números são iguais");
        } else {
            if (num1 > num2 && num1 > num3){
                System.out.print("O número: " + num1 + ", é o maior");
            }else{
                if (num2> num1 && num2> num3){
                    System.out.print("O número: " + num2 + ", é o maior");
                } else {
                    System.out.print("O número: " + num3 + ", é o maior");
                }
            }
        }
        entrada.close();
    }
}

