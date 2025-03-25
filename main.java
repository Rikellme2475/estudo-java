import java.util.Scanner;

public class main {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       System.out.println("digite seu nome");
       String nome = scan.nextLine();
       System.out.println("digite sua idade");
       String idadeStr = scan.nextLine();
       int idade = Integer.parseInt(idadeStr);
    //    System.out.println("numero: " + idade);
        System.out.printf(" seu nome é %s e você tem %d anos ", nome, idade);
  
    }
}
 
