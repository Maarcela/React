import java.util.Scanner;
public class Peso {
    public static void main(String[] args){
         Scanner entrada = new Scanner(System.in);

         float altura, pesof, pesom; int sexo;

         System.out.print("Me informe a sua altura, por favor:");
         altura = entrada.nextFloat();
         System.out.println(" === Sexp: ===");
         System.out.println("1- Feminino");
         System.out.println("2- Masculino");
         System.out.println(" === Me informe o número de sua escolha ===");
         sexo = entrada.nextInt();

         switch (sexo){
             case 1:
             pesof = (float) ((86 * altura) - 1.62);
             System.out.println(" O seu peso ideal com base na sua altura, seria:" + pesof);
             break;

             case 2:
             pesom = (float) ((98 * altura ) - 1.71);
             System.out.println( "Seu peso ideal com base na sua altura, seria:" + pesom);
             break;

             default:
                 System.out.println(" Opção escolhida inválida, verifique as opções escolhidas e tente npvamente.");
         }
         entrada.close();
    }
}
