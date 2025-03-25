import java.util.Scanner;

public class main {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       System.out.println("digite seu nome");
        String nome = scan.nextLine();
        int idade = 23;
        System.out.printf(" seu nome é %s e você tem %d anos ", nome, idade);
    }
}