import  java.util.Scanner;

public class Validação {
    public static void main (String[] args){
         Scanner entrada = new Scanner(System.in);
         System.out.println("<--Validação de senha-->");
         System.out.println("Me informe a sua senha:");
         String senha = entrada.next();
         if (senha.equals("Pepino")){
             System.out.println("Acesso permitido.");
         } else {
             System.out.println("Acesso negado.");
         }
    }
}
