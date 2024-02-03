import java.util.Scanner;

public class AboutYou {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome:");

        String name = scanner.nextLine();

        System.out.println("Ola, "+ name);

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");

        String idade = scanner1.nextLine();

        System.out.println( "Seu nome é: "+ name + " e sua idade é "+ idade + " anos" + ".");

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Qual é a sua profissão?");

        String profissao = scanner2.nextLine();

        System.out.println( "Seu nome é: "+ name + " sua idade é "+ idade + " anos" + " e sua profissão é "+ profissao + ".");







    }

}

