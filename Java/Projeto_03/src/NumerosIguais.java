import java.util.Scanner;
public class NumerosIguais {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, diferença;

        System.out.print("Informe um número, por favor:");
        num1 = entrada.nextInt();
        System.out.print("Informe outro número, por favor:");
        num2 = entrada.nextInt();

        if (num1 == num2) {
            System.out.print("Números iguais");
        } else {
            if (num1 > num2) {
                diferença = num1 - num2;
                System.out.print("Os números não são iguais, e a diferença do maior para o menor seria:" + diferença);
            } else {
                    diferença = num1 - num2;
                    System.out.print("Os números não são iguais, e a diferença do maior para o menor seria:" + diferença);
                }
            }
            entrada.close();
        }
    }
